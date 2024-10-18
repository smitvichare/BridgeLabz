package sortingAlgorithms;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
						
		}
		quickSort(a, 0, a.length - 1);
		System.out.println("List in sorted order:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void quickSort(int a[],int l, int h)
	{
		if(l<h)
		{
			int pivot=partition(a,l,h);
			quickSort(a,l,pivot-1);
			quickSort(a,pivot,h);
					
		}
	}
	public static int partition(int a[],int l,int h)
	{
		int pivot=a[h];
		int i=l-1;
		for(int j=l;j<h;j++)
		{
			if(a[j]<pivot)
			{
				i++;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		int t=a[i+1];
		a[i+1]=a[h];
		a[h]=t;
		return i+1;
	}

}
