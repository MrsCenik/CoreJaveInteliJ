package practice_class05;

public class SumOfNumbers {
	
	
	
	
	/*
	  Write a method that returns the sum of numbers starting with 1 to the number passed into the method.
	 */
	
	
	public static int sumOfNumbers(int num) {
		int sum=0;
		for(int i=1; i<=num; i++  ) {
			sum+=i;
			
		}
	
		return sum;
				
	}

	public static void main(String[] args) {
		
		
		System.out.println(sumOfNumbers(5));
		
		
		
	}

}
