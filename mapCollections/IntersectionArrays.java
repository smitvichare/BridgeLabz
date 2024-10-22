package mapCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class IntersectionArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> l1=new ArrayList<>();
		System.out.println("Enter an array: ");
		for (int i = 0; i < 8; i++) {
			int input = sc.nextInt();
			l1.add(input);
		}
		List<Integer> l2=new ArrayList<>();
		System.out.println("Enter an array: ");
		for (int i = 0; i < 8; i++) {
			int input = sc.nextInt();
			l2.add(input);
		}
		List<Integer> l3=new ArrayList<>();

		HashMap<Integer, Integer> freqmap = new HashMap<>();
		for (int c : l1) {
			if (freqmap.containsKey(c)) {
				freqmap.put(c, freqmap.get(c) + 1);
			} else {
				freqmap.put(c, 1);
			}
		}
		for (int c : l2) {
			if (freqmap.containsKey(c)&& !l3.contains(c)) {
				l3.add(c);
			}
		}
		System.out.println(l3);

	}

}
