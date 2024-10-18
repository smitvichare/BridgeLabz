package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NonRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new ArrayList<>();
		Set<Integer> b=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array1:");
		for(int i=0;i<10;i++)
		{
			int n=sc.nextInt();
			a.add(n);						
		}
		for(int i=0;i<a.size();i++)
		{
			int s=a.get(i);
			for(int j=i+1;j<a.size();j++)
			{
				if(s==a.get(j)&& s!=-1)
				{
					b.add(s);
					a.set(j, -1);
					break;
				}
			}
		}
		System.out.println("First Non-Repeat Element");
		for(int i:a)
		{
			if(!b.contains(i))
			{
				System.out.println(i);
				break;
			}
		}
	}

}
