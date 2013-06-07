package fascfighter.nodes.combat;

import java.util.Arrays;

import org.hexbot.api.input.Mouse;
import org.hexbot.api.methods.Camera;
import org.hexbot.api.methods.GroundItems;
import org.hexbot.api.methods.Menu;
import org.hexbot.api.methods.Npcs;
import org.hexbot.api.methods.Players;
import org.hexbot.api.methods.Walking;
import org.hexbot.api.util.Filter;
import org.hexbot.api.util.Random;
import org.hexbot.api.util.Time;
import org.hexbot.api.wrapper.GroundItem;
import org.hexbot.api.wrapper.Locatable;
import org.hexbot.api.wrapper.Npc;

import fascfighter.Variables;


public class Attack {

	private static final Filter<Npc> NPC_FILTER = new Filter<Npc>() {
		public boolean accept(final Npc npc) {
			// Arrays.binarySearch(int[], int) will return -1 if the given array
			// doesn't
			// contain the given element
			return Arrays.binarySearch(Variables.npcToKill, npc.getId()) != -1
					&& npc.getInteracting() == null	;

			// return npc != null && npc.getId() == 1 &&
			// npc.getName().equals(Variables.npcName)
			// && npc.getInteracting() == null;

		}
	};
	
	private static final Filter<Npc> Filter = new Filter<Npc>(){

		@Override
		public boolean accept(Npc n) {
			return n.getId() == -1 && n != null && !n.isInCombat();

		}
		
	};

	public static void attack(){
		Npc enemy = Npcs.getNearest(Variables.npcToKill);
		
		
		if(enemy != null){
			if(!enemy.isOnScreen() && !enemy.isInCombat()){
				Variables.Status = "Finding closest npc";
				Camera.turnTo(enemy);
			} else {
				
			if(enemy.getDistance() < 5){
				if(Players.getLocal().getAnimation() == -1){
					final int angle = Camera.getAngle();
					System.out.println(angle);
					
					Variables.Status = "Attacking..";
					enemy.interact("Attack");
				}
			} else {
				Walking.walkTileMM(enemy);
			}
			}
			
			
		}
	}
	
	public static void attackNode() {
		Npc enemy = Npcs.getNearest(Variables.npcToKill);

		if (enemy != null) {
			if (!enemy.isInCombat() && !Players.getLocal().isMoving()) {
				if (enemy.isOnScreen()) {
					Variables.Status = "Attacking..";
					enemy.interact("Attack");
					//Mouse.click(enemy.getLocation().getScreenLocation());
					//interacts(enemy);

					Time.sleep(500, 600);
				} else {
					Variables.Status = "Turning Camera";
					Camera.turnTo(enemy);
				}
			}

		}

	}

	public static void attackNpc() {
		Npc a = Npcs.getNearest(41);
		/*
		 * if(a == null){ Variables.Status = "Null NPC"; } else {
		 * if(a.onScreen() && !a.isInCombat()){ Variables.Status =
		 * " Attacking NPC"; Mouse.click(a.getLocation().getScreenLocation()); }
		 * }
		 */

		a.click();
	}

	public static void attackNode_v1() {

		final Npc npc = Npcs.getNearest(NPC_FILTER);
		if (npc != null) {

			
				if (npc.isOnScreen() && npc.interact("Attack")) {
					if(Players.getLocal().isMoving()){
						Time.sleep(100);
					}
					Time.sleep(200);
				}
			 else {
				Walking.walkTileMM(npc.getLocation());
				final long end = System.currentTimeMillis()
						+ Random.nextInt(2000, 4000);
				while (System.currentTimeMillis() <= end) {
					if (npc.isOnScreen()) {
						break;
					}
				}
			}
		}
	}

	public static void attackNode_v2(){
		final Npc npc = Npcs.getNearest(Filter);
		
		if(Players.getLocal() != null && Players.getLocal().getInteracting() != null){
			npc.interact("Attack");
			Time.sleep(350, 500);
		}
	}
	
	public static void interacts(Locatable a) {
		GroundItem enemy = GroundItems.getNearest(Variables.npcToKill);

		if (enemy != null) {
			Mouse.move(enemy.getLocation().getScreenLocation());
			if (Menu.isMenuOpen()) {
				if (Menu.actionsContains("Attack")) {
					Mouse.click(Menu.click("Attack"));
				}
			} else {
				Menu.openMenu();
			}
		}
	}

}
