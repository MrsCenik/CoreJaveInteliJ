package ReplitQuestions;

public class EvenNumbers1To100 {
		/*
		 100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
		
		OUTPUT  : 
		100 98 96 94 92 … … … … 2 0
		 */
	public static void main(String[] args) {
		
		for(int i=0; i<101; i++) {
			if(i%2==0) {
				System.out.print(100-i);
				if(i!=100) {
					System.out.print(" ");
				
			}	
			}	
		}
	}
}
