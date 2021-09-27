package ReplitQuestions;
import java.util.Arrays;

public class SwapElementsInList {
			/*
			Create a 10-element list. Swap the 8th element with the 3rd element.
			
			
			INPUT : 
			String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
			
			Output:
			          
			[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali] 
			 */
	public static void main(String[] args) {
		String[] names = {"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
		System.out.println(Arrays.deepToString(names));
		String temp = null;
		
		temp = names[2];
		names[2] = names[7];
		names[7]=temp;
		StringBuilder sb=new StringBuilder();
	    for(int i=0; i<names.length; i++){
	      sb.append(names[i]);
	      sb.append(",");
	    }
	   
	    sb.trimToSize();
	    
	    sb.deleteCharAt(57);
	    System.out.println("["+sb+"]");
	      
	}
}
