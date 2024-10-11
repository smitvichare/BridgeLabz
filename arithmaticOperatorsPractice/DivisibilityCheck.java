package arithmaticOperatorsPractice;

import java.util.Scanner;

public class DivisibilityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check divisibility:");
		num=sc.nextInt();
		if(num%5==0 && num%7==0)
		{
			System.out.println(num+" is divisible by 5 & 7.");
		}
		else if(num%5==0)
		{
			System.out.println(num+" is divisible by 5 but not 7.");
		}
		else if(num%7==0)
		{
			System.out.println(num+" is divisible by 7 but not 5.");
			
		}
		else
		{
			System.out.println(num+" is neither divisible by 5 nor 7.");
		}
	}

}
