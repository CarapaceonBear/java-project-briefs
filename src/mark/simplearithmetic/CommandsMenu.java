package mark.simplearithmetic;

import java.util.Scanner;

public class CommandsMenu {

    private final Scanner scanner = new Scanner(System.in);

    public void displayCommands() {


        System.out.println("Enter first number: ");
        double num1 =  scanner.nextDouble();
        System.out.println("Enter second number: ");
        double num2 =  scanner.nextDouble();

        System.out.println("Choose option to make calculation");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");

        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                Addition.addTwoNumbers(num1, num2);
                break;
            case 2:
                Subtraction.subtractTwoNumbers(num1, num2);
                break;
            case 3:
                Multiplication.multiplyTwoNumbers(num1, num2);
                break;
            case 4:
                Division.divideTwoNumbers(num1, num2);
                break;

                default: System.out.println("Invalid choice");
                break;
        }

        System.out.println("Do you want to make another calculation? (y/n)");
        String answer = scanner.next();
        if (answer.equals("y")) {
            displayCommands();
        } else if (answer.equals("n")) {
            System.out.println("Ok, Bye 👋");
        } else {
            System.out.println("Invalid answer");
        }

    }



}
