package exceptionHandling;

import java.util.Scanner;

public class CustomUnsolved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter integer: ");
            int num1 = sc.nextInt();
            
            if(num1<0)
            throw new NegativeNumberException("Number should not be negative.");
            
        } catch (NegativeNumberException e) {
            System.out.println("Error: "+e.getMessage());
        } 
	}

}
