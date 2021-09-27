package day19arraylist;

import java.util.ArrayList;

public class List02 {

	public static void main(String[] args) {
		String str="cenik";
		ArrayList<String>list1= new ArrayList<>();
		
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Jhon");
		list1.add("Ayse");
		list1.add("Can");
		list1.add(str);
		System.out.println(list1);//[Ali, Veli, Jhon, Ayse, Can]
		
		//1.Way to replace the element of another
		//.set(index of element, new element)
		list1.set(2, "Ahmet");
		System.out.println(list1); //[Ali, Veli, Ahmet, Ayse, Can]
		list1.set(list1.indexOf("Ali"), "Hatice");
		System.out.println(list1); //[Hatice, Veli, Ahmet, Ayse, Can]


	}

}
