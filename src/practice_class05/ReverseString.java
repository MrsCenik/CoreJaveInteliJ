package practice_class05;

public class ReverseString {
	//4. Write a method that accepts a String and returns reverse of the same String. EX: java -> avaj
	
	
	public static String reverse(String str) {
		String reversedString="";
		for(int i=str.length()-1; i>=0; i--) {
			reversedString+=str.charAt(i);	
		}
		return reversedString;
	}
	public static void main(String[] args) {
		System.out.println(reverse("Java"));
	}

}
