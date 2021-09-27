package selfstudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupStudy01 {

	public static void main(String[] args) {
		/*
        Q-23)
        String = "Java and Python are Programming languages. I use java for practices. What can I do sometimes with Java."
        write a program to count "java"
        */
		
		String str = "Java and Python are Programming languages. I use java for practices. What can I do sometimes with Java.";
		
		String [] arr = str.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");
		
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].equals("java")) {
				count++;
			}
			
		}
		System.out.println("In your sentences you have "+ count + " java");
			
		/*
        Q-24)
        String = "Java and Python are Programming languages. I use java for practices. What can I do sometimes with Java."
        How many times each word is used in the String.
        */
		
	

		String str1 ="Java and Python are Programming languages. I use java for practices. What can I do sometimes with Java.";
		String arr1 [] = str1.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");
		List <String> newWord = new ArrayList<>();


	   
	    for(int i = 0; i < arr1.length; i++){
	    	if(!newWord.contains(arr1[i])) {
	    	int  count1 = 0;
	    	
	    	 for(int j = 0; j<arr1.length; j++) {

	    		if(arr1[i].contains(arr1[j])) {
	    			count1++;

	    		
	    		}
	    	
	    	}
	    	 newWord.add(arr1[i]);
	    		System.out.println(arr1[i] + " " +count1+ " ");
			}
	    	
	    }
		String str2 ="Java and Python are Programming languages. I use java for practices. What can I do sometimes with Java.";
		String arr2 [] = str2.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");
		
	    Map<String, Integer> frequency = new HashMap<>();	
	    
	    for(String s:arr2) {
	    	frequency.put(s, frequency.getOrDefault(s, 0)+1);
	    }
	    System.out.println(frequency);
		}

	}