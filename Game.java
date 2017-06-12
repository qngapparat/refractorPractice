public class Game {

    int draw = 0;
    int roundsPlayed = 0;
    boolean gameWon = false;

    public Game(){

    }

    public void printHeader(Game myGame, Player p1, Player p2){

        System.out.println("***** Round: " + myGame.roundsPlayed + " *********************\n");
        System.out.println("Number of Draws: " + myGame.draw + "\n");
        p1.randomChoice();
        System.out.println("Player 1: " + p1.currentChoice + "\t Player 1 Total Wins: " + p1.wins);
        p2.randomChoice();
        System.out.println("Player 2: " + p2.currentChoice + "\t Player 2 Total Wins: " + p2.wins);
    }

    public void evaluate(Player p1, Player p2){

        //doesn't really make sense to cut this in half etc or to compress it, which would be a tradeoff for readability.
        if ((p1.currentChoice.equals("rock")) && (p2.currentChoice.equals("paper"))) {
            System.out.println("Player 2 Wins");
            p2.wins++;
        } else if ((p1.currentChoice.equals("paper")) && (p2.currentChoice.equals("rock"))) {
            p1.wins++;
            System.out.println("Player 1 Wins");
        } else if ((p1.currentChoice.equals("rock")) && (p2.currentChoice.equals("scissors"))) {
            p1.wins++;
            System.out.println("Player 1 Wins");
        } else if ((p1.currentChoice.equals("scissors")) && (p2.currentChoice.equals("rock"))) {
            p2.wins++;
            System.out.println("Player 2 Wins");
        } else if ((p1.currentChoice.equals("scissors")) && (p2.currentChoice.equals("paper"))) {
            p1.wins++;
            System.out.println("Player 1 Wins");
        } else if ((p1.currentChoice.equals("paper")) && (p2.currentChoice.equals("scissors"))) {
            p2.wins++;
            System.out.println("Player 2 Wins");
        }

    }

    public void isDraw(Game myGame, Player p1, Player p2){
        if (p1.currentChoice == p2.currentChoice) {
            myGame.draw++;
            System.out.println("\n\t\t\t Draw \n");
        }
    }

    public void updateGameStats(Game myGame, Player p1, Player p2){

        myGame.roundsPlayed++;
        if ((p1.getWins() >= 3) || (p2.getWins() >= 3)) {
            myGame.gameWon = true;
            System.out.println("GAME WON");
        }
        System.out.println();
    }


	public static void main(String args[]) {

        Player p1 = new Player();
		Player p2 = new Player();
		Game myGame = new Game();

		do {

            p1.randomChoice();
            p2.randomChoice();

            myGame.printHeader(myGame, p1, p2);

            myGame.evaluate(p1, p2);
            myGame.isDraw(myGame, p1, p2);
			myGame.updateGameStats(myGame, p1, p2);

		} while (!myGame.gameWon);
	}
}
