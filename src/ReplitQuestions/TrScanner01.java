package ReplitQuestions;

import java.util.Scanner;

public class TrScanner01 {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		    System.out.println("Lutfen bir sayi giriniz");
		    int num=scanner.nextInt();
		    System.out.println((num*num*num)/2);
		    scanner.close();
	}

}
