package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=10;
		try
		{
			b=b/a;
			System.out.println(b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic exception occured.");
		}

	}

}
