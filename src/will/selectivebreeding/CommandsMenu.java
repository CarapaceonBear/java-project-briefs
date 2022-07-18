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
                    user.printMessage("Please input a name for the dragon");
                    String newName = user.readTextInput();
                    user.printMessage(farm.addAnimalWithRandomValues("dragon", newName));
                    break;
                case 2:
                    user.printMessage("Please input the name to search");
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
                    user.printMessage("Enter the names of both breeding candidates");
                    String firstSearch = user.readTextInput();
                    Dragon firstResult = farm.searchDragonByName(firstSearch);
                    String secondSearch = user.readTextInput();
                    Dragon secondResult = farm.searchDragonByName(secondSearch);
                    Dragon offspring = Breeding.breedDragonPair(firstResult, secondResult);
                    if (offspring.getName().equals("")) {
                        user.printMessage("Breeding pair is incompatible");
                    } else {
                        user.printMessage("A new dragon has been born");
                        user.printMessage(String.format("They are: %s", offspring.getReproductivity()));
                        user.printMessage("Please give them a name");
                        String offspringName = user.readTextInput();
                        offspring.setName(offspringName);
                        farm.addToDragonList(offspring);
                        user.printMessage(offspring.toString());
                    }
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
