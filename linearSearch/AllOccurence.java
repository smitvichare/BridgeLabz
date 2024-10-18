package linearSearch;

import java.util.Scanner;

public class AllOccurence {

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
		AllOccurence obj=new AllOccurence();
		int[] res=obj.FindOccur(a, target);
		System.out.println("Target is at location:");
		for(int i=0;i<res.length;i++)
		System.out.print(res[i]+" ");
	}
	public int[] FindOccur(int a[],int t)
	{
		int counter=0;
		int l[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==t)
			{
				l[counter]=i+1;
				counter++;
			}
			
		}
		return l;
		
	}

}
