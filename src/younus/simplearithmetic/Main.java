package younus.simplearithmetic;

import java.util.List;

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
                List<String> expression = home.getExpression();
                Division division = new Division(expression);
                Multiplication multiplication = new Multiplication(division.divideNumbers());
                Subtraction subtraction = new Subtraction(multiplication.timesNumbers());
                Addition addition = new Addition(subtraction.minusNumbers());
                System.out.println(addition.addNumbers());

            } else {
                isActive = false;
            }
        }
    }
}
