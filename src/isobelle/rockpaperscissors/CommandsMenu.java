package isobelle.rockpaperscissors;
import isobelle.simplearithmetic.UserInput;

public class CommandsMenu {
    private final String[] Commands = {"Play", "Quit"};
    UserInput userInput = new UserInput();
    public void runCommands(){
        boolean isActive = true;
        while (isActive){
            printCommands();
            int userCommandInput = userInput.getIntegerInput(Commands.length + 1);
            switch (userCommandInput) {
                case 1:
                    userInput.printMessage("Play");
                    break;
                default:
                    isActive = false;
                    break;
            }
        }
    }
    public void printCommands(){
        for (int i = 0; i < Commands.length; i++) {
            userInput.printMessage((i + 1) +  ": " + Commands[i]);
        }
    }
}
