package ReplitQuestions;

import java.util.Arrays;

public class MethodMergeTwoArrays {
	/*
		 Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.
	
			Input1={1,2,3,4}
			
			Input2={5,6}
			
			Output={1,2,3,4,5,6}
	 */
	
	public static int [] mergeArrays(int arr[], int arr1[]) {
		int str[]=new int[6];
		int n=arr.length;
		int n1=arr1.length;
		
		for(int i =0; i<n; i++){
			str[i]=arr[i];		
		}
		for(int j=0; j<n1; j++) {
			str[n+j]=arr1[j];		
		}
		return str;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4};
		int arr1[]= {5,6};
		
		System.out.println(Arrays.toString(mergeArrays(arr, arr1)));
	}

}
