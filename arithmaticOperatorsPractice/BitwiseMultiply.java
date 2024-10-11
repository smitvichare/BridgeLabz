package arithmaticOperatorsPractice;

import java.util.Scanner;

public class BitwiseMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num,mul;
		System.out.println("Enter number to be multiplied:");
		num=sc.nextInt();
		mul=num << 1;
		System.out.println("Value after bitwise multiplication: "+mul);
	}

}
