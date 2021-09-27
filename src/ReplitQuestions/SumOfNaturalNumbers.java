package ReplitQuestions;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		/*
		Write a Program to find the sum of natural numbers from 1 to 100.
		OUTPUT 		:   Sum of Natural Numbers 5050
		*/
		
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;		
		}
		System.out.println("Sum of Natural Numbers " + sum);
	}

}
