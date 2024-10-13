package stringProgramsPractice;

import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();

		int[] counter=new int[256];
		int max = 0;
        int start = 0;  // Starting index of the current substring

        // Initialize lastSeen array with -1, meaning no character has been seen yet
        for (int i = 0; i < 256; i++) {
            counter[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // If the character was seen before and is inside the current window, move the start pointer
            if (counter[current] >= start) {
            	//System.out.println(counter[current]);
                start = counter[current] + 1;
            }

            // Update the last seen index of the current character
            counter[current] = i;

            // Update the maximum length of the substring found so far
            max= Math.max(max, i - start + 1);
        }
		System.out.println(max);
		
	}

}