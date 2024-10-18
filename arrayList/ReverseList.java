package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {

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
		int j=a.size()-1;
		for(int i=0;i<a.size()/2;i++)
		{
			int k=a.get(i);
			a.set(i,a.get(j));
			a.set(j, k);
			j--;
			
		}
		System.out.println(a);
	}

}
