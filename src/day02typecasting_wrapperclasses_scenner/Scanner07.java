package day02typecasting_wrapperclasses_scenner;

import java.util.Scanner;

public class Scanner07 {

	public static void main(String[] args) {
		/* 
		 Type a program which converts the miles to kilometer. Mile value will be entered by user. (use double)
		 Hint1: km= mile*1.6
		 Hint2: To get double, use nextDouble()
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the mile to convert km...");
		
		double mile = scanner.nextDouble();
		System.out.println(mile*1.6 + "km");
		
		scanner.close();
		
	}

}
