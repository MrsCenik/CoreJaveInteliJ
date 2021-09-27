package programmingforbeginner;

import java.util.HashMap;
import java.util.Map;

public class SolutionWeek01 {
	
	/*
	 Write a Java program printing out your name in newlines. (ex:
			J
			O
			H
			N
			)

	 */
	public void printNameVertical(String input) {
		//1.Way
//		for(int i=0; i<input.length(); i++ ) {
//			System.out.println(input.charAt(i));
//			
//		}
		//2.Way
		for(char c : input.toCharArray()) {
			System.out.println(c);
			
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Besiktas", 1);
		map.forEach((key, value) -> System.out.println(key +"=" + value));
	}
	//Write a Java program to check if a given character exists or not.
	
	public boolean ifExistCharInString(char c, String s) {
		//1.way
		if(s.contains(c+"")) {
			return true;
			
		}
		//2.Way
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)==c) {
				return true;		
			}	
		}
		
		return false;	
	}
	
	//Write a Java program to test if a given string contains the specified sequence of char values
	
	public boolean ifCharSeqExistsInString(char[] chars, String s) {
		//s ->  e r r s g h -> int j
        //chars -> 'r''s''g' -> int i
		
		//String s = "rrrdde";
		//char[] chars = {'r','d','e'};
	
        
        int stringIndex = 0;
        int charIndex = 0;
        
        while(stringIndex < s.length()) {
        	if(chars[charIndex] == s.charAt(stringIndex)){
            	charIndex++;
            	if(charIndex == chars.length) 
                    return true;        	
            }else { 
            	stringIndex = stringIndex - charIndex;
            	charIndex = 0;
            }
            stringIndex++;
        }
        
        return false;
    }
	
}