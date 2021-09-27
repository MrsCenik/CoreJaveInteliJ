package ReplitQuestions;

			/*
			Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
			
				Input : {3,2,5,4,1,6}
				
				Output : 
				
				min: 1 
				
				max: 6
			*/


public class MinAndMaxNumberOfArray {

	public static void maxMin(Integer[] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}if(arr[i]>min){
				max=arr[i];
			}	
		}
		System.out.println("min: "+min);
	    System.out.println("max: "+max);
		}
		
	public static void main(String[] args) {
	
		Integer [] arr= {3,2,5,4,1,6};
		maxMin(arr);
		
		
	}

}
