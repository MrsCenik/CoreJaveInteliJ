package practice_class07;

import java.util.ArrayList;

public class PandramMethod {
	/*
	Write a function to check whether a string is Pangram or not assuming that the string passed in does not have any punctuation.
	Pangrams are words or sentences containing every letter of the alphabet at least once. 
	EX: The quick brown fox jumps over the lazy dog --> true
	*/
	public static boolean isPangram(String str) {
		str = str.replace(" ", "").toUpperCase();
		ArrayList<Character> al = new ArrayList<>();
		
		for(int i = 0; i<str.length(); i++) {
		char each=str.charAt(i);
			if(!al.contains(each)&& each>=65 && each <=90) {
				al.add(each);
			}			
		}	
		return al.size()==26;
	}
	
	public static void main(String[] args) {
		System.out.println(isPangram("The quick brown fox jumps over the lazy dog"));
	}
}
