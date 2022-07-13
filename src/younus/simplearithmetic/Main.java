package younus.simplearithmetic;

public class Main {
    public static void main(String[] args) {

        Commands home = new Commands("home", new String[]{"Input number", "+", "-", "*", "/", "="});


        boolean isActive = true;

        while(isActive) {
            home.printExpression();
            home.printCommands();
            int commandInput = home.getCommandsInput();

            if (commandInput == 1) {
                int num = home.getIntegerInput();
                home.addToExpression(num);
            } else if (commandInput == 2) {
                home.addToExpression("+");
            } else if (commandInput == 3) {
                home.addToExpression("-");
            } else if (commandInput == 4) {
                home.addToExpression("*");
            } else if (commandInput == 5) {
                home.addToExpression("/");
            } else if (commandInput == 6) {
                home.addToExpression("=");
            } else {
                isActive = false;
            }
        }

    }
}
