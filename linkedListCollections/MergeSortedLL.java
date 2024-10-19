package linkedListCollections;

import java.util.LinkedList;
import java.util.Scanner;

public class MergeSortedLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> a=new LinkedList<>();
		LinkedList<Integer> b=new LinkedList<>();
		LinkedList<Integer> res=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter LinkedList1:");
		for(int i=0;i<5;i++)
		{
			int n=sc.nextInt();
			a.add(n);						
		}
		System.out.println("Enter LinkedList1:");
		for(int i=0;i<6;i++)
		{
			int n=sc.nextInt();
			b.add(n);						
		}
		int j = 0, k = 0;
        while (j < a.size() && k < b.size()) 
        {
            if (a.get(j) <= b.get(k)) 
            {
                res.add(a.get(j));
                j++;
            } else 
            {
                res.add(b.get(k));
                k++;
            }
        }
        while (j < a.size()) 
        {
            res.add(a.get(j));
            j++;
        }
        while (k < b.size()) 
        {
            res.add(b.get(k));
            k++;
        }
		System.out.println(res);
	}

}
