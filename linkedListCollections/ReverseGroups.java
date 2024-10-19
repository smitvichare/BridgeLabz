package linkedListCollections;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseGroups 
{
	public static void main(String[] args)
	{
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
		int count=0;
		LinkedList<Integer> result = new LinkedList<>();
        int size = l.size();
        
        
        for (int i = 0; i < size; i += k) {
            int end = Math.min(i + k, size); 
            LinkedList<Integer> sulist = new LinkedList<>(l.subList(i, end));
            
            for (int j = sulist.size() - 1; j >= 0; j--) {
                result.add(sulist.get(j));
            }
        }
        System.out.println(result);
	}
}
