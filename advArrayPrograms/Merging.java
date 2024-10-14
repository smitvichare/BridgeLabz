package advArrayPrograms;

import java.util.Scanner;

public class Merging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		int[] b=new int[6];
		int[] merge=new int[12];
		int l=a.length;
		int j=0,k=0;
		System.out.println("Enter array1:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter array2:");
		for(int i=0;i<a.length;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<merge.length;i++)
		{
			if(j<a.length && k<b.length)
			{
				if(a[j]<b[k])
				{
					merge[i]=a[j];
					j++;
				}
				else
				{
					merge[i]=b[k];
					k++;
				}
			}
			else
			{
				if(j<k)
				{
					merge[i]=a[j];
					j++;
				}
				else
				{
					merge[i]=b[k];
					k++;
				}
			}
		}
		System.out.println("Merged List:");
		for(int i=0;i<merge.length;i++)
		{
			System.out.println(merge[i]+" ");
		}
		
	}

}
