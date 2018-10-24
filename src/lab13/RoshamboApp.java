package lab13;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
//Declare/initialize variables.
		Players user = new Human();
		Players opponent;
		Roshambo userValue;
		Roshambo opponentValue;
		String userName;
		Scanner sc = new Scanner(System.in);
		// prompt user to enter name. validate input
		userName = Validator.getString(sc, "Please enter your name: ");
		user.setName(userName);
		// prompt user to select rockpaperscissors. Validate input
		String userChoice = Validator.getString(sc, "Would you like to play against The Dogs or The Cats? (D/C)");
		if (userChoice.equalsIgnoreCase("D")) {
			opponent = new Rockhead();
			System.out.println("You're up against Rockhead!");
		}
		if (userChoice.equalsIgnoreCase("C")) {
			opponent = new SmartyPants();
			System.out.println("You're against SmartPants!");
		} else {
			System.out.println("Invalid input....");
		}
		String userInput = Validator.getString(sc, "Rock, Paper, or Scissors? (R/P/S)");
		// Display opponents choice
		if (opponent = Rockhead()) {

		} else if (opponent = SmartyPants()) {

		}
		// Display user's choice
		Human;
		// Display results of match
		// write a separate method
		// continue? validate input

	}

}
