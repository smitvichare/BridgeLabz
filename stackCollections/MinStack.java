package stackCollections;

import java.util.Scanner;
import java.util.Stack;

public class MinStack {
	public static void main(String[] args) {
		 
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        System.out.println("Enter Stack:");
        for(int i=0;i<10;i++)
        {
        	int d=sc.nextInt();
        	s.push(d);
        }
        int min=s.get(0);
        for(int i=0;i<10;i++)
        {
        	if(min>s.get(i))
        		min=s.get(i);
        }
        System.out.println("Min : "+min);
        
	}

}
