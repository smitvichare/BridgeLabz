package linkedListCollections;

import java.util.LinkedList;
import java.util.Scanner;

public class PalindromeLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> a = new LinkedList<>();
		System.out.println("Enter LinkedList1:");
		Scanner sc=new Scanner(System.in);
        for(int i=0;i<7;i++)
        {
        	int z=sc.nextInt();
        	a.add(z);
        }
        int j=a.size()-1;
        boolean flag=true;
        for(int i=0;i<a.size()/2;i++)
        {
        	if(a.get(i)!=a.get(j))
        	{
        		flag=false;
        	}
        	j--;
        }
        if(flag)
        {
        	System.out.println("LinkedList is Palindrome");
        }
        else
        {
        	System.out.println("LinkedList is not Palindrome.");
        }
	}

}
