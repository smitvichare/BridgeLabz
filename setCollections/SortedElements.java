package setCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list = Arrays.asList(4, 2, 8, 3, 7, 8, 5, 3, 2, 1, 9);
		 Set<Integer> treeSet = new TreeSet<>(list);
		 System.out.println("TreeSet: " + treeSet);

	}

}
