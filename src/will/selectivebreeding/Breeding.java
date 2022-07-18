package will.selectivebreeding;

public class Breeding {

    public static Dragon breedDragonPair(Dragon a, Dragon b) {
        if (a.getReproductivity().equals("Infertile") || b.getReproductivity().equals("Infertile")) {
//            infertile
            return new Dragon();
        }
        if (a.getReproductivity().equals(b.getReproductivity())) {
//            same sex
            return new Dragon();
        }
//        Dragon offspring = new Dragon("newborn");
        double min = 1;
        double max = (Math.max(a.getFlyingSpeed(), b.getFlyingSpeed())) + 1;
        double random = Math.random() * max + min;
        double newFlyingSpeed = (a.getFlyingSpeed() + b.getFlyingSpeed() + random) / 3;

        max = (Math.max(a.getScaleQuality(), b.getScaleQuality())) + 1;
        random = Math.random() * max + min;
        double newScaleQuality = (a.getScaleQuality() + b.getScaleQuality() + random) / 3;

        max = (Math.max(a.getEggSize(), b.getEggSize())) + 1;
        random = Math.random() * max + min;
        double newEggSize = (a.getEggSize() + b.getEggSize() + random) / 3;

        max = (Math.max(a.getBreathTemperature(), b.getBreathTemperature())) + 1;
        random = Math.random() * max + min;
        double newBreathTemperature = (a.getBreathTemperature() + b.getBreathTemperature() + random) / 3;

        return new Dragon("newborn", newFlyingSpeed, newScaleQuality, newEggSize, newBreathTemperature);
    }
}
