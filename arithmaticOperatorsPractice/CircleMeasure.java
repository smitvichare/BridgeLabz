package arithmaticOperatorsPractice;

import java.util.Scanner;

public class CircleMeasure {
	
	final static double PI=3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius,area,circumference;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle:");
		radius=sc.nextDouble();
		circumference=2*PI*radius;
		area=PI*radius*radius;
		System.out.println("The circumference of the circe is:"+String.format("%.2f", circumference));
		System.out.println("The area of the circe is:"+String.format("%.2f", area));
		

	}

}
