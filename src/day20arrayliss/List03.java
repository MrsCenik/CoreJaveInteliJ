package day20arrayliss;

import java.util.ArrayList;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		/*
		 Create a method odd elements and increase even elements by multiplying 5
		 */
		
		List<Integer> list1=new ArrayList<>();
		list1.add(12);
		list1.add(5);
		list1.add(7);
		list1.add(20);
		list1.add(25);
		list1.add(128);
		oddAndEvenIncrease(list1);
		
	}
	public static void oddAndEvenIncrease(List<Integer> list1) {
		
		for(int i=0; i<list1.size(); i++) {
			if(list1.get(i)%2!=0) {
				list1.remove(i);
				i--; 
			}else {
				list1.set(i, list1.get(i)*5);
			}	
			}	
			System.out.println(list1); //[60, 100, 640]	
	}

}
