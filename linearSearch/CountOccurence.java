package linearSearch;

import java.util.Scanner;

public class CountOccurence {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String a=sc.nextLine();
		System.out.println("Enter the char:");
		char c=sc.next().charAt(0);
		int counter=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==c)
			{
				counter++;
			}
		}
		System.out.println("The count of "+c+" in "+a+" is "+counter);
	}
}
