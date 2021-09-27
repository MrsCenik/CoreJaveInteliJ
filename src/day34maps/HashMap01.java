package day34maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap01 {

	public static void main(String[] args) {
		/*
		 How to count the number of occurrences of the words in a sentence
		 For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
		 */
		
		String str = "Java is easy. Type codes to learn Java. To earn money learn Java." ;
		System.out.println(str);
		str = str.replaceAll("\\p{Punct}", "").toLowerCase(); //remove "."  
		
		HashMap<String, Integer> result = new HashMap<>();
		
		
		String words[] = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		for(String w: words) {
			Integer numOfValues = result.get(w);
			
		if(numOfValues==null) {
			result.put(w, 1);
		}
		else {
			result.put(w, numOfValues+1);
		}
	

		}	
		System.out.println(result);

	}

}
