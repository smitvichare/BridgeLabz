package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargestSmallest {

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
		int large=a.get(0);
		int small=a.get(0);
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)>large)
			{
				large=a.get(i);
			}
			if(a.get(i)<small)
			{
				small=a.get(i);
			}
			
		}
		System.out.println("the largest:"+large);
		System.out.println("the smallest:"+small);

	}

}
