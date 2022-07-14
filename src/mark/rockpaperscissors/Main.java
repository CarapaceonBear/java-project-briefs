package mark.rockpaperscissors;



public class Main {
    public static void main(String[] args) {
        System.out.println("Let's solve rock-paper-scissors");
        System.out.println("First Player to win three rounds is the winner!!");



        // Create a new game
        RockPaperScissors rockPaperScissors = new RockPaperScissors("Mark", "Jude");

        // Play the game
        rockPaperScissors.playGame();

//
//        // Print the score
//        rockPaperScissors.getScore();
//
//
//
//
        rockPaperScissors.getPlayerOneWins();
        rockPaperScissors.getPlayerTwoWins();

        // Print the number of draws
        rockPaperScissors.getNumberOfDraws();
        // Print the number of rounds
        rockPaperScissors.getNumberOfRounds();








    }

}
