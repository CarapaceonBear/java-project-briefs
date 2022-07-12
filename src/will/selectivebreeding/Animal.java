package will.selectivebreeding;

public abstract class Animal {

    private int idCounter = 0;
    private int id;
    private String name;

    public Animal(String name) {
        this.name = name;
        this.id = idCounter;
        idCounter++;
    }

    public Animal() {}

    public int getIdCounter() {
        return idCounter;
    }
    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
