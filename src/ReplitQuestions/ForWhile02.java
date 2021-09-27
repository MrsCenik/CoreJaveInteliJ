package ReplitQuestions;

import java.util.Scanner;

public class ForWhile02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

			Input :
			
			30 and 40
			
			Expected OutPut:
			
			GCD for 30 and 40 = 10
			
			LCM for 30 and 40 = 120
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num1=scanner.nextInt();
		System.out.println("Enter an other intiger");
		int num2=scanner.nextInt();
		
		int gcd = 1;
		for (int i = 1; i <= num1 && i <= num2; i++) {
	        if (num1 % i == 0 && num2 % i == 0) {
	        	gcd=i;
	        	
	        }
	        
		}
		int lcm = (num1 * num2) / gcd;
		
		System.out.println("GCD for "+num1+" and "+num2+" = " + gcd);
		System.out.println("LCM for "+num1+" and "+num2+" = " + lcm);
		
		
		
		
		
		scanner.close();		
	}

}
