package day16statickeyword;

import java.util.Scanner;

public class StudentRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		do {
		System.out.println("Enter your first name");
		String first= scanner.nextLine();
		System.out.println("Enter your last name");
		String last= scanner.nextLine();
		String name= first + " " + last;
		System.out.println("Enter your grade");
		int grade = scanner.nextInt();
		System.out.println("Enter your registration year");
		int year = scanner.nextInt();
		
		Students student1 =new Students(name, grade, year);
		
		student1.setId();
		System.out.println("Student Name: "+student1.name);
		System.out.println("Student Grade: "+student1.grade);
		System.out.println("Student Registration Year: "+student1.registrationYear);
		System.out.println("Student id: "+Students.id);
		System.out.println("To quit press Q, to contionue press any button");
		String quit=scanner.next().toUpperCase();
		if(quit.equals("Q")) { // this for stopping the code
			break;
			
		}
		scanner.close();
		}while(true);
		
		System.out.println("See you later.");
		 
	}

}
