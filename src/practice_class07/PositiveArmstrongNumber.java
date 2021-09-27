package practice_class07;

import java.util.ArrayList;

public class PositiveArmstrongNumber {
	/*
	 5. Write a method that collects the all positive Armstrong numbers up to the number that is passed in. 
	 Armstrong is a number that is equal to the sum of its own digits and each digit being raised to the power of the number of digits. 
	 EX: 371 = 3^3 + 7^3 + 1^3 => 371
	 */
	public static int numOfDigits(int num) {
		int digits=0;
		while(num>0) {
			num/=10;
			digits++;
		}
		
		return digits;
	}
	
	public  static  boolean isArmstrong(int num){
		String str = String.valueOf(num);
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			int each=Integer.parseInt(str.substring(i, i+1));
			
			sum+=Math.pow(each, numOfDigits(num));
		}	
	return sum==num;	
	}
	
	static ArrayList<Integer> listOfArmstrong(int num){
		ArrayList<Integer> a1= new ArrayList<>();
		for(int  i=0; i<=num; i++) {
		  if(isArmstrong(i)) {
			  a1.add(i);
			  
		  }
		}
		return a1;
	}
	public static void main(String[] args) {
		System.out.println(listOfArmstrong(10000));
		
	}

}
