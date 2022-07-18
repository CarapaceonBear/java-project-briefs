package will.selectivebreeding;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Farm {

    private String name;
    private final List<Dragon> farm = new ArrayList<>();

    public Farm(String name) {
        this.name = name;
    }

    public String addAnimalWithRandomValues(String animal, String name) {
        switch(animal) {
            case "dragon":
                farm.add(new Dragon(name));
                break;
            case "future option":
                break;
            case "future option 2":
                break;
            default:
                return "Unknown animal type";
        }
        return String.format("New %s added, called %s", animal, name);
    }

    public List<Dragon> getDragonsList() {
        return farm;
    }

    public void addToDragonList(Dragon dragon) {
        farm.add(dragon);
    }

    public Dragon searchDragonByName(String name) {
        try {
            return farm.stream().filter(dragon -> dragon.getName().equals(name)).findFirst().get();
        } catch (NoSuchElementException e) {
            System.out.println(e);
            return new Dragon("empty");
        }
    }
}
