package logicalProgramsPractice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fibonacci=new int[20];
		System.out.println("The first 20 terms of the Fibonacci Series are:");
		fibonacci[0]=0;
		fibonacci[1]=1;
		System.out.print(fibonacci[0]+" ");
		System.out.print(fibonacci[1]+" ");
		for(int i=2;i<20;i++)
		{
			fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
			System.out.print(fibonacci[i]+" ");
		}
	}

}
