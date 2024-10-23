package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first integer: ");
            int num1 = sc.nextInt();
            
            System.out.println("Enter second integer: ");
            int num2 = sc.nextInt();
            
            int result = num1 / num2;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integer values.");
        }

	}

}
