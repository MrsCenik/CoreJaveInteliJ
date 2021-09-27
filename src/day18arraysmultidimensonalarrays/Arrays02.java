package day18arraysmultidimensonalarrays;

import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {
		/*
		 Create an array by using short way
		 Type the code to find the sum of all array elements
		 */
		
		
		int arr[]= {11,21,32,2,-3};
		int sum= 0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];	
		}
		System.out.println(sum);
		
		
		/*
		 HOMEWORK
		 
		 1)Create a String array together with user
		 2)Find the ,multiplication of the lengths of elements.
		 */
		
		
		 Scanner scanner= new Scanner(System.in);
		 System.out.println("Enter a number for the length of the Array");
		 int length=scanner.nextInt();
		 String[] str= new String [length];
		 
		 int numOEl=1;
		 do {	 
			System.out.println("Enter "+ numOEl +". element of the Array");
			str[numOEl-1]=scanner.next();
			 numOEl++;	
		 }while(numOEl<=length);
		
		 int mult=1;
		 for(int i=0; i<length; i++) {
			 mult=mult*str[i].length();
			 
		 }
		 System.out.println(mult);
			 	 
		 scanner.close();
		
	}

}
