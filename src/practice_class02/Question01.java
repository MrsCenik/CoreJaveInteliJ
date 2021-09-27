package practice_class02;

public class Question01 {

	public static void main(String[] args) {
				/*
				  print even numbers from 100 to 0 but do not use decrement(i--).
		EXAMPLE:
		     INPUT      :
		     OUTPUT  : 100 98 96 94 92 …….2 0
				 */
		for(int i=100; i>=0; i--) {
			if(i%2==0) {
				System.out.print(i + " ");	
			}
	}
	}
}
