package day03increment_decrement_operators;

public class Concatenation01 {

	public static void main(String[] args) {
		// Concatenation: To join string
		
		String fn1= "Ali";
		String ln1= "Can";
		
		System.out.println(fn1 + ln1); //AliCan
		System.out.println(fn1 + " " + ln1); //Ali Can
		
		String fn2 = "Ayse "; //if we put a space in the string we see the space output
		String ln2 = "Han";
		
		System.out.println(fn2+ln2); 
		
		//Questions:
		System.out.println(fn1+2+3); //Ali23 => string can not be count like number so it will be 123
		
		System.out.println(fn1+(2+3)); //java always starts in the parenthesis so it will be 5 => Ali5
		
		System.out.println(2+3+fn1); //Java starts from the left so it will be 5Ali
		
		System.out.println(2+fn1+3*2); //Java starts with multiplication so it will be 2ALi6 
		
		//Question: By using following variables print 61Study-1 on the console
		
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		
		System.out.println((numA*numB)+""+(numB-numA)+ str1 + (numA-numB)); //My answer
		
		System.out.println((numA*numB)+((numB-numA)+ str1) + (numA-numB)); //Hasan's answer
		
		System.out.println(numA*numB*(numA+numB)*numA+(numB-numA)+ str1 + (numA-numB)); //Teacher's answer	
	}

}
