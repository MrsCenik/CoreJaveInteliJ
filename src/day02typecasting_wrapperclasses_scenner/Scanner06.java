package day02typecasting_wrapperclasses_scenner;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the volume of a rectangular prism whose length, width and heigth are entered by user.
		 Hint: Volume of a rectangular prism is width*length*heigth
	
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Cemil, please enter the width, length and heigth of your rectangular prism...");
		double width = scanner.nextDouble();
		double length = scanner.nextDouble();
		double heigth = scanner.nextDouble();
		System.out.println("Volume:" + width*length*heigth);
		
		scanner.close();
	}

}
