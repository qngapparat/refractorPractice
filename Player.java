public class Player {
	public int wins; // # of wins
	public int currentChoice;
	/**
	 * Randomly choose rock, paper, or scissors
	 */
	public void randomChoice() {

		this.currentChoice = (int) (Math.random() * 3);

	}

	public int setWins() {
		return wins++;
	}

	public int getWins() {
		return (wins);
	}

	public String toString(){
	    if(currentChoice == 0){
	        return "Rock";
        }
        if(currentChoice == 1){
            return "Paper";
        }
        if(currentChoice == 2){
            return "Scissor";
        }
        if(currentChoice == 3){
            return "Lizard";
        }
        if(currentChoice == 4){
            return "Spock";
        }

        //expand here
        return null;
	}
}
