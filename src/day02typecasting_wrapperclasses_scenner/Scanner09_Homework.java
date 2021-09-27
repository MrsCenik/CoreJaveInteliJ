package day02typecasting_wrapperclasses_scenner;

import java.util.Scanner;

public class Scanner09_Homework {

	public static void main(String[] args) {
		/* 
		 Type a program which calculates the area and the perimeter of a circle whose radius is entered by user. (use float)
		 Hint1: Take pi number as 3.14159
		 Hint2: Area of a circle is 3.14159*radius*radius
		 Hint3: to get float, use nextFloat() 
		 Hint4: Perimeter of a circle is 2*3.14159*radius 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter radius of your circle...");
		
		float radius = scanner.nextFloat();
		System.out.println("Area:" + 3.14159*radius*radius);
		System.out.println("perimeter:" + 2*3.14159*radius);
		scanner.close();
	}

}
