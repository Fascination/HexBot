package fascfighter;

import org.hexbot.api.util.Timer;




public class Variables {

	// ints
	public static int npcToKill[] = {};
	
	public static String npcName = npcToKill.toString();
	public static int killCount = 0;
	public static int lootID[] = {};
	public static int foodID = 0;
	public static String action = "";

	public static int food_salmon;
	public static int food_trout;
	public static int food_meat = 2143;
	public static int food_chicken = 2141;

	// booleans
	public static boolean GUIFinished = false;
	public static boolean lootNow = false;

	// Misc
	public static long startTime = 0;
	public static Timer runTime = null;
	public static Timer failsafeTimer;

	public static int FoodId;
	public static int foodToEat = 0;

	public static String Status = "";

	// Path and Areas

}
