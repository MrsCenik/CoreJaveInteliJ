package day27exceptions;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;  We do not need it anymore, because IOExceotion covers it. IOExceotion is the parent of FileNotFoundException.
import java.io.IOException;


			/*
			 1)fileNotFoundException:
			 	a) The file the specified path does not exist
			 	b) IOf the file is unaccessible
			 2)IOException:
			 	a)It can handle all exceptions about Input and Output
			 Note: IOExeptions is the parent of FileNotFoundException
			 Note: If you are using IOException Class, no need to use FileNotFoundException Class
			 
			 Note: When you see an Exceptions, you have two options;
			 		a) Using "throws" declaration in the method name line
			 		b) Using try-catch block
			 	
			 */


public class E01 {

	public static void main(String[] args) throws IOException{
	
		FileInputStream fis= new FileInputStream("src/day27exceptions/TextFile01");

		int i = 0;
		
		while((i = fis.read())!=-1) {
			
			System.out.print((char)i);

		}
		fis.close();
//		System.out.println("We could not catch any fish today"); //
	}
}
