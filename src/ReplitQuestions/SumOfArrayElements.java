package ReplitQuestions;

public class SumOfArrayElements {
	/*
	 Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.


		Eg : 

		input : {1,2,3,4,5,6,7,8};

		output: 36

	 */
	
	public static int sumArray(int[] arr) {
		int sum=0;
		for(int i =0; i<8; i++) {
			sum= sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8};
		
		System.out.println(sumArray(arr));
		
	}

}
