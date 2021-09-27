package day18arraysmultidimensonalarrays;

import java.util.Arrays;

public class MultidimensionalArrays03 {

	public static void main(String[] args) {
		
		int arr[][] = {{1,2},{3,4,5},{6}};
		
		int sum = 0;
		
		
		for(int i=0; i<arr.length; i++) {
			sum=sum + arr[i].length;
			
			
		}
		
		
		int brr[]=new int [sum];
		int idx=0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int k=0; k<arr[i].length; k++){
				
				brr[idx] = arr[i][k];
				idx++;
				
				
			}
			
		}
		System.out.println(Arrays.toString(brr));
		System.out.println(sum);
	}

}
