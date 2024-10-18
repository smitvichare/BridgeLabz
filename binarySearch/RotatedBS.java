package binarySearch;

import java.util.Scanner;

public class RotatedBS {
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
			if(a[i]<a[i-1])
				f=i;
		}
		for(int j=0;j<f;j++)
		{
			int l=a[0];
			for(int k=0;k<a.length-1;k++)
			{
				
				a[k]=a[k+1];
				
			}
			a[a.length-1]=l;	
		}
		System.out.println("Enter Target:");
		int target=sc.nextInt();
		RotatedBS obj=new RotatedBS();
		int res=obj.rbSearch(a, target);
		if(res+f>a.length)
		{
			res=(res + f) -a.length;
		}
		else
			res=res+f;
		System.out.println("Target is at location "+res);
		
			
	}
	public int rbSearch(int a[],int t)
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
