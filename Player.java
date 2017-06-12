public class Player {
	int wins; // # of wins
	int winTotal;
	public String currentChoice;
	/**
	 * Randomly choose rock, paper, or scissors
	 */
	public void randomChoice() {
		String choice = "";
		int c = (int) (Math.random() * 3);
		switch (c) {
		case 0:
			this.currentChoice = ("rock");
			break;
		case 1:
			this.currentChoice = ("paper");
			break;
		case 2:
			this.currentChoice = ("scissors");
			break;
		}
		return;
	}

	public int setWins() {
		int winTotal = wins++;
		return winTotal;
	}

	public int getWins() {
		return (wins);
	}
}
