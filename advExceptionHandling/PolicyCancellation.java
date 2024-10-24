package advExceptionHandling;

import java.util.Scanner;

public class PolicyCancellation {

	public void cancelPolicy(boolean allow, int id)
	{
		try
		{
			if(allow==false)
				throw new CancellationNotAllowedException("Cancellation not allowed!");
			else if(id<1)
			{
				throw new PolicyNotFoundException("Invalid ID!!");
			}
			else
			{
				System.out.println("Process success!");
			}
		}
		catch(CancellationNotAllowedException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		catch(PolicyNotFoundException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolicyCancellation b=new PolicyCancellation();
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter policy id:");
		int a=sc.nextInt();
		b.cancelPolicy(true, a);
	}

}
