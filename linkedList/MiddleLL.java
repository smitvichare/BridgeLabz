package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class MiddleLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> a=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter LinkedList:");
		for(int i=0;i<9;i++)
		{
			int n=sc.nextInt();
			a.add(n);						
		}
		System.out.println("Middle element:"+a.get(a.size()/2));
		

	}

}
