package ReplitQuestions;

public class MethodToSumDigitsOfString {
		/*
		   Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

			input : ade1r4d3 
			
			output : 8
		
	         Hint :
	         Use Character.isDigit()
	         Integer.valueOf()
		 */
	
	public static int sumDigits(String str) {
		int sum=0;
		String digits="0"; 
		for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                digits += ch;
            else {
            	sum += Integer.valueOf(digits);
            	 digits = "0";
            }
		
		}
		return sum + Integer.valueOf(digits);
	
	}

	public static void main(String[] args) {
		String str1 ="ade1r4d3";
				System.out.println(sumDigits(str1));
		

	}

}
