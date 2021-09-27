package ReplitQuestions;
import java.util.Scanner;
public class Deneme01 {
	public static void main(String[] args) {
		 Scanner scanner= new Scanner(System.in);
		    System.out.println("Enter a String");
		    String input=scanner.nextLine();
		    int[] arr = new int[input.length()];  
		    char maxChar = input.charAt(0);  
		    int i, j, max;         
		    char string[] = input.toCharArray();  
		      for(i = 0; i < string.length; i++) {  
		      arr[i] = 1;  
		      for(j = i+1; j < string.length; j++) {  
		        if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
		          arr[i]++; 
		          string[j] = '0';  
		        }  
		      }  
		      } 
		      max = arr[0];  
		      for(i = 0; i <arr.length; i++) {  
		        if(max < arr[i]) {  
		        max = arr[i];  
		        maxChar = string[i];  
		        }  
		      }  	          
		System.out.println("maximum occurring character : " + maxChar); 
		scanner.close();
	}
}