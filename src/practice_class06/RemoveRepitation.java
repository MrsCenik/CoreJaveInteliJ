package practice_class06;

import java.util.ArrayList;
import java.util.List;

public class RemoveRepitation {
		/*
		 16. Write a method that takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord. 
		 Method removes the targetWord from ArrayList.EX :ArrayList("hi","hey","hi","yo"));  ----> removeAll(wordList,"hi"); --->["hey","yo"].
		 */


	public static ArrayList<String> removeWord(ArrayList<String> a1, String word) {

		for (int i=0; i<a1.size(); i++) {
			if (a1.get(i).equals(word)) {
				a1.remove(a1.get(i));
				i--;
			}
		}
		return a1;
	}


	public static void main(String[] args) {
		System.out.println(removeWord(new ArrayList<String>(List.of("a","a","a","b","c","e")),"a"));

	}

}

