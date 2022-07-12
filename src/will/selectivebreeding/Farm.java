package will.selectivebreeding;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private String name;
    private final List<Animal> farm = new ArrayList<>();

    public Farm(String name) {
        this.name = name;
    }

    private String addAnimalWithRandomValues(String animal, String name) {
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

    public List<Animal> getAnimalsList() {
        return farm;
    }
}
