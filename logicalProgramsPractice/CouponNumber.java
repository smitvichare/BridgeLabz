package logicalProgramsPractice;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,s,counter=0;
		HashSet<Integer> coupons=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		System.out.println("Enter number of coupons needed(N):");
		num=sc.nextInt();		
		System.out.println("Generated Coupon Numbers:");
		while(coupons.size()<num) 
		{
			s=random.nextInt(num)+1;
			System.out.println(s);
			coupons.add(s);
			counter++;			
		}
		System.out.println(coupons);
		System.out.println("Attempts: "+counter);
			

	}

}
