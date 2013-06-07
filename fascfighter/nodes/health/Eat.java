package fascfighter.nodes.health;

import org.hexbot.api.methods.Inventory;
import org.hexbot.api.methods.Menu;
import org.hexbot.api.methods.Players;
import org.hexbot.api.util.Time;
import org.hexbot.api.wrapper.InventoryItem;

import fascfighter.Methods;
import fascfighter.Variables;

public class Eat {

	public static void EatFood(){
		
		InventoryItem food = Inventory.getItem(Variables.foodID);
	
		/*if(Inventory.contains(Variables.food_meat)){
			Inventory.getItem(Variables.food_meat).interact("Eat");
		} 
		
		if(Inventory.contains(Variables.food_chicken)){
			Inventory.getItem(Variables.food_chicken).interact("Eat");
		}
		*/
		
	if(Players.getLocal().getHp() < 10){
		Variables.Status = "Health checking..";
		if(food != null){
			Methods.openInventoryMenu(food, false);
			if(Menu.isMenuOpen() && Menu.optionsContains("Eat")){
				
					Menu.click("Eat");
					Variables.Status = "Eating Food..";
					Time.sleep(400, 900);
				
			} else if (Menu.isMenuOpen() && !Menu.actionsContains("Eat")){
				Menu.click("Cancel");
			}
		}
	}
		
		
	}
	
}
