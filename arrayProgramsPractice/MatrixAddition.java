package arrayProgramsPractice;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] a1=new int[3][2];
		int[][] a2=new int[3][2];
		int[][] result=new int[3][2];
		System.out.println("Enter martrix1:");
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1[i].length;j++)
			{
				a1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter matrix2:");
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				a2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				result[i][j]=a1[i][j]+a2[i][j];
			}
		}
		System.out.println("Resultant Matrix:");
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
