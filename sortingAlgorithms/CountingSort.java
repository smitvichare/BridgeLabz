package sortingAlgorithms;

import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
						
		}
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		int count[]=new int[max+1];
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
					c++;
			}
			count[a[i]]=c;
		}
		int b[]=new int[6];
		int sum=0;
		for(int i=0;i<count.length;i++)
		{
			sum=sum+count[i];
			count[i]=sum;
		}
		int k,f;
		for(int i=a.length-1;i>=0;i--)
		{
			k=a[i];
			f=count[k]-1;
			b[f]=k;
			count[k]--;
			
		}
		System.out.println("List in sorted order:");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
	}

}
