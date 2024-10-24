package advExceptionHandling;

public class PolicyRenewal {

	public void renewPolicy(boolean expire, boolean payment, boolean compliance)
	{
		try
		{
			if(expire==false)
				throw new PolicyExpiredException("Policy expired!");
			else if(payment==false)
			{
				throw new PaymentPendingException("Payment pending!!");
			}
			else if(compliance==false)
			{
				throw new NonComplianceException("Be compliant!!");
			}
			else
			{
				System.out.println("Process success!");
			}
		}
		catch(PolicyExpiredException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		catch(PaymentPendingException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		catch(NonComplianceException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolicyRenewal b=new PolicyRenewal();
		b.renewPolicy(false, true, true);
	}
}
