package linearSearch;

import java.util.Scanner;

public class LargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int largest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println("The largest element in array is"+largest);
	}

}
