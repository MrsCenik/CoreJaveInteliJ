package practice_class04;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		  ask the user about one side of the square
		 * find the area and perimeter of the square
		 * print on the console
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a side of square to calculate area ane perimeter");
		
		int side = scanner.nextInt();
		int area = side*side;
		int peri = side*4;
		
		System.out.println("Perimeter of the square: " + peri);
		System.out.println("Area of the square: "+ area);
		
		
		
		
		
		scanner.close();
		
		
	}

}
