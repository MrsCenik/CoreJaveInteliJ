package day24multithreadsyncencapsulation;

public class Varargs01 {
		/*
		 	1. Behind the "varargs", Java uses arrays. Because of that, varargs behaves like arrays with some differences. 
		 	2. You can not use more than one varargs in a method 
			3. Varargs must be the last parameter every time.
			4. "..." can be put just after data type or just before varargs name. Others do not work.
			
			Note:If you need same method to use different number of parameters use "Varargs"
		 */
	
	public static void main(String[] args) {
		System.out.println(add()); //0
		System.out.println(add(5,7));//12
		System.out.println(add(5,7, 8, 9, 12));//41		
	}	
//	public static int add() {
//		return 3 + 5;
//	}
//	
//	public static int add(int a, int b) {
//		return a + b;
//	}
//	
//	public static int add(int a, int b, int c) {
//		return a + b + c;
//	}
	public static int add(int...  a) {
	
		int sum=0;
		
		for(int w:a) {
		
			sum+= w;	
		}
		return sum;
	}
}