package arithmaticOperatorsPractice;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter Number to print Multiplication Table:");
		num=sc.nextInt();
		System.out.println("Multiplication Table:");
		for(int i=0;i<11;i++) {
			
			System.out.println(num+" x "+i+" = "+(num*i));
		}

	}

}
