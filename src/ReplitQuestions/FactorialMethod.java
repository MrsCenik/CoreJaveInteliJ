package ReplitQuestions;

public class FactorialMethod {
	
	
	/*
	 Write a return method that accepts an integer as input and calculates factorial and prints like output.

		Input : 6
		
		Output: 6!=6*5*4*3*2*1=720
			 */

	public static int factorial(int num) {
		
		int i,f=1;
		for(i=1; i<=num; i++){
		f=f*i;	
		}
		return f;		
	}
	public static void main(String[] args) {
		System.out.println("6!=6*5*4*3*2*1="+factorial(6));
	}

}
