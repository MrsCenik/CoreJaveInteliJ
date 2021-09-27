package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
/*
 	1) You can use multiple "catch blocks" for a single "try block"
 	2) If you use multiple "catch blocks", order the Exception Classes from child to parent, otherwise you will get CTE.
 	3) If you use multiple "catch blocks", you can get different messages for every Exception
 	4) try-block can not be used alone. 
 	5) When you type code if you get red underline for Exceptions, that kind of Exceptions are called "Checked Exception" 
 		If you do not get any red underline for some Exceptions, they are called "Unchecked Exceptions"
 		FileNotFoundException and IOException are Checked Exceptions.
 	6) If there is any Exception Java stop execution.
 	
 */
	public static void main(String[] args) {
		
		try {
			FileInputStream fis= new FileInputStream("src/day27exceptions/TextFile01"); //I put X in the path to see the err message in the console
			int i = 0;
			while((i = fis.read())!=-1) {
				
				System.out.print((char)i);
				
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.err.println("I think the path is wrong or file does not exist..."+e.getMessage());//src/day27exceptionsX/TextFile01 (No such file or directory)
			e.printStackTrace(); //To get detailed message use that one
			e.getMessage(); //  To get a short error message use that one
			
			
		} catch (IOException e) {
			System.out.println("There some issues to read the file...");
		}
		System.out.println("We did not catch any fish");
	}
}