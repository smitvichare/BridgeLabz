package functionalInterface;

import java.util.Scanner;

interface Sum
{
	int add(int a,int b);
}

public class CustomInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A and B:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		Sum s= (a,b)->a+b;
		int res=s.add(num1, num2);
		System.out.println("Result: "+res);
	}

}
