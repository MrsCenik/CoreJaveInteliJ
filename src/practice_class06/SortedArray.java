package practice_class06;

import java.util.Arrays;
import java.util.Random;

public class SortedArray {
	/*
	 *    11. Write a method that accepts an Array of ints returns the sorted Array in ascending order.Do not use the sort method.
	 */

	static int[] singleArrayGenerator(int num){
        int[] arr = new int[num];
        for(int i = 0; i < num; i++)
            arr[i] = new Random().nextInt(100);
        return arr;
    }
	public static int[] sortedArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
			
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(Arrays.toString(sortedArray(singleArrayGenerator(10))));
		
		
	}
}
