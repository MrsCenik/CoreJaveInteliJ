package selfstudy;

import java.util.Scanner;

public class Q4_June23 {

	public static void main(String[] args) {
		
		
		
		double minInYear=24*60*365;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter minutes");
		double min=scanner.nextDouble();
		
		long years = (long) (min / minInYear);
        int days = (int) (min / 60 / 24) % 365;
        
        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
        
		scanner.close();
	}

}
