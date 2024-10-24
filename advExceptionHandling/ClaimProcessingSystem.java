package advExceptionHandling;

public class ClaimProcessingSystem {
	
	public void processClaim(boolean record, int amount, int coverage)
	{
		try
		{
			if(record==false)
				throw new FraudulentClaimException("Fruad!!");
			else if(amount>coverage)
			{
				throw new InvalidClaimAmountException("Invalid amount!!");
			}
			else
			{
				System.out.println("Process success!");
			}
		}
		catch(FraudulentClaimException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		catch(InvalidClaimAmountException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaimProcessingSystem b=new ClaimProcessingSystem();
		b.processClaim(true, 5000, 2000);
	}
}
