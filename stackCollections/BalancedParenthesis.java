package stackCollections;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string containing parentheses: ");
        String str = sc.nextLine();
        Stack<Character> s = new Stack<>();
        boolean flag=true;
        for (char ch : str.toCharArray()) 
        {
        	if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            }	
        	else if(ch == ')' || ch == '}' || ch == ']')
        	{
        		if(s.isEmpty()==false)
        		{
        			char c=s.peek();
        			if(ch=='(' && c!=')')
        			{
        				flag=false;
        				break;
        			}
        			else if(ch=='{' && c!='}')
        			{
        				flag=false;
        				break;
        			}
        			else if(ch=='[' && c!=']')
        			{
        				flag=false;
        				break;
        			}
        			else if(s.isEmpty())
        			{
        				flag=false;
        				break;
        			
        			}
        			s.pop();
        		}
        		else
        		{
        			flag=false;
        		}
        	}
        }
        if(s.isEmpty()==false)
        {
        	flag=false;
        	
        }
        if(flag)
        {
        	System.out.println("Balanced Paranthesis");
        }
        else
        {
        	System.out.println("Unbalanced Paranthesis");
        	
        }
        	
	}

}
