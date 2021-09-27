package practice_class01;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/* Ask user to enter minutes,
	       * Write a Java program to convert minutes into a number of years and days.
	       * Input: number of minutes 3456789
	       * Output: 3456789 minutes is approximately 6 years and 210 days
	       */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plese ente number of min");
		long min = scanner.nextLong();
		long years= min/(60*24*365);
		long day= (min/60/24)%365;
		
	
		System.out.println(min+ " minutes is approximately " + years +" years " + " and "+day+ "days");
	scanner.close();
	}

}
