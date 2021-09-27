package ReplitQuestions;
		/*
		 Write a return method that accepts more than one integer as parameter and prints the sum of integers
		 Method name = sum
			if you call method like that 
			sum(1,2,3) output =6
			sum(1,2,3,4,5) output =15
			sum(1,2) output=3
		 */

public class Varargs {
	public static int sumVarargs(int ...a) {
		int sum=0;
		
		for(int w:a) {
		
			sum+= w;	
		}
	
		
		return sum;
		
	}

	public static void main(String[] args) {
		System.out.println(sumVarargs(1, 2, 3));

	}

}
