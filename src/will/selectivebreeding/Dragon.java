package will.selectivebreeding;

public class Dragon extends Animal {

    private int flyingSpeed;
    private int scaleQuality;
    private int eggSize;
    private int breathTemperature;

    public Dragon(String name) {
        setName(name);
        setId(getIdCounter());
        super.setIdCounter(getIdCounter() + 1);

        this.flyingSpeed = (int) (Math.random() * 5);
        this.scaleQuality = (int) (Math.random() * 5);
        this.eggSize = (int) (Math.random() * 5);
        this.breathTemperature = (int) (Math.random() * 5);
    }

    @Override
    public String toString() {
        return String.format("%s, %s\nFlying speed : %d,\nScale quality : %d,\nEgg size : %d,\nBreath temperature : %d",
                getName(), getReproductivity(), flyingSpeed, scaleQuality, eggSize, breathTemperature);
    }

    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    public int getScaleQuality() {
        return scaleQuality;
    }

    public int getEggSize() {
        return eggSize;
    }

    public int getBreathTemperature() {
        return breathTemperature;
    }
}
