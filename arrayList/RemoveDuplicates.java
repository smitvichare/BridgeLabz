package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a=new ArrayList<>();
		Set<Integer> b=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<10;i++)
		{
			int n=sc.nextInt();
			b.add(n);						
		}
		System.out.println("Non-Duplicate Elements:");
		System.out.println(b);
	}

}
