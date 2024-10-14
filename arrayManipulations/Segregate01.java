package arrayManipulations;

import java.util.Scanner;

public class Segregate01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		int l=a.length;
		int z=0,o=0;
		int k=0,swap=0;
		System.out.println("Enter array:");
		for(int x=0;x<a.length;x++)
		{
			a[x]=sc.nextInt();
			if(a[x]==0)
				z++;
			else if(a[x]==1)
			{
				o++;
			}
		}
		while(k<a.length-z)
		{
			if(a[k]==0)
			{
				for(int j=k;j<a.length-1;j++)
				{
					swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
				}
				
			}
			else
			{
				k++;
			}
			
		}
		k=0;
		while(k<a.length-z-o)
		{
			if(a[k]==1)
			{
				for(int j=k;j<a.length-1;j++)
				{
					swap=a[j];
					a[j]=a[j+1];
					a[j+1]=swap;
				}
				
			}
			else
			{
				k++;
			}
			
		}
		System.out.println("Final array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
			
		}
		
	}

}
