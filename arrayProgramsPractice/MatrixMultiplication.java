package arrayProgramsPractice;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] a1=new int[2][2];
		int[][] a2=new int[2][2];
		int[][] result=new int[2][2];
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
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2[i].length;j++)
			{
				for(int k=0;k<a1[i].length;k++)
				{
				
					result[i][j]+=a1[i][k]*a2[k][j];
				}
			}
		}
		System.out.println("Resultant Matrix:");
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result[i].length;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
