package arithmaticOperatorsPractice;

import java.util.Scanner;

public class BitwiseOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter a number:");
		int num=sc.nextInt();
		if((num&1)==0)
		{
			System.out.println(num+" is even.");
			
		}
		else
		{
			System.out.println(num+" is odd.");
		}

	}

}
