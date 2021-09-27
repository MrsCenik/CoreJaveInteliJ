package day02typecasting_wrapperclasses_scenner;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter hours to convert second...");
		
		long hours = scanner.nextLong();
		
		System.out.println(hours*60*60 + "sec");
scanner.close();
	}

}
