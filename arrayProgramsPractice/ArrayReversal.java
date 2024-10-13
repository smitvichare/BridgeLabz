package arrayProgramsPractice;

import java.util.Scanner;

public class ArrayReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		int j=0,s=0;
		
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<(a.length/2);i++)
		{
			j=(a.length)-i-1;
			s=a[i];
			a[i]=a[j];
			a[j]=s;
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
