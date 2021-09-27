//EKSIK COZUM




package practice_class06;
import java.util.Random;

public class MaxAnd2ndMax {

	/*
	  9. Write a method that accepts an Array of integers and returns the max. and 10. 
	  Write a method that accepts an Array of integers and returns the second max.
	 */
	
	//this is automatic array generator
    static int[] singleArrayGenerator(int num){
        int[] arr = new int[num];
        for(int i = 0; i < num; i++)
            arr[i] = new Random().nextInt(100);
        return arr;
    }
    static String findMaxs(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        for(int num : arr){
            if(num > max) {
                secondMax = max;
                max = num;
            }else if(num > secondMax)
                secondMax = num;
        }
        return "max is " + max + " secondMax is " + secondMax;
    }

	
//	public static String maxArray(int[] arr) {
//		int max =Integer.MIN_VALUE;
//		int secondMax=Integer.MIN_VALUE;
//		for(int num:arr) {
//			if(num>max) {
//				secondMax=max;
//				max=num;
//				
//			}else if(num>secondMax) {
//				num=secondMax;
//			}
//		}
//
//		return "max is " + max +" second max is "+ secondMax;
//	}
//	
	public static void main(String[] args) {
		

		

}
}
