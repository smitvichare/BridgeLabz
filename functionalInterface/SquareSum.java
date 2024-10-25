package functionalInterface;

interface squares
{
	int square(int a);
	
	default void print(int res)
	{
		System.out.println("Result: "+res);
	}
}
public class SquareSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squares s=(a)->a*a;
		int i=3;
		int res=s.square(i);
		s.print(res);
		
	}

}
