package mapCollections;


import java.util.HashMap;

import java.util.Map;



public class SortMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 50);
        map.put("banana", 20);
        map.put("cherry", 30);
        map.put("date", 40);

        map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue())
            .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}

