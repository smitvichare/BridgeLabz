package advArrayPrograms;

import java.util.*;
import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = new int[6];

		System.out.println("Enter array elements:");
		for (int x = 0; x < a.length; x++) {
			a[x] = sc.nextInt();
		}

		System.out.println("Enter the target sum:");
		int sum = sc.nextInt();

		boolean found = false;
		HashSet<Integer> seenNumbers = new HashSet<Integer>();

		System.out.println("Pairs with sum " + sum + ":");
		for (int num : a) {
			int comp = sum - num;

			if (seenNumbers.contains(comp)) {
				System.out.println("(" + comp + ", " + num + ")");
				found = true;
			}

			seenNumbers.add(num);
		}
		if (found == false) {
			System.out.println("no pairs found!");
		}
		sc.close();
	}
}
