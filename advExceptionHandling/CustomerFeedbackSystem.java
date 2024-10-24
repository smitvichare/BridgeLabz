package advExceptionHandling;

import java.util.Scanner;

public class CustomerFeedbackSystem {
	public void feed(String feedback, int id)
	{
		try
		{
			if(feedback==null || feedback.length()<10)
				throw new InvalidFeedbackContentException("Invalid Feedback!");
			else if(id<1)
			{
				throw new FeedbackNotFoundException("Invalid ID!!");
			}
			else
			{
				System.out.println("Process success!");
			}
		}
		catch(InvalidFeedbackContentException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		catch(FeedbackNotFoundException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerFeedbackSystem b=new CustomerFeedbackSystem();
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter feedback:");
		String s=sc.nextLine();
		System.out.println("Enter feedback id:");
		int a=sc.nextInt();
		b.feed(s, a);
	}

}
