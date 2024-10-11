package arithmaticOperatorsPractice;

import java.util.Scanner;

public class TernaryMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number:");
		num1=sc.nextInt();
		System.out.println("Enter second Number:");
		num2=sc.nextInt();
		System.out.println("The smaller number is "+(num1<num2?num1:num2));
		

	}

}
