package practice_class08;

public class SumNumOfString {
	 //7.Write a method that gets any number from a string it gets and returns the total of those number.EX :extractNum("aa2aa3") ==> 2+3 ==> 5.

	public static int sumNumOfString(String str) {
		int sum=0;
		for(int i = 0 ; i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum+= Integer.parseInt(str.charAt(i)+"");		
			}	
		}
	
		return sum;	
	}
	public static void main(String[] args) {
		System.out.println("Sum of the digits in the given String is "+sumNumOfString("and22mf4mkmm4"));
	}
}
