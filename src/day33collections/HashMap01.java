package day33collections;

import java.util.HashMap;

public class HashMap01 {
	/*
	 1)HashMap does not put the element in any order.
	   Because of that it is fast.
	 2)Keys must be unique in Maps, if you try to put repeated key, Java will overwrite 
	 3)Values can be repeated in Maps.
	 4)We can use null in Keys but you can use it just once. 
	   We can use null in Values repeatedly.
	 5)HashMaps are not thread-safe and not synchronized
	 */

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1 = new HashMap<>();	
		//We use two data types because we need key and value at the same time.
		
		hm1.put(100, "Ali Can");
		hm1.put(101, "Veli Han");
		hm1.put(102, "Mark Stone");
		hm1.put(103, "Angie Ocean");
		hm1.put(100, "Kemal Kuzu");
		hm1.put(104, "Angie Ocean");
		hm1.put(103, "Angie Ocean");
		hm1.put(null, "Angie Ocean");
		hm1.put(105, null);
		hm1.put(106, null);
		hm1.put(107, null);
		
		//Returns the value to which the specified key is mapped
		System.out.println(hm1.get(100)); //Kemal Kuzu
		//For non existing keys it will return null
		System.out.println(hm1.get(108)); //null
		
		System.out.println(hm1.getOrDefault(108, "No value for that key")); //No value for that key
		System.out.println(hm1.getOrDefault(104, "No value for that key")); //Angie Ocean
		
		//Returns the keys in a Set Collection
		System.out.println(hm1.keySet()); //[null, 100, 101, 102, 103, 104, 105, 106, 107]
		
		//Returns all values
		System.out.println(hm1.values()); //Angie Ocean, Kemal Kuzu, Veli Han, Mark Stone, Angie Ocean, Angie Ocean, null, null, null]
		
		//{@code true} if this map contains a mapping for the specified key.
		System.out.println(hm1.containsKey(108)); //false
		System.out.println(hm1.containsKey(104)); //true
		System.out.println(hm1.containsValue("Veli Han")); //true
		System.out.println(hm1.containsValue("XXX XXX")); //false
		
		
		HashMap<Integer, String> hm2 = new HashMap<>();	

		
		hm2.put(108, "X");
		hm2.put(109, "Y");
		hm2.put(110, "Z");
		
		hm1.putAll(hm2);
		
		//If key exists do not change existing value, otherwise create new key-value
		hm1.putIfAbsent(111, "Suleyman");
		hm1.putIfAbsent(null, "ZZZZZZZ");
		hm1.putIfAbsent(106, "KKKKK");
		
		//replace() method is used to update value by using key ~ return value
		hm1.replace(106, "LLLLL");
		//If you use replace()with non-existing key, it will be nothing. 
		hm1.replace(112, "LXXL");
		
		//Following replace() does check for key and value, if both match then it does update. ~ return boolean
		System.out.println(hm1.replace(106, "LLLLL", "!!!!!!")); //true
		
		System.out.println(hm1); //{null=Angie Ocean, 100=Kemal Kuzu, 101=Veli Han, 102=Mark Stone, 103=Angie Ocean, 104=Angie Ocean, 105=null, 106=null, 107=null, 108=X, 109=Y, 110=Z}
								//{null=Angie Ocean, 100=Kemal Kuzu, 101=Veli Han, 102=Mark Stone, 103=Angie Ocean, 104=Angie Ocean, 105=null, 106=LLLLL, 107=null, 108=X, 109=Y, 110=Z, 111=Suleyman}

	}

}
