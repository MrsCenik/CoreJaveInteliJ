package day04_concat_if_ifelse;

public class OperationSigns {

	public static void main(String[] args) {
		
		// = -> Assignment Operation in Java - not same in math
		
//		int num = 20;
//		num = 25;
		
		// == -> Equal Sign or Comparison Operator in Java - as in math
		
		boolean isTrue = 5 == 7;
		System.out.println(isTrue);
		boolean isFalse = 5+2 == 8;
		
		System.out.println(isFalse);
		System.out.println (isTrue == isFalse);
		
		
		//!= -> Not equal Sign in Java
		
		boolean isTrue1 = 5+2 != 8;
		System.out.println(isTrue1);
		boolean notEq = 5+2 !=25;
		System.out.println(notEq);
		
		//">", ">=", "<", "<=" -> All returns boolean
		
		//&& -> and operator ... if you have at least one false result false
		
		// || -> Or operator ... if you have just one true the result will be true.
		
		
		System.out.println(5 > 8);
		System.out.println(8  > 11-5);
		
		
		boolean b1 = 5>2; //true	   
		boolean b2 = 5==3; //false  
		boolean b3 = 5==2;	 //false 
		boolean b4 = 5<2;    //false
		
		//to get true from &&, everything must be true
		System.out.println(b1 && b2);
		
		System.out.println(b1 && b3);
		
		
		System.out.println(b3 && b4);
		
		
		System.out.println(b2 || b1);
		
		//to get false from || (or), everything must be false
		System.out.println(b3 || b4);
		
		System.out.println(b1 || b2 || b3 || b4);
		
		
	}	

}
