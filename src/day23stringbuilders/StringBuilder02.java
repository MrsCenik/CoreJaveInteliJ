package day23stringbuilders;

public class StringBuilder02 {

	public static void main(String[] args) {
	
		StringBuilder sb1 = new StringBuilder("Java123");
		
		StringBuilder sb2 = new StringBuilder("Java123");
		
		//How to compare 
		//StringBuilder equal method is not the came as String equal() method
		System.out.println(sb1.equals(sb2)); //false
		
		System.out.println(sb1.equals(sb1)); //true ==>when we compare same StringBuuilder we  get true.
		System.out.println(sb1.indexOf("1"));//4
		System.out.println(sb2.indexOf("a "));//1
		
		sb1.insert(3, "QX");
		System.out.println(sb1); //JavQXa123
		
		sb1.insert(1, "CCTYEWCC",2,5);
		System.out.println(sb1); //J TYE avQXa123 inserted new 3 character from new string
		//Use reverse method to reverse a String
		sb1.reverse();
		System.out.println(sb1 ); //321aXQvaEYTJ
		
		
		//Replace
		
		sb1.replace(0, 3, "***");//If we put empty double code it would remove the characters
		System.out.println(sb1); //***aXQvaEYTJ
		
		
		sb1.setCharAt(0, '9');
		System.out.println(sb1);//9**aXQvaEYTJ
		
		sb1.trimToSize(); //reduce the storage to the size of the String 
	}

}
