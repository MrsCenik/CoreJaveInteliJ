package ReplitQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class FindRepitationInAList {
		/*
		Write a program to find the common elements between two String Arrays (without case sensitivity)
		 
		Input1 : {John,Brad,Angel,Sofia,Emily}
		 
		Input2 : {sofia,brad,grace,emily,hazel}
		
		
		Output : [sofia,brad,emily]
		 */
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList("John","Sofia","Angel","Brad","Emily"));
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("sofia","brad","grace","emily","hazel"));
				
		ArrayList<String> newList = new ArrayList<>();
		for(int i=0; i<list1.size();  i++) {
			for(int j=0; j<list2.size(); j++)
				if(list1.get(i).toLowerCase().equals(list2.get(j).toLowerCase())) {
					newList.add(list1.get(i).toLowerCase());
			}		
		}
		System.out.print("[");
		for(int i=0;i<newList.size();i++) {
		    System.out.print(newList.get(i));
		    if(i+1 != newList.size())
		    	System.out.print(",");
		}
		System.out.print("]");
	}		
}
