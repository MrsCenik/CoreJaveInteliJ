package day10loops;

public class ForLoop01 {

	public static void main(String[] args) {
		//Print "Hell0 world!" on the console 10 times...
		
		
		//1.Way
		System.out.println("Hello world!");
		System.out.println("Hello world!");
		System.out.println("Hello world!");
		System.out.println("Hello world!");
		System.out.println("Hello world!");
		System.out.println("Hello world!");
		System.out.println("Hello world!");
		System.out.println("Hello world!");
		System.out.println("Hello world!");
		System.out.println("Hello world!");
		
		System.out.println("=================");
		//2.Way : Use for-loop
		//for(Starting ; Condition; Increment or Decrement){ }
	
		
		for(int i = 1; i<=10; i++) {
			System.out.println("Hello World!");
			
		}
		
		// Print integers from 13 to 15 on the console in the same line with a space between them
		for(int i=13; i<=15; i++) {
			System.out.print(i+" "); //we just delete "ln" of "System.out.print'ln'" to put the result in the same line
			
		}
		System.out.println();//it helps to go next line for other result
		
		// Print integers from 16 to 14 on the console in the same line with a space between them
		for(int i=16; i>=14; i--) {
			System.out.print(i+" ");
	}
		System.out.println();
		// Print the even integers from 15 to 100 on the console
		//1.Way
		
		for(int i = 15; i < 101; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}			
		}
		
		System.out.println();
			
		//2.Way
			
		for(int i=16; i<101; i=i+2) {
			System.out.print(i + " ");
		}
		System.out.println();
		//Print the odd integers from 120 to 65 on the console
		for (int i =120; i>64; i--) {
			if (i%2!=0) {
				
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		for (int i=119; i>64; i=i-2 ) {
			
			System.out.print(i+" ");
		}
		System.out.println();
		//Print the integers divisible by 4 and 6 from 13 to 130 
		//1.way
		for(int i = 13; i<=130; i++) {
			if(i%4==0 && i%6==0) {
				System.out.print(i+" ");
				
			}
			
		}
		System.out.println();
		//2.way
		
		for(int i = 24; i<=130; i=i+12) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		// Print the every character of a String by putting space between every consecutive character.
		// Example: Suleyman ==> S u l e y m a n
		String name = "Suleyman";
		
		for(int i=0; i<name.length(); i++) {
			System.out.print(name.charAt(i)+" ");
			
		}
		
		}
/*
 for loop syntax: 
 for(	;	;	) {
			
		}
 */
}

