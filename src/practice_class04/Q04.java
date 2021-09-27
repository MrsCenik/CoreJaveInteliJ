package practice_class04;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter two integers
        1)Swap the integers
        2)EXAMPLE:
         INPUT: a= 3
                b= 5
         OUTPUT: a= 5
               b= 3
              
               */  
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter int1");
		int int1= scanner.nextInt();
		System.out.println("Enter int2");
		int int2= scanner.nextInt();
		System.out.println("Before swap: " + "a= " + int1+ " "+"b= " + int2);
		
		
		int1=int1+int2;
		int2= int1-int2;
		int1=int1-int2;
		
		System.out.println("After swap: " + "a= " + Math.abs(int1)+" "+ "b= " +Math.abs(int2));
	
		
		scanner.close();
		

	}

}
