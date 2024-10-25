package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MapReduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			l.add(sc.nextInt());
		}
		
		int res=l.stream().map(n->n*n).reduce(0, Integer::sum);
		System.out.println(res);
		

	}

}
