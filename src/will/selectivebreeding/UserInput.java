package will.selectivebreeding;

import java.util.Scanner;

public class UserInput {

    private final Scanner scanner = new Scanner(System.in);
    private boolean isActive;

    public UserInput() {}

    public void printMessage(String message) {
        System.out.println(message);
    }

    public int readMenuSelection(int maximum) {
        int selection = 0;
        isActive = true;
        while (isActive) {
            printMessage(String.format("Input a number between 1 - %d", maximum));
            int response = scanner.nextInt();
            if (response > 0 && response <= maximum) {
                isActive = false;
                selection = response;
            } else {
                printMessage("Invalid response");
            }
        }
        scanner.nextLine();
        return selection;
    }

    public int readNumberInput() {
        int response = scanner.nextInt();
        scanner.nextLine();
        return response;
    }

    public String readTextInput() {
        String input = "";
        isActive = true;
        while (isActive) {
            String response = scanner.nextLine();
            if (!response.equals("")) {
                isActive = false;
                input = response;
            } else {
                printMessage("Invalid response");
            }
        }
        return input;
    }
}
