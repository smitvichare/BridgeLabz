package arithmaticOperatorsPractice;
import java.util.Scanner;


public class AddSub {
	
	public static void main(String[] args) {
	
		int num1,num2,add,sub;
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter First Number:");
		num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		num2=sc.nextInt();
		add=num1+num2;
		sub=num1-num2;
		System.out.println("Addition of both numbers:"+add);
		System.out.println("Subtraction of both numbers:"+sub);
	
	
	}
		
	

}
