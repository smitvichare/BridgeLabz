package sortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		int f=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
						
		}
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int s=a[j];
					a[j]=a[j+1];
					a[j+1]=s;
				}
			}
		}
		System.out.println("List in sorted order:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
