package ReplitQuestions;

			/*
			 Write a Java program that reverse a sentence by using Array 
			 (with all spaces and special characters).
			
			Input  : Coding is greate.
			
			Output : .etaerg si gnidoC
			 */

public class ReverseArray {

	public static void main(String[] args) {
		String [] arr = {"Coding", "is", "greate."};
		String [] reversedArr=new String[3];
		
		for (int i =arr.length-1; i>=0; i--) {
			String str="";
			for(int j=arr[i].length()-1; j>=0; j--) {
				
				str+= arr[i].charAt(j);
				reversedArr[i]=str;
			
			}		
			System.out.print(reversedArr[i]+ " ");
		}
	}
}
