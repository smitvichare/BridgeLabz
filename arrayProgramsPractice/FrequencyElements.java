package arrayProgramsPractice;

import java.util.Scanner;

public class FrequencyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[6];
		int[] visited=new int[6];
		int[] frequency=new int[6];	
		boolean flag=false;
		int c=0;
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			flag=false;
			for(int j=0;j<visited.length;j++)
			{
				if(a[i]==visited[j])
				{
					frequency[j]++;
					flag=true;
					
				}
				
			}
			if(flag==false)
			{
				visited[c]=a[i];
				frequency[c]=1;
				c++;
			}
		}
		for(int i=0;i<visited.length;i++)
		{
			System.out.println(visited[i]+" "+frequency[i]);
		}
	}

}
