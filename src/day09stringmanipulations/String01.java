package day09stringmanipulations;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
//		//15- substring() ==>to get a specific part of a string and it returns String
//		
//		String str1 = "Java is easy";
//		
//		System.out.println(str1.substring(2, 5)); // start index is inclusive, end index is exclusive.  
//		
//		System.out.println(str1.substring(1, 7));
//		
//		System.out.println(str1.substring(8,12)); // there is no index but Java will work
//													//it will use 11 at the end and index 11 is existed
//		
//		//System.out.println(str1.substring(8, 15)); // there is no index and it is bigger than the length so java will not work
//	
//		System.out.println(str1.substring(8)); //it will go to the end of the string. 
//		
//		System.out.println(str1.substring(5)); // beginIndex the beginning index, inclusive
//		System.out.println(str1.substring(12)); // space
//		//System.out.println(str1.substring(15)); // IndexOutOfBoundExeption
//		//System.out.println(str1.substring(-2)); // IndexOutOfBoundExeption
//		System.out.println(str1.substring(6,6)); // nothing 
		
		
//		/*
//		 Ask user to enter a String
//		 Print he first and last character of the String on the console
//		 */
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a String");
//		
//		String str2 = scanner.nextLine();
//		
//		String first= str2.substring(0,1);
//		String last= str2.substring(str2.length()-1, str2.length());
//	
//		System.out.println(first+last);
		
		/*
		 Ask user to enter SSN (9 digits)
	Print the SSN on the console after converting first 5 digits
	ex: 1234556789 ===> 6789
//		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your SSN");
		
		String ssn = scan.nextLine();
		String convertedssn= ssn.substring(5);
		
		
		System.out.println("*****"+convertedssn);
		
		
//		//16- trim() ==> is used to remove space " " from beginning and end. It returns String
		
		String str3= "     Ali   C an      ";
//		System.out.println(str3);
//		
//		String trimmedstr3 = str3.trim();
//		
//		System.out.println(trimmedstr3);
		
	// 17- isBlank() ==> it returns Boolean. it is used to check if a String has characters different from "" and space.

	//18- replaceAll() ==> is used like replace() + Returns String
		/*
		 replace() : you can use String and Char as parameter
		 replaceAll(): you can just use String
		 in replaceAll() you can use Regular Expressions (regex)
		 
		 regex is some syntax which represent multi characters 
		 
		 */
		
		
		//a---> \\d ====> stands for all digits(numbers).  
		//---> \\D ====> stands for character different from digits
		
		String str6 = "AB7896_5j!=+kJ02145";
				
				System.out.println(str6.replaceAll("\\d", ""));
				System.out.println(str6.replaceAll("\\D", ""));
				
				// b----> \\w ====> stands for _ and a-z and A-Z and 0-9
				// ----> \\W ====> strands for all characters different from _ and a-z and A-Z and 0-9
			System.out.println(str6.replaceAll("\\w", ""));
			System.out.println(str6.replaceAll("\\W", ""));
				
			// c---> \\s => stands for space
					// \\S=> stands for different from space
			System.out.println(str3.replaceAll("\\s", ""));
			System.out.println(str3.replaceAll("\\S", "*"));
			
			// d---> \\A  Beginning of the String 
			// --> \\Z end of the entire String
			
			String str7 = " 25.99";
			
			System.out.println(str7.replaceAll("\\A", "Dollar")); // Dollar 25.99
			
			System.out.println(str7.replaceAll("\\Z", "USD")); //25.99USD
			
			// f---> [aby] ==> Stands for all a, b,y
			// --> [^aby] => all characters different from a b y
			String str8 = "ali bey is booked";
			
			System.out.println(str8.replaceAll("[koy]", "e")); // k o y varsa string te onlarin hepsini e yap
			System.out.println(str8.replaceAll("[^ab]", "*")); //a ve b olmayanlari * yap
			
			//Not from Suleyman hoca: Strings are immutable.
			scan.close();		
	}

}
