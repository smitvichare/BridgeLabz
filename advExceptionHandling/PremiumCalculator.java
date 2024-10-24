package advExceptionHandling;

import java.util.Scanner;

public class PremiumCalculator {


		public void age(int a)
		{
			try
			{
				if(a<1)
					throw new DataNotFoundException("Data missing");
				else
					System.out.println("Valid age");
			}
			catch(DataNotFoundException e)
			{
				System.out.println("Error: "+e.getMessage());
			}
		}
		public void premium(int a,int b)
		{
			try
			{
				if(b==0)
					throw new CalculationException("calculation wrong!");
				else
				{
					System.out.println("Premium:"+(a*50));
				}
			}
			catch(CalculationException e)
			{
				System.out.println("Error: "+e.getMessage());
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PremiumCalculator b=new PremiumCalculator();
			Scanner sc=new Scanner(System.in); 
			System.out.println("Enter age:");
			int a=sc.nextInt();
			b.age(a);
			System.out.println("Enter data1: ");
			int data1=sc.nextInt();
			System.out.println("Enter data2: ");
			int data2=sc.nextInt();
			b.premium(data1,data2);
			
		}

	

}
