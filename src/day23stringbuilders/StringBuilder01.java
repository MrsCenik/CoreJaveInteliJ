package day23stringbuilders;

public class StringBuilder01 {

	public static void main(String[] args) {
		/*
		 
		 */
		//How to create a String by using "StringBuilder Class"
		//1.Way
		
		StringBuilder sb= new StringBuilder();
		System.out.println(sb.capacity()); //16 =>Default capacity
		System.out.println(sb); //empty String
		sb.append("Ali");
		System.out.println(sb);//Ali
		sb.append(" is a friend of Veli"); //Ali is a friend of Veli
		System.out.println(sb);//Ali
		
		
//		String str="Veli";
//		System.out.println(str); //Veli
//		str.toUpperCase();
//		System.out.println(str);//Still Veli, because it is a String. We can not changed the String.
		
		
		//2.Way
		
		StringBuilder sb1=new StringBuilder("Veli is my friend");
		System.out.println(sb1); //Veli is my friend
		sb1.append(" and my classmate");
		System.out.println(sb1); //Veli is my friend and my classmate
		
		//3.Way
		StringBuilder sb2=new StringBuilder(5);
		//We need to be sure with length of the string
		System.out.println(sb2); //StringBuilder creates 5 spaces in heap memory. 
		sb2.append("Javaxyz");
		System.out.println(sb2);//Javaxyz
		
		System.out.println(sb2.capacity()); //12 =>Java can extend the capacity when we put more character in StringBuilder
		System.out.println(sb2.length()); //7
		
		//StringBuilder methods append() in chain
		
		StringBuilder sb3=new StringBuilder("Java");
		//1,
		sb3.append('q').append('z').append('u');
		System.out.println(sb3); //Javaqzu
		//2. If you want to add some of characters from a String we use the following method
		sb3.append("Ahmet",1, 3);
		System.out.println(sb3); //Javaqzuhm => hm added at the end
		//the index of the desired char value
		System.out.println(sb3.charAt(5));//z
		
		//3. => How to delete
		//delete by start and end index
		sb3.delete(4, 7);
		System.out.println(sb3);// Javahm => qzu are deleted
		
		//delete specific character
		sb3.deleteCharAt(0);
		System.out.println(sb3); //avahm
		
		
		
	}

}
