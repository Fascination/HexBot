package fascfighter;

import java.util.Arrays;

import org.hexbot.api.input.Mouse;
import org.hexbot.api.methods.Calculations;
import org.hexbot.api.methods.GroundItems;
import org.hexbot.api.methods.Menu;
import org.hexbot.api.methods.Npcs;
import org.hexbot.api.methods.Players;
import org.hexbot.api.util.Time;
import org.hexbot.api.wrapper.Entity;
import org.hexbot.api.wrapper.GroundItem;
import org.hexbot.api.wrapper.InventoryItem;
import org.hexbot.api.wrapper.Locatable;
import org.hexbot.api.wrapper.Npc;

public class Methods {

	public static Npc enemy = Npcs.getNearest(Variables.npcToKill);
	public static GroundItem loot = GroundItems.getNearest(Variables.lootID);
	
	public static Npc npcGetNearest(Npc[] array){
        int best = 0;
        double bestDistance = 100000;
        for(int i=0;i<array.length-1;i++){
                if(array[i]!=null && Calculations.distanceTo(array[i])<bestDistance){
                        best=i;
                        bestDistance = Calculations.distanceTo(array[i]);
                }
        }
        return array[best];
}
	
	public static boolean openGroundItemMenu(GroundItem e, boolean fast) {
		if (e != null) {
			if (fast) {
				Mouse.hop(e.getLocation().getScreenLocation());
				Mouse.click(false);
				return Menu.isMenuOpen();
			} else {
				Mouse.click(e.getLocation().getScreenLocation(), false);
				return Menu.isMenuOpen();
			}
		}
		return false;
	}
	
	public static boolean openInventoryMenu(InventoryItem e, boolean fast) {
		if (e != null) {
			if (fast) {
				Mouse.hop(e.getPoint());
				Mouse.click(false);
				return Menu.isMenuOpen();
			} else {
				Mouse.click(e.getPoint(), false);
				return Menu.isMenuOpen();
			}
		}
		return false;
	}
	
	
	public static boolean openMenu(Entity e, boolean fast) {
		if (e != null) {
			if (fast) {
				Mouse.hop(e.getScreenLocation());
				Mouse.click(false);
				return Menu.isMenuOpen();
			} else {
				Mouse.click(e.getScreenLocation(), false);
				return Menu.isMenuOpen();
			}
		}
		return false;
	}
	
	
	
	public static boolean isInCombat() {
		return Players.getLocal().getInteractingIndex() != -1;
	}

	public static boolean PlayerisIdle() {
		return Players.getLocal().getInteractingIndex() == -1;
	}

	public static boolean lootNow(){
		if(loot != null){
			return true;
		}
		
		return false;
	}

	/*
	 * add this when canReach() comes out
	 * 
	 * public static boolean isReachable(Tile location){ for(int i = 01; i <= 1;
	 * i++){ for (int j = -1; j <= 1; j++){ if (enemy.getLocation().derive(i,
	 * j).canReach()){ return true; } } }
	 * 
	 * return false;
	 * 
	 * }
	 */

	public static int[] toIntArray(final String input) {
		final String[] strings = input.replaceAll(" ", "").split(",");
		final int[] array = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			try {
				array[i] = Integer.parseInt(strings[i]);
			} catch (final NumberFormatException e) {
				array[i] = -1;
			}
		}
		return array;
	}

	public static boolean contains(final int[] array, final int key) {
		Arrays.sort(array);
		return Arrays.binarySearch(array, key) != -1;
	}

	
	
	public void Interact(Locatable b, String i) {
		if (b != null) {
			Mouse.click(b.getLocation().getScreenLocation(), false);
			Time.sleep(500, 750);
			if (Menu.isMenuOpen()) {
				if (Menu.optionsContains(i)) {
					Menu.click(i);
					Time.sleep(500, 750);
				}
			}

		}
	}

}
