package awo.simplearithmetic;

import java.util.Scanner;

public class CommandsMenu  {

    private static final Scanner scanner = new Scanner(System.in);

    public void printMessage(String message) {
        System.out.println(message);
    }
    public void printGreeting() {

        printMessage("Welcome to the calculator command line programme.");
    }


    public void displayCommands() {
        printGreeting();
        printMessage("Enter first number: ");
        int num1 = scanner.nextInt();
        printMessage("Enter second number: ");
        int num2 = scanner.nextInt();
        printMessage("Pick an operator");
        printMessage("1:Addition");
        printMessage("2:Subtraction");
        printMessage("3:Multiplication");
        printMessage("4:Division");
        int operator = scanner.nextInt();
        switch(operator) {
            case 1:
              int additionTotal = Addition.addition(num1, num2);
                Addition.printTotal(num1, num2, additionTotal);
                break;
            case 2:
           int subtractionTotal =  Subtraction.subtraction(num1,num2);
             Subtraction.printTotal(num1, num2, subtractionTotal);
                break;
            case 3:
              int multiplicationTotal = Multiplication.multiplication(num1,num2);
              Multiplication.printTotal(num1, num2, multiplicationTotal);
                break;
            case 4:
                int divisionTotal =  Division.division(num1, num2);
               Division.printTotal(num1, num2, divisionTotal);
                break;
            default:
              printMessage("Invalid choice, try again");
              break;
        }

     printMessage("Replay calculator programme? (y/n)");
        String answer = scanner.next();
        if (answer.equals("y")) {
            displayCommands();
        } else if (answer.equals("n")) {
            printMessage("End of programme.");
        } else {
          printMessage("Invalid choice, try again");
        }

    }
}

