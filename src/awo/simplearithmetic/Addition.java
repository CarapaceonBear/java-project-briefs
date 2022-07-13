package awo.simplearithmetic;



import java.util.Scanner;

public class Addition {

    private static final Scanner scanner = new Scanner(System.in);

    // inheritance
  public void run(){

      int num1 = getUserInput();
      int num2 = getUserInput();
      int total = addition(num1, num2);
      printTotal(num1, num2, total);

  }

    public int getUserInput(){
        System.out.println("Please enter the number you would like to add");
        int number1 = scanner.nextInt();
        return number1;
    }


    public  int addition(int num1, int num2){

      int sum =  num1 + num2;

        return sum;
    }

public void printTotal(int num1, int num2, int total){
    System.out.println(num1 + " + " + num2 + " = " + total);

}




}
