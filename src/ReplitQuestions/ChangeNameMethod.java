package ReplitQuestions;
import java.util.Scanner;

//Create a student's variables in the main method and use this assign variables
// create a method named Changename, student as parameter
// get the information and change all the information in the method and add the new information
// have it print
// The line where we call the Rename method in the Main method is immediately then reprint student information
// Create a method named changesurname, this method is "lastname" as parameter get the variable.
// In the method, ask the user to enter a new last name and
// change the old last name (i.e. can).
public class ChangeNameMethod {

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