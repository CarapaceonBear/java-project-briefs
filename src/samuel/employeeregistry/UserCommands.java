package samuel.employeeregistry;

public class UserCommands  extends Commands{

    public void handleOperatorChoice(){
        String operator = getOperator();
        System.out.println(operator);
        switch (operator){
            case "+":
                setAnswer(Addition.doAddition(getNumberOne(), getNumberTwo()));
                break;
            case "-":
                setAnswer(Subtraction.doSubtraction(getNumberOne(), getNumberTwo()));
                break;
            case "/":
                setAnswer(Division.doDivision(getNumberOne(), getNumberTwo()));
                break;
            case "*":
                setAnswer(Multiplication.doMultiplication(getNumberOne(), getNumberTwo()));
                break;
            default:
                break;
        }
    }


    @Override
    public void run() {

    printMessage("\nPlease enter a number");
    setNumberOne(getIntInput());
    fullCalculationList.add(String.valueOf(getNumberOne()));
    printOperators();
    setOperator(getStringInput());
    fullCalculationList.add(getOperator());
        printMessage("Please enter your Second number");
    setNumberTwo(getIntInput());
    handleOperatorChoice();
    printMessage(getNumberOne() + " " + getOperator() + " " + getNumberTwo() + " " + "= " + getAnswer());
    }
}
