package practice_class05;

public class ExtractsLettersNumbers {

	/*
	 Write method that accepts a String and extracts letters and numbers. 
	 Method should return a String. EX: a1b2c3 --> Letters are abc and numbers are 123.
	 */
	public static String extractsLettersNumbers(String str) {
	
		String letters, numbers;
		letters=numbers= "";
		
		for(int i=0; i<str.length(); i++) {
				char eachletter = str.charAt(i);
		
			if(Character.isLetter(eachletter)) {
				letters+=eachletter;
			
			}if(Character.isDigit(eachletter)) {
				numbers+=eachletter;
			}		
		}
		
		return "Letters are "+ letters + " Numbers are " + numbers;
	}
	
	public static void main(String[] args) {
	
		System.out.println(extractsLettersNumbers("akdjfa343jfakfa"));
	
	}
}
