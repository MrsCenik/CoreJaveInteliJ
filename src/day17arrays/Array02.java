package day17arrays;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		
		String s[] = new String [3];
		
		s[0] = "Ali Can";
		s[1] = "Veli Han";
		s[2] = "Ayse Tan";
		
		System.out.println(Arrays.toString(s));
		
		//How to print all elements one by one on the console
		//1. Way : Not recommended
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		
		//2. Way: Use Loops
	
		for (int i=0; i<s.length; i++){
			
			System.out.println("From Loop: "+s[i]);  
		}
	
		/*
		 1) Create a double array whose length is 6
		 2) Type a program to add all elements inside the array
		 3) Print the sum on the console. 
		 */
		
//		double []d= new double [6]; ==>that way to type all elements line by line is boring
//		d[0] = 1.2;
//		d[0] = 3.5;
//		.
//		.
		
		double []d= {1.2, 3.5, 4.21, 12.3, 45, 0.78};
		double sum = 0;
		
		for (int i=0; i<d.length; i++) {
			
			sum=sum+ d[i];
			
			}
		
			System.out.println("Sum of all elements in array d: "+sum);
		
		
		
		
	}

}
