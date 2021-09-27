package practice_class01;

import java.util.Scanner;

public class Qestion3 {

	public static void main(String[] args) {
		/*
		 * Ask user to choose one of these letters : A , B , C
		 * If they choose A, print: Java is easy
		 * If they choose B, print: Java is fun
		 * If they choose C, print: I need to study :)
		 *
		 * EXAMPLE: INPUT : A OUTPUT :Java is easy
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please chose one of these letters. \nA\nB\nC");
		char option = scanner.next().toUpperCase().charAt(0);
		
		System.out.println();
		
	switch (option) {
	case 'A':
		System.out.println("Java is easy");
		break;

	case 'B':
		System.out.println("Java is fun");
		break;
	case 'C':
		System.out.println("I need to study");
		break;
	default:
		System.out.println("Invaild option");

		
		
	}
	scanner.close();
	}

	}

