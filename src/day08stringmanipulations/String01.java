package day08stringmanipulations;

public class String01 {

	public static void main(String[] args) {
		
		// 8- indexOf() ==> it returns a specific character/s and it returns int. 
		
		String str1= "Java is fun to learn and earn..";
		System.out.println(str1.indexOf('i')); //the index of the first occurrence of the character
		
		System.out.println(str1.indexOf("fun")); // if you use multiple characters, 
												//indexOf() will return the first occurrence of this character
		
		System.out.println(str1.indexOf("iss")); //-1, if there is no such occurrence, it returns -1
		System.out.println(str1.indexOf(" ")); // 4
		
		System.out.println(str1.indexOf('a')); //1 , we see always first occurrence
		System.out.println("?"+str1.indexOf('a',2)); // 2 means the index to star the search from first a and count rest. 
		
		System.out.println(str1.indexOf('a',5)); //  17, it starts to search after 5th place. 
		
		System.out.println(str1.indexOf("earn", 20)); //25
		
		// 9- lastIndexOf() 
		
		String str2 = "Learn Java earn money";
		
		System.out.println(str2.lastIndexOf('a')); //12 ==> the index of the last occurrence of the character
		
		System.out.println(str2.lastIndexOf('o')); //17
		
		System.out.println(str2.lastIndexOf(" ")); //15
		
		System.out.println(str2.lastIndexOf("j")); //-1 ==> if the character does not occur
		
		System.out.println(str2.lastIndexOf('j')); //-1 
		
		System.out.println(str2.lastIndexOf('a', 10)); // 9 searching backward starting at the specified index
		
		System.out.println(str2.lastIndexOf('n', 8)); // 4 
		
		//10- startWith() 
		
		String str3 = "Java is easy";
		
		System.out.println(str3.startsWith("j")); // false
													// we should use " " because it will return boolean .

		System.out.println(str3.startsWith("J")); //true
		
		System.out.println(str3.startsWith("is", 5)); // true index 5 means where to begin looking in this string ...
		
		//11- ensdWith() ==> Tests if this string ends with the specified character/s.
		
		System.out.println(str3.endsWith("y")); //true
		
		System.out.println(str3.endsWith("ya")); //false
		
		System.out.println(str3.endsWith("easy")); //true
	
		System.out.println(str3.endsWith("is easy")); //true
		
		//12- isEmpty() Returns true if, and only if, length() is 0
		String str4 = "";
		
		System.out.println(str4.isEmpty());// true ==> for " " it will be false
		
		//String str5= null;
		
		//System.out.println(str5.isEmpty()); //NullPointerException
		
		
		//13- concat()
		
		String str6 = "Ali";
		String str7 = " is Cool";
		
		System.out.println(str6 + str7); // Ali is Cool
		
		//str the String that is concatenated to the end of another String
		
		System.out.println(str6.concat(" is not Cool").concat(" but smart"));
		
		//14- replace()
		
		/*
		 Returns a string resulting from replacing all occurrences of oldChar in this string with newChar
		 */
		
		String str8 = "$1258";
		
		System.out.println(str8.replace("8", ":)")); //$125:)
		System.out.println(str8.replace("8", "")); // $125 -remove 8
		System.out.println(str8.replace('8', ' ')); // $125 
		 
		String str9 = "Java is easy to learn";
		
		System.out.println(str9.replace("easy", "hard").replace("hard", "easy"));
		System.out.println(str9.replace("Java", "0"));
		
		
		
		
		
		
		
		
}
	
}
 