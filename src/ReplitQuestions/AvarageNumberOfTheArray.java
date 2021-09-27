package ReplitQuestions;

public class AvarageNumberOfTheArray {
	/*
	 Write a java program that calculates the average value of array elements

		input[]= {1,2,3,4,5,6,7}
		
		Output : 4
	 */

	public static void main(String[] args) {
		Integer [] arr= {1,2,3,4,5,6,7};
		int sum=0;
		int avr=0;
		 for(int i= 0; i<arr.length; i++) {
			 sum=sum+arr[i];
			  }
		 avr=sum/arr.length;
		System.out.println(avr);

	}

}
