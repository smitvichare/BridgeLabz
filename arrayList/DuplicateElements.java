package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateElements {

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
		System.out.println("Duplicate Elements:");
		for(int i=0;i<a.size();i++)
		{
			int s=a.get(i);
			for(int j=i+1;j<a.size();j++)
			{
				if(s==a.get(j)&& s!=-1)
				{
					System.out.println(s);
					a.set(j, -1);
					break;
				}
			}
		}
	}

}
