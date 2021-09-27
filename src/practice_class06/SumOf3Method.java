package practice_class06;

public class SumOf3Method {
	/*
	 12. Write a method that accepts an array and returns true if the sum of all 3's in the array is exactly 9.
	  EX: Input : {2,3,5,3,6,3,7} output :true Input : {2,3,4,5,6,3,7} output :false
	 */

	
	public static boolean sumOf3(int[] arr) {
		
		int counter=0;
		for(int num:arr) {
			if(num==3) {
				counter++;
			}		
		}
	return counter==3;	
	}
	public static void main(String[] args) {
		System.out.println(sumOf3(new int[]{2,3,5,3,6,3,7}));
	}
}
