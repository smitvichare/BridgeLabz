package advExceptionHandling;

import java.util.Scanner;

public class InsuranceQuoteSystem {

	public void generateQoute(int age,int hp,int vehsize) 
	{
		try
		{
			if(age<1 || hp<0 || vehsize<0)
				throw new InvalidInputException("Invalid input");
			else if(hp==0)
			{
				throw new QuoteGenerationException("hp cannot be 0");
			}
			else
			{
				System.out.println("New qoute:"+(age*vehsize/hp*1000));
			}
		}
		catch(InvalidInputException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		catch(QuoteGenerationException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsuranceQuoteSystem b=new InsuranceQuoteSystem();
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter HP:");
		int hp=sc.nextInt();
		System.out.println("Enter vehicle size:");
		int vehsize=sc.nextInt();
		b.generateQoute(age,hp,vehsize);
	}
}
