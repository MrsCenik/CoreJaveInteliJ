package selfstudy;
import java.util.Scanner;
public class CountRepetitiveChar {
	public static void main(String[] args) {	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=scanner.nextLine();
		//Find Frequency map
		int[] freqArr = new int[256];
		for(int i=0; i<input.length(); i++) {
			freqArr[input.charAt(i)]++;	
		}
		//Find max
		int max=0, index=0;
		for(int i=0; i<freqArr.length; i++) {
			if(max<freqArr[i]) {
				max=freqArr[i];
				index=i;
			}		
		}
		
		System.out.print("maximum occurring character is : " +(char)index);
		scanner.close();	
	}
}