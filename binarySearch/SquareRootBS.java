package binarySearch;

import java.util.Scanner;

public class SquareRootBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Target:");
		int t=sc.nextInt();
		SquareRootBS obj=new SquareRootBS();
		double res=obj.sqrtNum(t);
		System.out.println("The square root of the number is:"+res);
		
	}
	public double sqrtNum(int t)
	{
		double l=0;
		double r=t;
		double m=0;
		double sqrt=0;
		while(r-l>0)
		{
			m=(l+r)/2;
			sqrt=m*m;
			if(Math.abs(sqrt-t)<0.01)
			{
				return m;
			}
			else if(sqrt<t)
			{
				l=m;
			}
			else
			{
				r=m;
			}
		}
		return -1;
	}

}
