package ReplitQuestions;

public class FindEvenNumbers {

	public static void main(String[] args) {
		/*
		 Print even numbers from 20 to 0 but do not use decrement (i--).
		
		 OUTPUT  : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
		 */
		
		System.out.print("Even Numbers from 20 to 0 are:");
		for (int i=0; i<=20; i++) {
			if(i%2==0) {
				System.out.print(20-i);
			}
			if(i!=0) {
				System.out.print(" ");
			}
		}
	}

}
