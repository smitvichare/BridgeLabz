package linkedListCollections;

import java.util.LinkedList;
import java.util.Scanner;

public class IntersectionLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> a = new LinkedList<>();
		LinkedList<Integer> b = new LinkedList<>();
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter LinkedList1:");
        for(int i=0;i<6;i++)
        {
        	int z=sc.nextInt();
        	a.add(z);
        }
        System.out.println("Enter LinkedList1:");
        for(int i=0;i<6;i++)
        {
        	int z=sc.nextInt();
        	b.add(z);
        }
        for(int i=0;i<a.size();i++)
        {
        	int l=a.get(i);
        	for(int j=0;j<b.size();j++)
        	{
        		if(l==b.get(j))
        		{
        			System.out.println("Intersecting element is:"+l);
        			break;
        		}
        	}
        }
	}

}
