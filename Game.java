public class Game {

    //change to 5 for Lizard + Spock addition
    int maxTypes = 3;

    int draw = 0;
    int roundsPlayed = 0;
    boolean gameWon = false;

    public Game(){

    }

    public void printHeader(Game myGame, Player p1, Player p2){

        System.out.println("***** Round: " + myGame.roundsPlayed + " *********************\n");
        System.out.println("Number of Draws: " + myGame.draw + "\n");
        p1.randomChoice();
        System.out.println("Player 1: " + p1.toString() + "\t Player 1 Total Wins: " + p1.wins);
        p2.randomChoice();
        System.out.println("Player 2: " + p2.toString() + "\t Player 2 Total Wins: " + p2.wins);
    }

    public void evaluate(Player p1, Player p2) throws Exception {

        //see https://stackoverflow.com/questions/9553058/scalable-solution-for-rock-paper-scissor/9553712#9553712 for more info on the circular principle used here.

        //must be odd in order to work
        if((maxTypes%2) == 0){
            throw new Exception("Number of possibilities must be odd");
        }

        int result = (maxTypes + p1.currentChoice - p2.currentChoice) % maxTypes;

        //it's a draw. Stats will be updated by isDraw
        if(result == 0){
           return;
        }

        else if((result%2) == 1){
            p1.wins++;
        }

        else if((result%2) == 0){
            p2.wins++;
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


	public static void main(String args[]) throws Exception{

        Player p1 = new Player();
		Player p2 = new Player();
		Game myGame = new Game();

		do {

            p1.randomChoice();
            p2.randomChoice();

            myGame.printHeader(myGame, p1, p2);

            try{
                myGame.evaluate(p1, p2);
            }

            catch(Exception e){
                throw new Exception(e);
            }
            myGame.isDraw(myGame, p1, p2);
			myGame.updateGameStats(myGame, p1, p2);

		} while (!myGame.gameWon);
	}
}
