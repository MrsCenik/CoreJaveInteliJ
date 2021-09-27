package programmingforbeginner;

import java.util.Stack;

//import java.util.HashMap;

public class SpecialCharacterSpecialOrder {
	/*
	 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

		An input string is valid if:
		
		1)Open brackets must be closed by the same type of brackets.
		2)Open brackets must be closed in the correct order.
			 */
	
	public static boolean isValid(String str) {
		
        Stack<Character> stack = new Stack<Character>();
        int n = str.length();
        if(n<2) return false;
        char[] arr = str.toCharArray();
        for(char c: arr){
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else if(stack.isEmpty())
                return false;
            else {
                char pop = stack.pop();
                if((c == ')' && pop != '(') || (c == '}' && pop != '{')
                  || (c == ']' && pop != '['))
                    return false;
            }
        }
        return stack.isEmpty();
	}

		public static void main(String[] args) {
		System.out.println(isValid("()"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("([)]"));
		System.out.println(isValid("{[]}")); 
	}

}
