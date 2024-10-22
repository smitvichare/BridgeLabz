package setCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class FirstNonDuplicate {
	
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 1, 2, 4, 5, 3, 2);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (Integer num : numbers) {
            set.add(num);
        }
        for (Integer num : set) {
            if (Collections.frequency(numbers, num) == 1) {
                System.out.println("First non-duplicate element: " + num);
                return;
            }
        }
        System.out.println("No non-duplicate element found.");
    }

}
