package exceptionHandling;

import java.util.Scanner;


public class CustomChecked {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first integer: ");
            int num1 = sc.nextInt();
            
            if(num1<18)
            throw new InvalidAgeException("Age should be above 18.");
            
        } catch (InvalidAgeException e) {
            System.out.println("Error: "+e.getMessage());
        } 

	}

}
