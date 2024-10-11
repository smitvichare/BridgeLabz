package logicalProgramsPractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=2;
		boolean f=true;
		int[] factors=new int[200];
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num<2)
		{
			System.out.println("Enter number in valid range.");
		}
		else if(num==2)
		{
			System.out.println(num+"is a Prime Number.");
		}
		else 
		{
			while(i<=(num/2))
			{
				if(num%i==0)
				{
					f=false;
					break;
				}
				i++;
		
			}
		
		
		if(f==true)
		{
			System.out.println(num+"is a Prime Number.");
		}
		else
		{
			System.out.println(num+"is not a Prime Number.");
		}
		}

	}

}
