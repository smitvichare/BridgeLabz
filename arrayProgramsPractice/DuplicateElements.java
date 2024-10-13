package arrayProgramsPractice;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		int[] visited=new int[6];
		int[] duplicate=new int[6];	
		boolean flag=false,flag2=false;
		int c=0,d=0;
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			flag=false;
			flag2=false;
			for(int j=0;j<visited.length;j++)
			{
				if(a[i]==visited[j])
				{
					for(int k=0;k<duplicate.length;k++)
						if(a[i]==duplicate[k])
							flag2=true;
					if(flag2==false)
					{
						duplicate[d]=a[i];
						d++;
						flag=true;
					}
					
				}
				
			}
			if(flag==false)
			{
				visited[c]=a[i];
				c++;
			}
		}
		System.out.println("Duplicate Elements in the array are:");
		for(int i=0;i<visited.length;i++)
		{
			if(duplicate[i]==0)
				continue;
			else
				System.out.print(duplicate[i]+" ");
		}

	}

}
