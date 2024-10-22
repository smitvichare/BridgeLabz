package setCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetBehaviour 
{
	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 2, 8, 3, 7, 8, 5, 3, 2, 1, 9);

        Set<Integer> hashSet = new HashSet<>(list);
        Set<Integer> linkedHashSet = new LinkedHashSet<>(list);
        Set<Integer> treeSet = new TreeSet<>(list);

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
