package gavin.rockpaperscissors.commands;

import gavin.rockpaperscissors.commands.Commands;

public class UserCommands extends Commands {
    public UserCommands() {
        super("User Commands", new String []{"Normal Version", "Extended Version", "Quit"}, "user");
    }

    @Override
    public void run() {
        printMessage("Welcome, please select a version from below:");
        printCommands();
        int userInput = getIntegerInput();

        switch (userInput) {
            case 1:
                RockPaperScissorsCommands normal = new RockPaperScissorsCommands();
                normal.run();
                break;
            case 2:
                RockPaperScissorsLizardSpockCommands extended = new RockPaperScissorsLizardSpockCommands();
                extended.run();
                break;
            case 3:
                break;
        }
    }
}
