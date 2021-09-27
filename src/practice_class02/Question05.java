package practice_class02;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// ask user to enter an e-mail address
        // then if it contains "hotmail" replace it with "gmail"
        // e.g: johnbrown@hotmail.com ==> johnbrown@gmail.com
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your hotmail e-mail address");
		String mail=scanner.nextLine();
		if(mail.contains("hotmail")) {
			
			System.out.println(mail= mail.replace("hotmail", "gmail"));
		}else {
			System.out.println("Please enter correct hotmail address");
	
		}	
		scanner.close();
	}

}
