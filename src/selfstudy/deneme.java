package selfstudy;


import java.util.Scanner;

public class deneme {
	
	

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scanner.nextLine();
		System.out.println("Enter a character");
		
		char ch= scanner.next().charAt(0);
		
		int i= 0;
		
		while(i<name.length() ){
			
			i++;
			
		  System.out.println(ch + i);

		}
	scanner.close();
	
}
}