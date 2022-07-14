package gavin.simplearithmetic.operations;

public class Division extends Operation{
    public Division(double first, double second) {
        super(first, second, "/");
    }

    public double calculate () {
        return getFirst() / getSecond();
    }
}
