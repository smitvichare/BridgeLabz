package arrayProgramsPractice;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		double sum=0,avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=sum/5;
		System.out.println("Sum="+sum);
		System.out.println("Average="+avg);
		

	}

}
