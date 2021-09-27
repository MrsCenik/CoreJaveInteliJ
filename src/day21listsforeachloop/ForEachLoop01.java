 package day21listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		
		List<Character> list1 = new ArrayList<>();
		
		list1.add('x');
		list1.add('z');
		list1.add('a');
		list1.add('m');
		
		//Use for-loop
		
		for(int i=0; i<list1.size(); i++) {
				System.out.print(list1.get(i) +"! "); //x! z! a! m! 
			
		}
				System.out.println();
		
		//Use for-each loop
		
		for(Character w : list1) {  //we use 'w' instead of get(index)/to read the element of the characters from the beginning
				System.out.print(w +"! ");
		}
				System.out.println();
		
		//if the characters are not vowel in the list print them on the console.
		
		for(Character w : list1) {
			if (w=='a'|| w=='e' || w=='i' || w=='o') {
				continue;
			
			}
				System.out.print(w+ "! "); //x! z! m! 
				
		}
				System.out.println();
		
		// Print the ASCII values of all characters o the console
		
		for(Character w : list1) {
				System.out.print(w+ ": " + (int)w+ " - ");
		}
		
		
				System.out.println();
		
		//Find the sum of all ASCII values of the characters inside the list
		int sum=0;
		for(Character w : list1) {
			sum =sum+w;	
		}
				System.out.print("The sum of the ASCII Values: "+sum); //The sum of the ASCII Values: 448
		
				System.out.println();
		
		//Print the characters whose ASCII values are even
		
		for(Character w : list1) {
			if(w %2==0) {
				System.out.print(w + " ");//x z 
				
			}
		}
		
				System.out.println();
		
		//If you see any character ASCII value is less than 100 stop printing and give an error message
		
		Character flag=' ';
		for(Character w : list1) {
			if(w <100) {
				flag=w;
				break;
				
			}
			   System.out.println(w + " ");
		
	}
			   System.err.println(flag + " has ASCII less than 100"); //a has ASCII less than 100
			   
			   System.out.println();
		
		//Arrays can use for each loop as well

		//Print the list elements which does not end with "n"
		
		String s[] = {"Ali", "Can", "Hasan", "Ekrem"};		
		
		for(String w : s) {
			if(!w.endsWith("n")) {
				
				System.out.print(w + " ");
		
			}
		}
	}
}
