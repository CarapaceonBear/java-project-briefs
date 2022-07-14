package will.selectivebreeding;

import will.simplearithmetic.UserInput;

import java.util.List;

public class CommandsMenu {

    private final String[] commands = {"Add new dragon", "Search dragon by name", "List all dragons", "Breed two dragons", "Quit"};
    private final UserInput user;
    private final Farm farm;

    public CommandsMenu (UserInput user, Farm farm) {
        this.user = user;
        this.farm = farm;
    }

    public void runMenu() {
        boolean isActive = true;
        while (isActive) {
            printCommands();
            int menuChoice = user.readMenuSelection(commands.length);
            switch (menuChoice) {
                case 1:
                    String newName = user.readTextInput();
                    user.printMessage(farm.addAnimalWithRandomValues("dragon", newName));
                    break;
                case 2:
                    String searchName = user.readTextInput();
                    Dragon found = farm.searchDragonByName(searchName);
                    user.printMessage(found.toString());
                    break;
                case 3:
                    List<Dragon> fullList = farm.getDragonsList();
                    for (Dragon dragon : fullList) {
                        user.printMessage(dragon.toString());
                    }
                    break;
                case 4:
                    break;
                case 5:
                    isActive = false;
            }
        }
    }

    private void printCommands() {
        for (int i = 0; i < commands.length; i++) {
            user.printMessage(String.format("%d - %s", i + 1, commands[i]));
        }
    }
}
