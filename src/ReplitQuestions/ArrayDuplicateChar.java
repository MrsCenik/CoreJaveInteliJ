package ReplitQuestions;


import java.util.Arrays;

public class ArrayDuplicateChar {

	public static void main(String[] args) {
		/*
		 Write a code that returns the duplicate chars in a String array.(interview Question)

			Input : 
				 
			String str=“Javaisalsoeasy” 
			
			Output: [a, s]
	
		 */
		String str= "Javaisalsoeasy";
		String result="";
		String out="";
		for(int i = 0 ; i<str.length(); i++){
			char eachLetter=str.charAt(i);
			if(!result.contains(eachLetter + "")) {
				result+=eachLetter;
			}else if(!out.contains(eachLetter + "")){
				out+=eachLetter;
			}				
		}
		String[] array = out.split("");
		System.out.println(Arrays.toString(array));	
	}

}

