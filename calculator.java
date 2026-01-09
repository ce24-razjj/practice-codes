// package language_java.proj_101;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        //
        Scanner sc = new Scanner(System.in);
        //

        System.out.println("\nSimple Calculator!\n");

        System.out.print("Enter '0' to exit the calc... \n");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        double result = num1;

        if (num1 != 0) {
            while (true) {

                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = sc.next().charAt(0);

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                num1 = result;

                if (num2 == 0)
                    break;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Cannot divide by zero!");
                        }
                        break;
                    default:
                        System.out.println("Invalid operator!");
                }
            }
        }

        System.out.println("Final Result: " + result);
        System.out.println("thank you for using my calculator...");
    }
}
