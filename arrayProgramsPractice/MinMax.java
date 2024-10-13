package arrayProgramsPractice;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
		int min,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		min=a[0];
		max=a[0];
		for(int i=0;i<5;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum:"+max);
		System.out.println("Minimum"+min);
	}

}
