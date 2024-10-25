package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilteringList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Strings:");
		List<String> res=new ArrayList<>();
		for(int i=0;i<4;i++)
		{
			s.add(sc.nextLine());
		}
		res=s.stream().filter(n -> !n.startsWith("A")).collect(Collectors.toList());
		System.out.println(res);
		
		

	}

}
