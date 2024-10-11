package logicalProgramsPractice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,d,rev=0;
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num>0)
		{
			rev*=10;
			d=num%10;
			rev+=d;
			num/=10;
			
			
		}
		System.out.println("The reversed number:");
		System.out.println(rev);
		

	}

}
