package linearSearch;

import java.util.Scanner;

public class BasicLinearSearch {

	public static void main(String[] args) 
	{
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
		BasicLinearSearch obj=new BasicLinearSearch();
		int res=obj.linearSearch(a, target);
		System.out.println("Target is at location "+res);
	}
	public int linearSearch(int a[],int t)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==t)
				return i+1;
		}
		return -1;
	}

}
