package mapCollections;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.get(c) + 1);
            } else {
                freqMap.put(c, 1);
            }
        }

        System.out.println("Character Frequencies:");
        for (char c : freqMap.keySet()) {
            System.out.println(c + ": " + freqMap.get(c));
        }
    }
}
