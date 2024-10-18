package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntersectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new ArrayList<>();
		List<Integer> b=new ArrayList<>();
		List<Integer> c=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array1:");
		for(int i=0;i<10;i++)
		{
			int n=sc.nextInt();
			a.add(n);						
		}
		System.out.println("Enter array2:");
		for(int i=0;i<10;i++)
		{
			int n=sc.nextInt();
			b.add(n);						
		}
		for(int i:a)
		{
			if(b.contains(i) && !c.contains(i))
			{
				c.add(i);
			}
		}
		System.out.println(c);
	}

}
