package linearSearch;

import java.util.Scanner;

public class StringLS {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a[]=new String[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextLine();
		}
		System.out.println("Enter Target:");
		String target=sc.nextLine();
		StringLS obj=new StringLS();
		int res=obj.linearSearchs(a, target);
		System.out.println("Target is at location "+res);
	}
	public int linearSearchs(String a[],String t)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals(t))
				return i+1;
		}
		return -1;
	}

}
