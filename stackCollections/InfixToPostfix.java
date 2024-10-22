package stackCollections;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : infix.toCharArray()) 
        {
            if (Character.isLetterOrDigit(c)) 
            {
                result.append(c);
            } 
            else if (c == '(') 
            {
                stack.push(c);
            } 
            else if (c == ')') 
            {
                while (!stack.isEmpty() && stack.peek() != '(') 
                {
                    result.append(stack.pop());
                }
                stack.pop();
            } 
            else 
            {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) 
                {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) 
        {
            result.append(stack.pop());
        }

        System.out.println("Postfix Expression: " + result.toString());
    }

    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }
}

