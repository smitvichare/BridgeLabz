package arrayProgramsPractice;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		int[] positive=new int[6];
		int[] negative=new int[6];	
		int j=0,k=0;
		
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<(a.length);i++)
		{
			if(a[i]<0)
			{
				negative[j]=a[i];
				j++;
			}
			else
			{
				positive[k]=a[i];
				k++;
			}
		}
		System.out.println("Positive numbers array:");
		for(int i=0;i<positive.length;i++)
		{
			System.out.println(positive[i]+" ");
		}
		System.out.println("Negative numbers array:");
		for(int i=0;i<negative.length;i++)
		{
			System.out.println(negative[i]+" ");
		}
		


	}

}
