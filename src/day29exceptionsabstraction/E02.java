package day29exceptionsabstraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E02 {
	/*
	   if (index < 0 || index >= value.length) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return (char)(value[index] & 0xff);
	 */

	public static void main(String[] args) {
		//StringIndexOutOfBoundsException
		
//		String s = "Java is easy";
//		System.out.println(s.charAt(2)); //v
//		System.out.println(s.charAt(12)); //StringIndexOutOfBoundsException
		
//		System.out.println(s.charAt(-3)); //StringIndexOutOfBoundsException
		
		
		//IllegalStateException
		//If you use a method at an inappropriate time, you will get IllegalStateException
		
		List<Integer> list = new ArrayList<>();
		list.add(21);
		list.add(22);
		list.add(23);
		
		Iterator<Integer> listItr = list.iterator();
		listItr.next(); // listItr : [ _ 21 _, 22 , 23] pointer passes the first element and it can see the element to remove. 
						//.remove() can remove the element now between the pointers.
		listItr.remove();//Without .next() it gives IllegalStateException 
		//because when the pointer at the beginning there is no element remove yet. So we should go next.
		   // listItr : [ _ 21 , 22 , 23]
	}
}