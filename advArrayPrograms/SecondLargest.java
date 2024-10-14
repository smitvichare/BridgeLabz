package advArrayPrograms;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		//int[] v=new int[6];
		int l=a.length;
		
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int largest=a[0],largest2=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest2=largest;
				largest=a[i];
			}
			else if(a[i]>largest2)
			{
				largest2=a[i];
			}
		}
		System.out.println(largest2);
	}

}
