package will.simplearithmetic;

public class Main {
    public static void main(String[] args) {
        UserInput user = new UserInput();
        CommandsMenu menu = new CommandsMenu(user);

        menu.runMenu();
    }
}
