package ReplitQuestions;


/*
 Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder
   and checks if sentence is palindrome or not
   (without case sensitivity)
   Eg : input : I love Java
   Output: "Reversed sentence : avaJ evol I .
   It is not a palindrome"
 */
public class StringBuilderReverse {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("I love Java");
		str.reverse();
		str.trimToSize();
		
		System.out.println(str);
		
		

	}

}
