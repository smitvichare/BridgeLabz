package advArrayPrograms;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		//int[] v=new int[6];
		int l=a.length;
		int s=0,k=0;
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter rotation number:");
		s=sc.nextInt();
		
		for(int i=0;i<s;i++)
		{
			k=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				
				a[j]=a[j+1];
				
			}
			a[l-1]=k;	
			
		}
		System.out.println("Rotated Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		

	}

}
