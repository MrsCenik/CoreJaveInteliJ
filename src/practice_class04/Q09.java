package practice_class04;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		/* ask the user for an edge and height of an equilateral triangle
         * find the area and perimeter of the triangle
          print on the console
          */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an edge of the equilateral triangle");
		double edge= scanner.nextDouble();
		System.out.println("Enter the height of the triangle");
		double height= scanner.nextDouble();
		
		
		double area = (edge*height) / 2;
		double peri= edge*3;
		
		System.out.println("The perimeter of the triangle: " + peri);
		System.out.println("The area of the triangle: " + area);
		
		scanner.close();
	}

}
