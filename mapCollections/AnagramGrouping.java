package mapCollections;

import java.util.*;

public class AnagramGrouping {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat","cat"};
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (String word : words) {
            String sorted = sortWord(word);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<String>());
            }
            map.get(sorted).add(word);
        }

        System.out.println(map.values());
    }

    private static String sortWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
