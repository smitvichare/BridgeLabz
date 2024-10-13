package stringProgramsPractice;

import java.util.Scanner;

public class CharacterFrequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		int l=s.length();
		char[] a=s.toCharArray();
		char[] visited=new char[l];
		int[] frequency=new int[l];	
		boolean flag=false;
		int c=0;
		
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
			if(frequency[i]!=0)
			System.out.println(visited[i]+" "+frequency[i]);
		}
	}
	
}