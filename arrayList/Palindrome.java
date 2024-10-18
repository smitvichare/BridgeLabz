package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<10;i++)
		{
			int n=sc.nextInt();
			a.add(n);						
		}
		int j=a.size()-1;
		boolean f=true;
		for(int i=0;i<a.size()/2;i++)
		{
			if(a.get(i)!=a.get(j))
				f=false;
			j--;
			
		}
		if(f==true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
