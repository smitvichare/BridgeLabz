package linkedListCollections;


import java.util.LinkedList;
import java.util.Scanner;

public class RemoveAllOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter LinkedList");
		for(int i=0;i<10;i++)
		{
			int g=sc.nextInt();
			l.add(g);
		}
		System.out.println("Enter K:");
		int k=sc.nextInt();
		
			l.removeIf(e -> e==k);
		
		System.out.println(l);
	}

}
