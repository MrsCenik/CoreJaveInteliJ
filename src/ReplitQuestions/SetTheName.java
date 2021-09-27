package ReplitQuestions;

import java.util.Scanner;

public class SetTheName {

	 public static void main(String[] args) {
		 String studentName="Ali";
	     String lastName="Can";
	     
	     System.out.println("New LastName is "+changeSurname(lastName));
	     System.out.println("New Name is "+changeName(studentName));
	 }
	 
	 public static String changeSurname(String surName1){
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("Enter lastname");
	     String surName=scanner.next();
	     scanner.close();
	     return surName; 
	 }
	   
	 public static String changeName(String name){
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("Enter name");
	     name=scanner.next();
	     scanner.close();
	     return name; 
	 }
	   
}
