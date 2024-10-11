package logicalProgramsPractice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=1,counter=0,sum=0;
		int[] factors=new int[200];
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(i<=(num/2))
		{
			if(num%i==0)
			{
				factors[counter]=i;
				counter++;
			}
			i++;
		
		}
		for(int j=0;j<factors.length;j++)
		{
			sum=sum+factors[j];
		}
		if(num==sum)
		{
			System.out.println(num+"is a Perfect Number.");
		}
		else
		{
			System.out.println(num+"is not a Perfect Number.");
		}
		

	}

}
