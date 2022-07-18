package younus.simplearithmetic;

import java.util.List;

public class Division {
    private final List<String> expression;

    public Division(List<String> expression) {
        this.expression = expression;
    }

    public List<String> divideNumbers(){
        for (int i = 0; i < expression.size(); i++) {
            if (expression.get(i) == "/"){
                double answer = Double.valueOf( expression.get(i - 1)) / Double.valueOf(expression.get(i + 1));
                expression.remove(i - 1);
                expression.remove(i - 1);
                expression.remove(i - 1);
                expression.add(i - 1, String.valueOf(answer));
                i--;
            }
        }
        return expression;
    }
}
