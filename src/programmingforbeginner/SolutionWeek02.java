package programmingforbeginner;

public class SolutionWeek02 {
	
	
	//Write a Java program to check whether a given string ends with the contents of another string
	

	
	public boolean checkEndsWith(String s1 , String s2) {
		
		int s1Length=s1.length();
		int s2Length=s2.length();
		if(s2Length>s1Length) {
			return false;			
		}
		int back = 0;
		while(back < s2.length()) {
			
			
		}
//		System.out.println(s1.endsWith(s2));
		
		return true;
		
	}
	
	
	//Write a Java program to get the last index of a string within a string
	public String lastIndex(char [] chars, String str) {
		
	
		
		
//		String last= str.substring(str.length()-1);
//		System.out.println(last);
		return null;
	}

}
