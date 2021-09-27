package ReplitQuestions;

import java.util.Scanner;

/*
		 Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
		
		Input : 6
		
		Output: 6!=6*5*4*3*2*1=720
		 */
public class FactorialWithLoop {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		//	System.out.println("Enter any number to count its factorial");
	    int num = scanner.nextInt();
		int fac=1;
		System.out.print(num+"!"+"=");
		for(int i=num; i>0; i--) {			
			fac=fac*i;
      System.out.print(i);
      if(i!=1){
      System.out.print("*");
      }
		}	
		System.out.print("="+fac);
		scanner.close();
  }
}