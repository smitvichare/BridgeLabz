package advExceptionHandling;

import exceptionHandling.InvalidAgeException;

public class PolicyApplication {

	
		// TODO Auto-generated method stub
		public void age(int age)
		{
			try
			{
				if(age<18);
				throw new InvalidAgeException("too young,under 18.");
			}
			catch(InvalidAgeException e)
			{
				System.out.println("Error: "+e.getMessage());
			}
		}
		public void driving(int points)
		{
			try
			{
				if(points<40);
				throw new PoorDrivingRecordException("Bad driver.");
			}
			catch(PoorDrivingRecordException e)
			{
				System.out.println("Error: "+e.getMessage());
			}
		}
		public void health(int points)
		{
			try
			{
				if(points<30);
				throw new HealthIssueException("Bad health.");
			}
			catch(HealthIssueException e)
			{
				System.out.println("Error: "+e.getMessage());
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			PolicyApplication b=new PolicyApplication();
			b.age(16);
			b.driving(27);
			b.health(20);
		}


	

}
