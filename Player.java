public class Player {
	public int wins; // # of wins
	public String currentChoice;
	/**
	 * Randomly choose rock, paper, or scissors
	 */
	public void randomChoice() {
		String choice = "";
		int c = (int) (Math.random() * 3);
		switch (c) {
		case 0:
			choice = ("rock");
			break;
		case 1:
			choice = ("paper");
			break;
		case 2:
			choice = ("scissors");
			break;
		}
		this.currentChoice = choice;
	}

	public int setWins() {
		return wins++;
	}

	public int getWins() {
		return (wins);
	}
}
