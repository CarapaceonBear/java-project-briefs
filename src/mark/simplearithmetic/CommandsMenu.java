package mark.simplearithmetic;

import java.util.Scanner;

public class CommandsMenu {

    static Scanner scanner = new Scanner(System.in);



    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    public void displayCommands() {



        int sum = 0;
        int choice = scanner.nextInt();

        System.out.println("Choose option to make calculation");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");



        switch(choice) {
            case 1:
                sum = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
                break;
            case 2:
                sum = num1 - num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
                break;
            case 3:
                sum = num1 * num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
                break;
            case 4:
                sum = num1 / num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
                break;
                default:
                    System.out.println("Invalid choice");
                    break;
        }




    }


}
