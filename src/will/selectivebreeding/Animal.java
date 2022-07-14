package will.selectivebreeding;

public abstract class Animal {

    private int idCounter = 0;
    private int id;
    private String name;
    private String reproductivity;

    public Animal(String name) {
        this.name = name;
        this.id = idCounter;
        idCounter++;
        setReproductivity();
    }

    public Animal() {}

    private void setReproductivity() {
        int value = (int) (Math.random() * 3);
        switch(value) {
            case 0:
               reproductivity = Reproductivity.MALE.getStatus();
               break;
            case 1:
                reproductivity = Reproductivity.FEMALE.getStatus();
                break;
            case 2:
                reproductivity = Reproductivity.INFERTILE.getStatus();
                break;
        }
    }

    public String getReproductivity() {
        return reproductivity;
    }

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
