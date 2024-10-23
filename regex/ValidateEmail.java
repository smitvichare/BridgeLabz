package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email:");
		String s=sc.nextLine();
		String regex="^[a-z]([._+]?[a-zA-Z0-9]+)*@[a-z0-9]([a-z0-9.]+)*\\.[a-z]{2,}$";
		
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(s);
		if(m.matches())
		{
			System.out.println("Valid Email.");
		}
		else
		{
			System.out.println("Invalid Email.");
		}
		

	}

}
