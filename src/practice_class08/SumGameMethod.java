package practice_class08;

import java.util.Scanner;

public class SumGameMethod {
	//2.Write a method where u ask a user to enter a number until the total is at least 100 or number of trials is equal to 3. 
	//EX: 1,2,3 --> You ran out of trials! EX2: 1,2,97 --> You made it! your sum is 100.
	
	public static void sumGame() {
		Scanner scanner = new Scanner(System.in);
		int sum, trails, input;
		
		sum=trails=0;
		while(sum<100 && trails<3) {
			System.out.println("Enter a number");
			input = scanner.nextInt();
			sum+=input;
			trails++;	
			if(trails==3) {
				break;
				
			}
		}
		if(sum>=100) {
			System.out.println("You made it! Your sum is "+ sum);
		
			
		}else if(trails == 3) {
			System.out.println("You ran out of trails!");		
		}
		
		scanner.close();
	}
	public static void main(String[] args) {
		
		sumGame();
	}
}