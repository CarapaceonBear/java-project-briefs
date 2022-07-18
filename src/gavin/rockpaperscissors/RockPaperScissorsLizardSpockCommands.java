package gavin.rockpaperscissors;

public class RockPaperScissorsLizardSpockCommands extends Commands{
    public RockPaperScissorsLizardSpockCommands() {
        super("Rock, Paper, Scissors, Lizard, Spock", new String[]{"Rock","Paper","Scissors", "Lizard", "Spock"}, "rockPaperScissorsLizardSpock");
    }

    @Override
    public void run() {
        printMessage("Welcome to rock, paper scissors!");
        printMessage("Best of 3. Good luck!");

        int userWins = 0;
        int cpuWins = 0;

        while (userWins + cpuWins <= 2) {
            printMessage("Select a move: ");
            printCommands();

            int userInput = getIntegerInput();
            switch (userInput) {
                case 1:
                    printMessage("You played Rock!");
                    break;
                case 2:
                    printMessage("You played Paper!");
                    break;
                case 3:
                    printMessage("You played Scissors!");
                    break;
            }

            int cpuInput = (int) (Math.random()*3+1);
            switch (cpuInput) {
                case 1:
                    printMessage("CPU played Rock!");
                    break;
                case 2:
                    printMessage("CPU played Paper!");
                    break;
                case 3:
                    printMessage("CPU played Scissors!");
                    break;
            }

            if (userInput == cpuInput) {
                printMessage("Draw!");
            } else if (userInput == 1 && cpuInput == 2) {
                printMessage("Paper beats rock! CPU Wins!");
                cpuWins +=1;
            } else if (userInput == 1 && cpuInput == 3) {
                printMessage("Rock beats Scissors! You Win!");
                userWins +=1;
            }
            else if (userInput == 2 && cpuInput == 1) {
                printMessage("Paper beats rock! You Win!");
                userWins +=1;
            }
            else if (userInput == 3 && cpuInput == 1) {
                printMessage("Rock beats Scissors! CPU Wins!");
                cpuWins +=1;
            }
            else if (userInput == 3 && cpuInput == 2) {
                printMessage("Scissors beats Paper! You Win!");
                userWins +=1;
            }else if (userInput == 2 && cpuInput == 3) {
                printMessage("Scissors beats Paper! CPU Wins!");
                cpuWins +=1;
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
