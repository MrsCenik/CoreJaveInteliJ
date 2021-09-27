package day02typecasting_wrapperclasses_scenner;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the area and the perimeter of a rectangle whose length and width are entered by user. 
		 Hint1: Area of rectangle is width * length
		 Hint2: Perimeter of a rectangle is 2*(length+width)
		 */

		Scanner scanner =new Scanner(System.in);
		System.out.println("Hey user, what is the length of your rectangle...");
		double length = scanner.nextDouble();
		
		System.out.println("Hey user, what is the width of your rectangle...");
		double width = scanner.nextDouble();
		
		System.out.println("Area:" + length*width);
		
		System.out.println("Perimeter:" + 2*(length+width));
		scanner.close();
	}

}
