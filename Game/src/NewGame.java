import java.util.Scanner;
public class NewGame {

static Scanner keyboard = new Scanner(System.in);
static String playerrace = null;
static int raceanswer = 0;
static String playerclass = null;
static int classanswer = 0;
static String playername = null;

	public static void charactercreation() {
		System.out.println("What is your race?");
		System.out.println("1- Human (+1 mana)." + "\n" + "2- Dwarf (+1 health)." + "\n" + "3- High Elf (+1 spellpower)." + "\n" + "4- Orc (+1 player damage).");
		int raceanswer = keyboard.nextInt();

		if (raceanswer == 1) {
			playerrace = "Human";
			GameVariables.playermana ++;
		}
		if (raceanswer == 2) {
			playerrace = "Dwarf";
			GameVariables.playerhealth ++;
		}
		if (raceanswer == 3) {
			playerrace = "High Elf";
			GameVariables.playerspellpower ++;
		}
		if (raceanswer == 4) {
			playerrace = "Orc";
			GameVariables.playerdamage ++;
		}
		
		System.out.println("You are a " +playerrace + ".");
		System.out.println("What is your class?");
		System.out.println("1- Warrior  (+10 melee damage)." + "\n" + "2- Ranger (+10 marksmanship, +5 melee)." + "\n" + "3- Mage  (+10 player spellpower, +50 player mana).");
		int classanswer = keyboard.nextInt();
		if (classanswer == 1) {
			playerclass = "Warrior";
			GameVariables.playermelee +=10;
		}
		if (classanswer == 2) {
			playerclass = "Ranger";
			GameVariables.playermelee+=5;
			GameVariables.playermarksmanship +=10;
		}
		if (classanswer == 3) {
			playerclass = "Mage";
			GameVariables.playerspellpower +=10;
			GameVariables.playermana +=50;
		}
		System.out.println("You are a " +playerclass + ".");
		
		System.out.println("What is it that you call yourself?");
		playername = keyboard.next();
		System.out.println("//////////////////FINALIZING CREATION///////////////");
		System.out.println ("You are a " + playerrace + " " + playerclass + " whose name is " + playername + ".");
		System.out.println("Are you sure this is who you want to be? (y/n)");
		
		String yesorno = keyboard.next();
		if (yesorno.equals("Y")||yesorno.equals("y")){
			System.out.println("Greetings, " +playername);
		}
		if (yesorno.equals("N")||yesorno.equals("n")){
			System.out.println("Restarting Character Creation Process...");
			NewGame.charactercreation();
		}
	}
}
