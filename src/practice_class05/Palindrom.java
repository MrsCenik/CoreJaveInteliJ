package practice_class05;

public class Palindrom {

	/*
	 5. Write a method that checks if word is palindrome. 
	 A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, 
	 such as madam or racecar or the number 10801.  (interview question)
	 */
	
	public static String palindrom(String str) {
		
		String result="";
		String reverse="";
		for(int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);	
		}
		if(reverse.equals(str)) {
			System.out.println(str);	
		}else {
			System.out.println("This word is not palindrome");
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(palindrom("aba"));

	}
/*
 5. Write a method that checks if word is palindrome. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.
    
    static boolean isPalindrome(String str){
     //1st Logic:
     for(int i = 0, j = 1; i < str.length()/2; i++, j++){
          if(str.charAt(i) != str.charAt(str.length() - j))
              return false;
     }
    return true;
     //2nd Logic:
    String reversed = isReverse("madam");
    return reversed.equals(str);
    }
 */
}
