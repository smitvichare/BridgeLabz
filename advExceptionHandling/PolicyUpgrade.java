package advExceptionHandling;

import java.util.Scanner;

public class PolicyUpgrade {
	public void upgradePolicy(boolean allow, int id)
	{
		try
		{
			if(allow==false)
				throw new UpgradeNotAllowedException("Upgrade not allowed!");
			else if(id<1)
			{
				throw new PolicyNotFoundException("Invalid ID!!");
			}
			else
			{
				System.out.println("Process success!");
			}
		}
		catch(UpgradeNotAllowedException e)
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
		PolicyUpgrade b=new PolicyUpgrade();
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter policy id:");
		int a=sc.nextInt();
		b.upgradePolicy(false, a);
	}

}
