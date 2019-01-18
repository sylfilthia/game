import java.util.Scanner;
public class GameRunner {
static Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("////////////////Welcome to The Game/////////////////");
		System.out.println("///Here are a list of commands to get you started///" + "\n");
		System.out.println("1- New Game" + "\n" + "2- Load a Save" + "\n" + "3- Continue");
		if (keyboard.nextInt()== 1){
			System.out.println("Starting new game..." + "\n");
			NewGame.charactercreation();
			
			System.out.println("Now that you have created your character, it's time to start killing!" + "\n" +
					"Start by equipping a weapon by typing 'Inventory.'");
			if (keyboard.next().equals("Inventory")) {
				Inventory.navigationandcommands();
			}
		}

	}

}
