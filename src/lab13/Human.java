package lab13;

import java.util.Scanner;

public class Human extends Players {
	private Scanner sc;

	@Override
	public Roshambo generateRoshambo() {
		sc = new Scanner(System.in);
		String userInput = Validator.getString(sc, "Rock, Paper, or Scissors? (R/P/S)");
		if (userInput.equalsIgnoreCase("R")) {
			return Roshambo.ROCK;
		} else if (userInput.equalsIgnoreCase("P")) {
			return Roshambo.PAPER;
		} else if (userInput.equalsIgnoreCase("S")) {
			return Roshambo.SCISSORS;
		}

		return null;
	}

}
