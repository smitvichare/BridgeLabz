package sortingAlgorithms;

import java.util.Scanner;

public class SelesctionSort {

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
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int index=i;
				if(a[index]>a[j])
				{
					index=j;
				}
				int s=a[index];
				a[index]=a[i];
				a[i]=s;
			}
		}
		System.out.println("List in sorted order:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
