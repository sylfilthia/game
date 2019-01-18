import java.util.Scanner;
public class Inventory {
	static Scanner keyboard = new Scanner(System.in);
	public static void navigationandcommands() {
		System.out.println("Here are some commands for your inventory:: " + "\n" + "1- Equip");
		int navigation = keyboard.nextInt();
		
		if (navigation == 1) {
			Inventory.equip();
		}
		
	}
	
	public static void equip() {
		System.out.println("What item do you want to equip?");
//		System.out.println(obtaineditem);
		int equipitem = keyboard.nextInt();
		if (equipitem == Items.bluntironshortsword) {
			if ((Items.totalplayermelee - GameVariables.playermelee) >= 0) {
				System.out.println("You have gained " + (Items.totalplayermelee - GameVariables.playermelee) + " melee damage.");
				
			}
			if ((Items.totalplayermelee - GameVariables.playermelee) <= 0) {
				System.out.println("You have lost " + (Items.totalplayermelee - GameVariables.playermelee) + "melee damage.");
				
			}
			if ((Items.totalplayerhealth - GameVariables.playerhealth) >= 0) {
				System.out.println("You have gained " + (Items.totalplayerhealth - GameVariables.playerhealth) + " health points.");
			}
			System.out.println("You now have " + Items.totalplayermelee + " melee damage and " + Items.totalplayerhealth + " health points.");
		}
	}

}
