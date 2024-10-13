package stringProgramsPractice;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		String t="";
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1:");
		s=sc.nextLine();
		System.out.println("Enter String1:");
		t=sc.nextLine();
		
		int l=s.length();
		char[] c1=s.toCharArray();
		char[] c2=t.toCharArray();
		if(s.length()==t.length())
		{
			for(int i=0;i<c1.length;i++)
			{
				for(char j:c2)
				{
					if(c1[i]==j)
					{
						c1[i]='0';
						//System.out.println(i);
					}
				}
			}
			for(char i:c1)
			{
				if(i!='0')
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(t+" is an anagram of "+s);
			}
			else
			{
				System.out.println(t+" is not an anagram of "+s);
			}
		}
		else
		{
			System.out.println(t+" is not an anagram of "+s);
		}

	}

}
