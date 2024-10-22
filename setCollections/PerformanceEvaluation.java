package setCollections;

import java.util.*;

public class PerformanceEvaluation {
    public static void main(String[] args) {
        int dataSize = 1_000_000;
        List<Integer> data = new ArrayList<>();
        Random rand = new Random();
        
        for (int i = 0; i < dataSize; i++) {
            data.add(rand.nextInt(dataSize));
        }
        
        // Measure time for HashSet
        Set<Integer> hashSet = new HashSet<>();
        long startTime = System.nanoTime();
        for (int num : data) {
            hashSet.add(num);
        }
        long endTime = System.nanoTime();
        System.out.println("HashSet add time: " + (endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        for (int num : data) {
            hashSet.contains(num);
        }
        endTime = System.nanoTime();
        System.out.println("HashSet contains time: " + (endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        for (int num : data) {
            hashSet.remove(num);
        }
        endTime = System.nanoTime();
        System.out.println("HashSet remove time: " + (endTime - startTime) / 1_000_000 + " ms");
        
        // Measure time for LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        startTime = System.nanoTime();
        for (int num : data) {
            linkedHashSet.add(num);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet add time: " + (endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        for (int num : data) {
            linkedHashSet.contains(num);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet contains time: " + (endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        for (int num : data) {
            linkedHashSet.remove(num);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet remove time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Measure time for TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        startTime = System.nanoTime();
        for (int num : data) {
            treeSet.add(num);
        }
        endTime = System.nanoTime();
        System.out.println("TreeSet add time: " + (endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        for (int num : data) {
            treeSet.contains(num);
        }
        endTime = System.nanoTime();
        System.out.println("TreeSet contains time: " + (endTime - startTime) / 1_000_000 + " ms");

        startTime = System.nanoTime();
        for (int num : data) {
            treeSet.remove(num);
        }
        endTime = System.nanoTime();
        System.out.println("TreeSet remove time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
