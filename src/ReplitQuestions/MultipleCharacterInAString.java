package ReplitQuestions;


/*
 Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input : 
	 
String str=“Javaisalsoeasy” 

Output: a s
 */

public class MultipleCharacterInAString {

	public static void main(String[] args) {
		
		String str= "Javaisalsoeasy";
		String result="";
		
		for(int i = 0 ; i<str.length(); i++){
			for(int j=0; j<str.length();j++) {
				if(i!=j&&str.toLowerCase().charAt(i)==str.toLowerCase().charAt(j)) {
					char eachLetter=str.charAt(i);
					if(!result.contains(eachLetter + "")) {
						result+=eachLetter;
				}
			}
			
			}				
		}
		System.out.println(result.substring(0, 1)+" "+result.substring(result.length()-1));
  }
}