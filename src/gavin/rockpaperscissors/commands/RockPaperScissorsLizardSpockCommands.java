package gavin.rockpaperscissors.commands;

import gavin.rockpaperscissors.Play;
import gavin.rockpaperscissors.commands.Commands;
import gavin.rockpaperscissors.moves.*;

public class RockPaperScissorsLizardSpockCommands extends Commands {
    public RockPaperScissorsLizardSpockCommands() {
        super("Rock, Paper, Scissors, Lizard, Spock", new String[]{"Rock","Paper","Scissors", "Lizard", "Spock"}, "rockPaperScissorsLizardSpock");
    }

    @Override
    public void run() {
        printMessage("Welcome to rock, paper scissors!");
        printMessage("Best of 3. Good luck!");

        int userWins = 0;
        int cpuWins = 0;

        String cpuMove = "";
        boolean win = false;

        while (userWins + cpuWins <= 2) {
            printMessage("Select a move: ");
            printCommands();

            int cpuInput = (int) (Math.random()*5+1);
            switch (cpuInput) {
                case 1:
                    cpuMove = String.valueOf(Play.Rock);
                    break;
                case 2:
                    cpuMove = String.valueOf(Play.Paper);
                    break;
                case 3:
                    cpuMove = String.valueOf(Play.Scissors);
                    break;
                case 4:
                    cpuMove = String.valueOf(Play.Lizard);
                    break;
                case 5:
                    cpuMove = String.valueOf(Play.Spock);
                    break;
            }

            int userInput = getIntegerInput();
            switch (userInput) {
                case 1:
                    Rock rock = new Rock(cpuMove);
                    printMessage(rock.printMoves());
                    win = rock.checkWin();
                    break;
                case 2:
                    Paper paper = new Paper(cpuMove);
                    printMessage(paper.printMoves());
                    win = paper.checkWin();
                    break;
                case 3:
                    Scissors scissors = new Scissors(cpuMove);
                    printMessage(scissors.printMoves());
                    win = scissors.checkWin();
                    break;
                case 4:
                    Lizard lizard = new Lizard(cpuMove);
                    printMessage(lizard.printMoves());
                    win = lizard.checkWin();
                    break;
                case 5:
                    Spock spock = new Spock(cpuMove);
                    printMessage(spock.printMoves());
                    win = spock.checkWin();
                    break;
            }

            if (userInput == cpuInput) {
                printMessage("Draw!");
            } else if (!win) {
                printMessage("CPU Wins!");
                cpuWins +=1;
            } else {
                printMessage("You Win!");
                userWins +=1;
            }

            printMessage("User Score: " + userWins + "\nCPU Score: " + cpuWins);
        }

        if (userWins>cpuWins) {
            printMessage("You win!");
        } else {
            printMessage("CPU wins! You lost, better luck next time!");
        }
    }
}
