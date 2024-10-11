package arithmaticOperatorsPractice;

import java.util.Scanner;

public class AverageCalculator {
	public static void main(String[] args) {
		int[] number = new int[5];
		int sum=0,average;
		Scanner sc=new Scanner(System.in);	
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter "+(i+1)+"st Number:");
			number[i]=sc.nextInt();
			sum=sum+number[i];
		}
		average=sum/5;
		System.out.println("The Average of the 5 numbers is "+average);
		
	}
}
