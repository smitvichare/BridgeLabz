package sortingAlgorithms;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
						
		}
		mergeSort(a, 0, a.length - 1);
		System.out.println("List in sorted order:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}


	}
	public static void mergeSort(int a[],int l, int r)
	{
		if(l<r)
		{
			int m=(l+r)/2;
			mergeSort(a,l,m);
			mergeSort(a,m+1,r);
			merge(a,l,m,r);
		}
		
	}
	public static void merge(int a[],int l,int m, int r)
	{
		int size1=m-l+1;
		int size2=r-m;
		int lefta[]=new int[size1];
		int righta[]=new int[size2];
		for(int i=0;i<size1;i++) 
		{
			lefta[i]=a[l+i];
		}
		for(int i=0;i<size2;i++) 
		{
			righta[i]=a[m+1+i];
		}
		int i=0,j=0,k=l;
		while(i<size1 && j<size2)
		{
			if(lefta[i]<righta[j])
			{
				a[k]=lefta[i];
				i++;
			}
			else
			{
				a[k]=righta[j];
				j++;
			}
			k++;
		}
		while (i < size1) 
		{
			a[k++] = lefta[i++];
		}
		while (i < size2) 
		{
			a[k++] = righta[i++];
		}
	}

}
