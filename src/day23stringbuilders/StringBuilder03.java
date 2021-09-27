package day23stringbuilders;

public class StringBuilder03 {

	public static void main(String[] args) {
		
		StringBuilder sb1= new StringBuilder("Java");
		StringBuilder sb2= new StringBuilder("Java");
		
		/*
		 equals() method in StringBuuilder uses "==" to compare
		 
		 */
		
		System.out.println(sb1.equals(sb2));//false
		//1.Way =>Convert StringBuilder to String then use equal() method
		
		System.out.println(sb1.toString().equals(sb2.toString())); //false for StringBuilder equal(), true for String equal()
		
		//2.Way =>Use compareTo() Method
		
		System.out.println(sb1.compareTo(sb2));// 0==> same = StringBuilder contains the same character sequence
											   // -1==> not same	
	}
}