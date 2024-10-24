package advExceptionHandling;

import java.util.Scanner;

public class PaymentProcessingSystem {
	public void processPayment(boolean pay, int id)
	{
		try
		{
			if(pay==false)
				throw new PaymentFailedException("Payment failed!");
			else if(id<1)
			{
				throw new InvalidPaymentDetailsException("Invalid ID!!");
			}
			else
			{
				System.out.println("Process success!");
			}
		}
		catch(PaymentFailedException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		catch(InvalidPaymentDetailsException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessingSystem b=new PaymentProcessingSystem();
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter payment id:");
		int a=sc.nextInt();
		b.processPayment(true, a);
	}

}
