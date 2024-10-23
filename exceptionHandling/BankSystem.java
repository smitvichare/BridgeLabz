package exceptionHandling;

public class BankSystem {
	
	public void withdraw(int amount,int balance)
	{
		try
		{
			if(amount>balance);
			throw new InsufficientFundsException("Insufficient Balance!");
		}
		catch(InsufficientFundsException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankSystem b=new BankSystem();
		b.withdraw(456,123);
	}

}
