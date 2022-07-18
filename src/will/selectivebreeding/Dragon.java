package will.selectivebreeding;

import java.text.DecimalFormat;

public class Dragon extends Animal {

    private final double flyingSpeed;
    private final double scaleQuality;
    private final double eggSize;
    private final double breathTemperature;
    private final DecimalFormat df = new DecimalFormat("0.00");

    public Dragon(String name) {
        setName(name);
        setId(getIdCounter());
        super.setIdCounter(getIdCounter() + 1);

        this.flyingSpeed = Math.random() * 5;
        this.scaleQuality = Math.random() * 5;
        this.eggSize = Math.random() * 5;
        this.breathTemperature = Math.random() * 5;
    }

    public Dragon(String name, double flyingSpeed, double scaleQuality, double eggSize, double breathTemperature) {
        setName(name);
        setId(getIdCounter());
        super.setIdCounter(getIdCounter() + 1);
        setReproductivity();

        this.flyingSpeed = flyingSpeed;
        this.scaleQuality = scaleQuality;
        this.eggSize = eggSize;
        this.breathTemperature = breathTemperature;
    }

    public Dragon() {
        setName("");
        setId(0);
        this.flyingSpeed = 0;
        this.scaleQuality = 0;
        this.eggSize = 0;
        this.breathTemperature = 0;
    }

    @Override
    public String toString() {
        return String.format("%s, %s\nFlying speed : %s,\nScale quality : %s,\nEgg size : %s,\nBreath temperature : %s",
                getName(), getReproductivity(), df.format(flyingSpeed), df.format(scaleQuality), df.format(eggSize), df.format(breathTemperature));
    }

    public double getFlyingSpeed() {
        return flyingSpeed;
    }

    public double getScaleQuality() {
        return scaleQuality;
    }

    public double getEggSize() {
        return eggSize;
    }

    public double getBreathTemperature() {
        return breathTemperature;
    }
}
