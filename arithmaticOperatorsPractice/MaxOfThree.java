package arithmaticOperatorsPractice;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] number=new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter "+(i+1)+" number:");
			number[i]=sc.nextInt();
			
		}
		if(number[0]>number[1] && number[0]>number[2])
		{
			System.out.println(number[0]+" is the greatest of the three.");
		}
		else if(number[1]>number[2])
		{
			System.out.println(number[1]+" is the greatest of the three.");
		}
		else
		{
			System.out.println(number[2]+" is the greatest of the three.");
		}

	}

}
