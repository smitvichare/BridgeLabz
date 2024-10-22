package stackCollections;

import java.util.Scanner;
import java.util.Stack;

public class LargestHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the heights of histogram:");
		for(int i=0;i<7;i++)
		{
			int input=sc.nextInt();
			stack.add(input);
		}
		int largest=stack.get(0);
		for(int i=0;i<stack.size();i++)
		{
			int l=stack.pop();
			if(largest<l)
			{
				largest=l;
			}
		}
		System.out.println("Largest Histogram:"+largest);

	}

}
