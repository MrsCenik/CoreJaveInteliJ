package ReplitQuestions;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
	/*	Write java code checking the number is Perfect number or not.

		Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
		Input :6 Output:6 is Perfect Number Input :7 Output:7 is not Perfect Number
	 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an intiger");
		int num=scanner.nextInt();
		int sum=1;
		for(int i=2; i<=num/2; i++) {
			if(num%1==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			System.out.println(num+ " is Perfect Number");
		}else {
			System.out.println(num+ " is not Perfect Number");			
		}			
		scanner.close();
	}
}
