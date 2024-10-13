package stringProgramsPractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		s=sc.nextLine();
		int j=s.length()-1;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				flag=true;
				break;
			}
			j--;
		}
		if(flag==false)
		{
			System.out.println("String "+s+" is a palindrome.");
		}
		else
		{
			System.out.println("String "+s+" is not a palindrome.");
		}
	}

}
