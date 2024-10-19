package linkedListCollections;

import java.util.LinkedList;
import java.util.Scanner;

public class NthNodeEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> a = new LinkedList<>();
		a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(9);
        a.add(8);
        a.add(7);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N:");
        int n=sc.nextInt();
        int len=a.size();
        a.remove(len-n);
        System.out.println(a);
        

	}

}
