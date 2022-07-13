package gavin.simplearithmetic.operations;

public class Operation {
    private double first;
    private double second;
    private String operator;

    public Operation (double first, double second, String operator) {
        this.first = first;
        this.second = second;
        this.operator = operator;
    }

    public double getFirst () {
        return this.first;
    }

    public double getSecond () {
        return this.second;
    }

}
