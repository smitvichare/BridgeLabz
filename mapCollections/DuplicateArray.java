package mapCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> l=new ArrayList<>();
		System.out.println("Enter an array: ");
		for (int i = 0; i < 8; i++) {
			int input = sc.nextInt();
			l.add(input);
		}

		HashMap<Integer, Integer> freqmap = new HashMap<>();
		for (int c : l) {
			if (freqmap.containsKey(c)) {
				freqmap.put(c, freqmap.get(c) + 1);
			} else {
				freqmap.put(c, 1);
			}
		}
		freqmap.entrySet().removeIf(entry -> entry.getValue() == 1);
		for (Map.Entry<Integer, Integer> entry : freqmap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

	}

}
