
import java.util.Scanner;



public class W04_02_ifElse_compareNumber {

    public static void main(String[] args) {

        int result = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("add first number :");
        int num1 = input.nextInt();
        System.out.print("add second number :");
        int num2 = input.nextInt();

        String resultdes1 = "greater Then the";
        String resultdes2 = "less or equal to";

        if (num1>num2) {

           result = num1 - num2;

        } else {

            result = num1 + num2;
        }

        if (num1>num2) {

           System.out.println("The number1 is" + resultdes1 + "number2");

        } else {

            System.out.println("The number1 is" + resultdes2 + "number2");
        }

        System.out.println("the result is :" + result);
    }
    
}
