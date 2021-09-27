package day31iteratorcollections;

import java.util.LinkedList;

public class LinkedList01 {
	/*
	 LinkesList is very fast in insertion and deletion operations...
	 */

	public static void main(String[] args) {
		LinkedList<String>  ll1 = new LinkedList<>();
		ll1.add("Ali");
		ll1.add("Can");
		ll1.add("Mark");
		ll1.add("Tom");
		
		System.out.println(ll1);
		
		ll1.add("Angie");
		ll1.add(2, "XXX");
		ll1.addFirst("AAA");
		ll1.addLast("ZZZ");
		System.out.println(ll1.contains("Can")); //true
		System.out.println(ll1.contains("Ayse")); //false
		System.out.println(ll1.element()); //AAA it returns the first element without removing (copy + paste)
										   //@throws NoShuchElementException if this list is empty
		System.out.println(ll1);
		
	}

}
