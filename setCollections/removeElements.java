package setCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class removeElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(4, 2, 8, 3, 7, 8, 5, 3, 2, 1, 9);
		List<Integer> list1 = new ArrayList<>();
		Set<Integer> set = new TreeSet<>(list);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int t = sc.nextInt();
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) { 
			int num = iterator.next();
			if (num < t) {
				list1.add(num);
			}
		}
		for (int i = 0; i < list1.size(); i++) {
			set.remove(list1.get(i));
		}
		System.out.println(set);

	}

}
