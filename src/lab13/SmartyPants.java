package lab13;

public class SmartyPants extends Players {

	@Override
	public Roshambo generateRoshambo() {
		int randNum = (int) Math.random() * 3;
		if (randNum == 0) {
			System.out.println(Roshambo.ROCK);
		}
		if (randNum == 1) {
			System.out.println(Roshambo.PAPER);
		}
		switch (randNum) {
		case 2:
			return Roshambo.SCISSORS;
		}
		return null;

	}

}
