package will.selectivebreeding;

import will.simplearithmetic.UserInput;

public class Main {
    public static void main(String[] args) {
        UserInput user = new UserInput();
        Farm farm = new Farm("dragons");
        CommandsMenu menu = new CommandsMenu(user, farm);

        menu.runMenu();
    }
}
