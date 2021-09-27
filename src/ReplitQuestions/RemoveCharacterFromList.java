package ReplitQuestions;

import java.util.ArrayList;
import java.util.List;

public class RemoveCharacterFromList {
	/*
	 Write a program that deletes the letters 'a' from the names in the list given as input.

     INPUT : 
     list1={"Ali","Veli","Ayse","Fatma","Omer"}

     OUTPUT : 
     
     [Veli,Omer]
	 */

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("Omer");
		
		System.out.println(list1);
		List<String> list2 = new ArrayList<>();
	
		CharSequence charSeq1 = "a";
		CharSequence charSe2 = "A";
		
		
		
		for(int i=0; i<list1.size(); i++) {
			
			
			
			
			if(!list1.get(i).contains(charSeq1)&&!list1.get(i).contains(charSe2)) {	
				list2.add(list1.get(i));
			}	
			
		}
		System.out.println(list2);
	}
}
