package mark.rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors {

    private int numberOfRounds = 0;
    private int playerOneWins = 0;
    private int playerTwoWins = 0;
    private int numberOfDraws = 0;


    private String result = "";
    private String playerOne = "";
    private String playerTwo = "";

    public RockPaperScissors(String playerOne, String playerTwo) {

        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }


    public void getNumberOfRounds() {
        System.out.println("The number of rounds is: " + numberOfRounds);
    }


    public void getPlayerOneWins() {
        System.out.println(playerOne + " has won " + playerOneWins + " rounds");
    }

    public void getPlayerTwoWins() {

        System.out.println(playerTwo + " has won " + playerTwoWins + " rounds");
    }

    public void getNumberOfDraws() {
        System.out.println("The number of draws is: " + numberOfDraws);
    }

    public void playGame() {


        Scanner scanner = new Scanner(System.in);

        while (true) {


            System.out.println(playerOne + " - Enter your choice: rock, paper or scissors");
            String player1 = scanner.nextLine();
            System.out.println(playerTwo + " - Enter your choice: rock, paper or scissors");
            String player2 = scanner.nextLine();

            if (player1.equals("rock") && player2.equals("rock")) {
                result = "It's a draw";
                System.out.println(result);
                numberOfDraws++;
            } else if (player1.equals("rock") && player2.equals("paper")) {
                result = player2 + " wins";
                System.out.println(result);
                playerTwoWins++;
            } else if (player1.equals("rock") && player2.equals("scissors")) {
                result = player1 + " wins";
                System.out.println(result);
                playerOneWins++;
            } else if (player1.equals("paper") && player2.equals("rock")) {
                result = player1 + " wins";
                System.out.println(result);
                playerOneWins++;
            } else if (player1.equals("paper") && player2.equals("paper")) {
                result = "It's a draw";
                System.out.println(result);
                numberOfDraws++;
            } else if (player1.equals("paper") && player2.equals("scissors")) {
                result = player2 + " wins";
                System.out.println(result);
                playerTwoWins++;
            } else if (player1.equals("scissors") && player2.equals("rock")) {
                result = player2 + " wins";
                System.out.println(result);
                playerTwoWins++;
            } else if (player1.equals("scissors") && player2.equals("paper")) {
                result = player2 + " wins";
                System.out.println(result);
                playerOneWins++;
            } else if (player1.equals("scissors") && player2.equals("scissors")) {
                result = "It's a draw";
                System.out.println(result);
                numberOfDraws++;
            } else {
                System.out.println("Invalid input");
            }

            numberOfRounds++;
            getPlayerOneWins();
            getPlayerTwoWins();
            getNumberOfDraws();
            getNumberOfRounds();

            if (playerOneWins == 3 || playerTwoWins == 3) {
                System.out.println("Game over");
                if (playerOneWins == 3) {
                    System.out.println(playerOne + " is the winner");

                } else if (playerTwoWins == 3) {
                        System.out.println(playerTwo + " is the winner");
                        break;
                    }
            }

//        end of while loop
        }

    }

}







