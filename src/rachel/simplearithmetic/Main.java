package rachel.simplearithmetic;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CommandsMenu commandsMenu = new CommandsMenu();
        commandsMenu.run();
    }
}
