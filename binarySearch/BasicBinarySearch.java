package binarySearch;

import java.util.Scanner;


public class BasicBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Target:");
		int target=sc.nextInt();
		BasicBinarySearch obj=new BasicBinarySearch();
		int res=obj.bSearch(a, target);
		System.out.println("Target is at location "+res);
	}
	public int bSearch(int a[],int t)
	{
		int lb=0;
		int ub=a.length-1;
		
		while(lb<=ub)
		{
			int mb=(ub+lb)/2;
			if(a[mb]==t)
				return mb+1;
			else if(a[mb]>t)
				ub=mb-1;
			else
				lb=mb+1;
		}
		return -1;
	}

	

}
