package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortList {

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
		for(int i=0;i<a.size();i++)
		{
			for(int l=0;l<a.size()-1-i;l++)
			{
				if(a.get(l)>a.get(l+1))
				{
					int s=a.get(l);
					a.set(l,a.get(l+1));
					a.set(l+1,s);
					
				}
			}
			
		}
		System.out.println(a);
	}

}
