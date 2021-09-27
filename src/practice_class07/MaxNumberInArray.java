package practice_class07;

import java.util.Arrays;
import java.util.Random;

public class MaxNumberInArray {
	//4.Given a 2d array of int, find the biggest number(int) in the array and print it.
	
	
	static int[][] ArrayGenerator(int outerSize, int innerSize){
		int[][] arr = new int[outerSize][innerSize];
        for(int i = 0; i < outerSize; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = new Random().nextInt(20);
            }
        }
       return arr;
    }


	 static int findMax(int[][] arr){
	        int max = Integer.MIN_VALUE;
	        for(int[] eachArr : arr){
	            for(int num : eachArr){
	                if(num > max)
	                    max = num;
	            }
	        }
	        System.out.println(Arrays.deepToString(arr));
	        return max;
	}

	public static void main(String[] args) {

		System.out.println(findMax(ArrayGenerator(3,5)));
	}

}
