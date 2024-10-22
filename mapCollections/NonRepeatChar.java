package mapCollections;

import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a string: ");
	     String input = sc.nextLine();

	     HashMap<Character, Integer> charmap = new HashMap<>();
	     for (char c : input.toCharArray()) {
	            if (charmap.containsKey(c)) {
	                charmap.put(c, charmap.get(c) + 1);
	            } else {
	                charmap.put(c, 1);
	            }
	      }
	     for (char c : input.toCharArray()) {
	    	 int f=charmap.get(c);
	    	 if(f==1)
	    	 {
	    		 System.out.println(c);
	    		 break;
	    	 }
	     }
	     
	}

}
