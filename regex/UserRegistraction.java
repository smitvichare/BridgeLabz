package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name:");
		String fname=sc.nextLine();
		String fnamer="^[A-Z][a-z]{2,}$";
		//String regex="^[a-z]([._+]?[a-zA-Z0-9]+)*@[a-z0-9]([a-z0-9.]+)*\\.[a-z]{2,}$";
		
		Pattern p1=Pattern.compile(fnamer);
		Matcher m1=p1.matcher(fname);
		if(m1.matches())
		{
			System.out.println("Valid First Name.");
		}
		else
		{
			System.out.println("Invalid First Name.");
		}
		System.out.println("Enter last name:");
		String lname=sc.nextLine();
		String lnamer="^[A-Z][a-z]{2,}$";
		
		Pattern p2=Pattern.compile(lnamer);
		Matcher m2=p2.matcher(lname);
		if(m2.matches())
		{
			System.out.println("Valid Last Name.");
		}
		else
		{
			System.out.println("Invalid Last Name.");
		}
		System.out.println("Enter email:");
		String email=sc.nextLine();
		String emailr="^[a-z]{3}(\\.[a-z]{3}){0,1}@[a-z]{2}\\.[a-z]{2}(\\.[a-z]{2}){0,1}$";
		
		Pattern p3=Pattern.compile(emailr);
		Matcher m3=p3.matcher(email);
		if(m3.matches())
		{
			System.out.println("Valid Email.");
		}
		else
		{
			System.out.println("Invalid Email.");
		}
		System.out.println("Enter Phone Number:");
		String mobile=sc.nextLine();
		String mobiler="^[0-9]{2}[ ][0-9]{10}$";
		
		Pattern p4=Pattern.compile(mobiler);
		Matcher m4=p4.matcher(mobile);
		if(m4.matches())
		{
			System.out.println("Valid Phone number.");
		}
		else
		{
			System.out.println("Invalid Phone number.");
		}
		System.out.println("Enter password:");
		String pass=sc.nextLine();
		String passr="^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-z0-9A-Z]).{8,}$";
		
		Pattern p5=Pattern.compile(passr);
		Matcher m5=p5.matcher(pass);
		if(m5.matches())
		{
			System.out.println("Valid Password.");
		}
		else
		{
			System.out.println("Invalid Password.");
		}
		


	}

}
