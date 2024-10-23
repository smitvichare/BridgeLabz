package exceptionHandling;

import java.util.Scanner;

public class ExceptionHierarchy {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter integer: ");
            int num1 = sc.nextInt();
            
            if(num1==0)
            {
            	System.out.println(10/0);
            }
            else if(num1==1)
            {
            	String s=null;
            	System.out.println(s.length());
            }
            else
            {
            	int a[]=new int[3];
            	System.out.println(a[9]);
            }         	
            
            
        } 
        catch (NullPointerException e) {
            System.out.println("Error: null pointer");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: cant divide by 0");
        }
        catch(Exception e)
        {
        	System.out.println("General Error:"+e);
        }
	}
}
