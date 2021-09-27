package practice_class06;

import java.util.ArrayList;

public class FindUnique {
	/*
	 14. Write a method that accepts an Array and returns the number/s that are not repeated in an ArrayList. 
	 Method returns the numbers in aN ArrayList. EX: arr = {1,1,2,2,3,3,4,5}  ---> [4,5]
	 */
	
	public static ArrayList<Integer> findUnique(int[] arr){
		ArrayList<Integer>a1=new ArrayList<>();
		for(int num:arr) {
			int count=0;
			for(int num1:arr) {
				if(num==num1) {
					count++;	
				}
			}
			if(count==1&&!a1.contains(num)) {
				a1.add(num);
			}		
		}	
		return a1;
	}
	public static void main(String[] args) {
		System.out.println(findUnique(new int[] {1,2,3,1,4,2,3,2,4,6,8,9}));	
	}
}
