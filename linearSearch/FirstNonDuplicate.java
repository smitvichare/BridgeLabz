package linearSearch;

import java.util.Scanner;

public class FirstNonDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		int occur[]=new int[20];
		int counter=0;
		boolean flag=false;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			for(int j=0;j<str.length();j++)
			{
				if(c==str.charAt(j))
				{
					counter++;
				}
			}
			if(counter==1)
			{
				System.out.println(c);
				break;
			}
			counter=0;
		}

	}

}
