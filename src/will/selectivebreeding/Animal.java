package will.selectivebreeding;

public abstract class Animal {

    private int idCounter = 0;
    private int id;
    private String name;
    protected String sex;
    protected String reproductivity;

    public Animal(String name) {
        this.name = name;
        this.id = idCounter;
        idCounter++;
        this.sex = (Math.random() > 0.5) ? "male" : "female";
        this.reproductivity = (Math.random() < 0.2) ? "infertile" : "fertile";
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

    public String getSex() {
        return this.sex;
    }

    public String getReproductivity() {
        return this.reproductivity;
    }
}
