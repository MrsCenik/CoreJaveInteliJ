package practice_class08;

public class ReverseNumberAsStringReturnInt {
	//6.Write a method that reverses a number. Method accepts an integer and returns an int. EX: 123 --> 321
	
	public static int reverseNumber(int num) {
		String result=""; 
		String str = String.valueOf(num);
		
		//We add this condition because we can have negative number. If we have negative number, we add - sign to handle it. 
		if(num<0) {
			str = str.substring(1);
			result+="-";	
		}
		result+= new StringBuilder(str).reverse().toString(); //+ sign here is important for negative input
	return Integer.parseInt(result);
	
	}
	public static void main(String[] args) {
		System.out.println(reverseNumber(-1234));
	}
}