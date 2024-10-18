package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateList {

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
		System.out.println("Enter kkk:");
		int kkk=sc.nextInt();
		int j=0;
		for(int i=0;i<kkk;i++)
		{
			j=a.get(0);
			for(int l=0;l<a.size()-1;l++)
			{
				a.set(l,a.get(l+1));
			}
			a.set(a.size()-1, j);
			
		}
		System.out.println(a);
	}

}
