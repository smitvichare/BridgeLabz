package sortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {

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
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		System.out.println("List in sorted order:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
