package homework;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapsHomeWork {

	public static void main(String[] args) {
	 //Type code to see number of occurrences of characters in a giving String
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = scanner.nextLine();
		str = str.replaceAll("\\p{Punct}", "").replace(" ", "").toLowerCase();
		
		HashMap<String, Integer> result = new HashMap<>();
		String ch[] = str.split("");
		
		for(String w : ch) {
			Integer numOfValues = result.get(w);
			if(numOfValues==null) {
				result.put(w, 1);
			}
			else {
				result.put(w, numOfValues+1);
			}
		}		
		System.out.println(result);
	
		
		scanner.close();
	}
}