package fascfighter.nodes.looting;

import org.hexbot.api.input.Mouse;
import org.hexbot.api.methods.Calculations;
import org.hexbot.api.methods.Camera;
import org.hexbot.api.methods.GroundItems;
import org.hexbot.api.methods.Menu;
import org.hexbot.api.methods.Npcs;
import org.hexbot.api.methods.Walking;
import org.hexbot.api.util.Time;
import org.hexbot.api.wrapper.GroundItem;
import org.hexbot.api.wrapper.Locatable;
import org.hexbot.api.wrapper.Npc;

import fascfighter.Methods;
import fascfighter.Variables;

public class LootMethod {

	public static void looting(){
		GroundItem loot = GroundItems.getNearest(Variables.lootID);
		String action = Variables.action;
		
		if(Methods.lootNow()){
			if(!loot.isOnScreen()){
				Variables.Status = "Finding closest loot";
				Camera.turnTo(loot);
			} else {
				Methods.openGroundItemMenu(loot, false);
				if(Menu.isMenuOpen() && Menu.optionsContains(action)){
					
						Menu.click("Take");
						Variables.Status = "Choosing " + action;
						Time.sleep(400, 900);
					
				} else if (Menu.isMenuOpen() && !Menu.actionsContains(action)){
					Menu.click("Cancel");
				}
			}
		}
	}
	
	public static void loot(){
		GroundItem loot = GroundItems.getNearest(Variables.lootID);
		
		if (loot != null) {
			if(loot.isOnScreen()){
				Variables.Status = "Found Loot";
						if (Calculations.distanceTo(loot) > 3) {
								Walking.walkTileMM(loot.getLocation());
						}
			
				loot.interact("Take");
			} else {
				Camera.turnTo(loot);
			}
		}
	}

	public static void interacts(Locatable a, String i){
		GroundItem loot = GroundItems.getNearest(Variables.lootID);
		
		if(loot != null){
			Mouse.move(loot.getLocation().getScreenLocation());
				if(Menu.isMenuOpen()){
					if(Menu.actionsContains("Take")){
						Mouse.click(Menu.click("Take"));
					}
				} else {
					Menu.openMenu();
				}
		}
	}
	
}