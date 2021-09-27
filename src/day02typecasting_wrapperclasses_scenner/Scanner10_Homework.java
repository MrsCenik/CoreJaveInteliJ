package day02typecasting_wrapperclasses_scenner;

import java.util.Scanner;

public class Scanner10_Homework {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the perimeter of a triangle whose Side lengths are entered by user. (use byte)
		 Hint1: Perimeter of a triangle is a+b+c
		 Hint2: To get byte use nextByte()
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value of the triengle...");
		byte a = scanner.nextByte();
		System.out.println("Enter b value of the triengle...");
		byte b = scanner.nextByte();
		System.out.println("Enter c value of the triengle...");
		byte c = scanner.nextByte();
		
		System.out.println("Perimeter:" + (a+b+c));
		scanner.close();
	}

}
