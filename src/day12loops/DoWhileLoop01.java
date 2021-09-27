package day12loops;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		
		
		/*
		 The difference between "While" and "Do-While"  is: 
		 do-while execute the body at least once
		 but while loop execution depends on body condition to execute
		 
		 */
		
		int i = 1;
		while(i>1){
			System.out.println("Hi this is while loop");
			i++;
				
		}
		do {
			System.out.println("Hi this is Do-while loop");
			
			i--;
		}while(i>1);
	}

}
