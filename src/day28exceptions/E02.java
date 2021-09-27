package day28exceptions;

public class E02 {
		/*
		  
		 1- If you use length() for null string object, you will get "null pointer exception"
		 2- "Null pointer exception" is an unchecked exception
		 3- If there is no parent-child relationship between Exception Classes, the order of catch-block
		 	is not important.
		 4- try-block can not be used alone, it can be used like the followings;
		 	a) try + catch
		 	b) try + multiple catch
		 	c) try + catch or multiple catch + finally
		 	d) try + finally
		 	
		 We can use finally to close our file or database it will be executed in any condition
         If we do not close our database 
         It can cause some security problems
         Data leakage
         It means you will pay a lot to the cloud company
		 
		 */

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.length()); //0
		
//		String s2 = null; // It was null I changed it because of yellow underline. When you review you should make "" to null.
//		System.out.println(s2.length());

		//When we have more than one functions in one try block we can catch just first one.
		try {
		System.out.println(12/0); //Exception in thread "main" java.lang.ArithmeticException: / by zero
//		System.out.println(s2.length()); //Exception in thread "main" java.lang.NullPointerException
	
		System.out.println(12/0);
		
		}catch(NullPointerException e) {
			System.out.println("do not use length() for null. "+ e.getMessage());

		}catch(ArithmeticException e) {
			System.out.println("Do not divide byzero.." + e.getMessage());

		}finally {
			System.out.println("Finally part will be excecuted under every condition");
		}
		System.out.println("Will that code be executed?");
	}
}