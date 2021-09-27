package practice_class05;

public class RemoveDublicates {

	
	//2. Write method that accepts a String and removes all duplicate from String. EX : aaabbc --> abc
	
	public static String removeDublicates(String str) {
		String result="";
		for(int i = 0 ; i<str.length(); i++){
			char eachLetter=str.charAt(i);
			if(!result.contains(eachLetter + "")) {
				result+=eachLetter;
			}		
		}
		return result;
	}	
	public static void main(String[] args) {

		System.out.println(removeDublicates("hslkanss"));
	}

}
