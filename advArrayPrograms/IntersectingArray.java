package advArrayPrograms;

import java.util.Scanner;

public class IntersectingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		int[] b=new int[6];
		int[] merge=new int[6];
		
		int j=0;
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
			for(int k=0;k<merge.length;k++)
			{
				if(a[i]==b[k])
				{
					merge[i]=a[i];
					j++;
					a[i]=-1;
				}
			}
		}
		System.out.println("Final List:");
		for(int i=0;i<merge.length;i++)
		{
			if(merge[i]!=0)
			System.out.println(merge[i]+" ");
		}
		

	}

}
