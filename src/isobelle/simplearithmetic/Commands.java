package isobelle.simplearithmetic;

public class Commands {
    private final String[] calCommands = {"Addition", "Subtraction", "Multiplication", "Division", "Quit"};
    UserInput userInput = new UserInput();
    public void runCommands(){
        boolean isActive = true;
        while (isActive){
            printCommands();
            int userCommandInput = userInput.getIntegerInput(calCommands.length + 1);
            switch (userCommandInput) {
                case 1:
                    Addition addition = new Addition();
                    addition.runAddition();
                    break;
                case 2:
                    Subtraction subtraction = new Subtraction();
                    subtraction.runSubtraction();
                    break;
                case 3:
                    Multiplication multiply = new Multiplication();
                    multiply.runMultiply();
                    break;
                case 4:
                    Division division = new Division();
                    division.runDivision();
                    break;
                default:
                    isActive = false;
                    break;
            }
        }
    }
    public void printCommands(){
        for (int i = 0; i < calCommands.length; i++) {
            userInput.printMessage((i + 1) +  ": " + calCommands[i]);
        }
    }
}
