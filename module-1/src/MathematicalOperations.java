import java.lang.System;
import java.util.Scanner;

public class MathematicalOperations {

    public static int dummyFunction() {
        return 1;
    }

    public static int additionFunction(int a, int b) {
        return a + b;
    }

    public static double divide(int a, int b) {
        return a / b;
    }

    /**
     * Multiply two integer and returns the result
     * Added by Onur Neşvat
     *
     * @param a integer1
     * @param b integer 2
     * @return result
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which operation you would like to try: \n" +
                "For Dummy Function, Press 1:" +
                "For Addition Function, Press 2:" +
                "For Divide Function, Press 3:" +
                "For Multiply Function Press 4:" +
                "For Exit Press 0:");
        int functionChoice = 0;
        while (true) {
            System.out.print('Command: ')
            int functionChoice = input.nextInt();

            if (functionChoice == 0) {
                System.out.println('good bye!');
                break;
            }

            if (functionChoice == 1)
                dummyFunction();
            else if (functionChoice == 2) {
                Scanner input2 = new Scanner(System.in);
                System.out.println("Enter two numbers to add: ");
                int a = input2.nextInt();
                int b = input2.nextInt();
                additionFunction(a, b);
            } else if (functionChoice == 3) {
                Scanner input2 = new Scanner(System.in);
                System.out.println("Enter two numbers to divde: ");
                int a = input2.nextInt();
                int b = input2.nextInt();
                System.out.println(divide(a, b));
            } else if (functionChoice == 4) {
                Scanner input2 = new Scanner(System.in);
                System.out.println("Enter two numbers to multiply: ");
                int a = input2.nextInt();
                int b = input2.nextInt();
                System.out.println(multiply(a, b));
            }
        }
    }


}
