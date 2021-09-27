package ReplitQuestions;

	/*
	 Kullanıcıdan bir isim ve bir karakter girmesini isteyin, 
	 ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
	
	    char ch1= 'a' ;
	
			String name =“John came late" 
	
			Expected Output: 
	    
	    
	    Number of a = 2
	 */

import java.util.Scanner;

public class StringRepitationChar {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a name");
    String name = scanner.nextLine();
    System.out.println("Enter any character");
    String ch = scanner.next();
    int counter = 0;
    for(int i = 0; i<name.length(); i++){
     if(name.toLowerCase().charAt(i)==ch.toLowerCase().charAt(0)){
       counter++;
     }
    }
    System.out.println("Number of "+ch+" = "+ counter);
    scanner.close();
  }
}