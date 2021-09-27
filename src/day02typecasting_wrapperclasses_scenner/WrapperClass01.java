package day02typecasting_wrapperclasses_scenner;

public class WrapperClass01 {

	public static void main(String[] args) {
	  /* 
	   Primitive       Wrapper Class(non-Primitive)
	      byte            Byte
	      short           Short
	      int             Integer  *****
	      long            Long
	      float           Float
	      double          Double 
	      
	      boolean         Boolean
	      char            Character   *****
	      
	   */
		
//		int a = 11;   //this is primitive integer
//		
//		Integer b = 12;    //this is wrapper class integer
//	
//		System.out.println(b.MAX_VALUE); //2147483647 it is max value for integer
//		
//		System.out.println(b.MIN_VALUE); //-2147483648 it is min value for integer
//		
//		System.out.println(b.min(120, 23)); //12
//		
//		System.out.println(b.compare(64, 25)); //1 because second one is smaller
//		
//		System.out.println(b.compare(25, 64)); //-1 because first one is smaller
//		
//		System.out.println(b.compare(64, 64)); //0 because they are equal
		
		
		//Crate a Short Wrapper Class variable
		// a) Print the max and min values of short data type on the console
		// b) Use any method and try to understand the logic of the method
		
		Short c = 24533;
		Short d = 123;
		
		
//		System.out.println(c.MAX_VALUE); //32767
//		System.out.println(c.MIN_VALUE); //-32768
//		System.out.println(c.SIZE); //16 ==> Means c is used 16 bits in the memory
		
		System.out.println(c.hashCode()); //24533 hashCode means address. hashCode returns the address of non-primitive data. 
																//Java creates it automatically.
		System.out.println(c.equals(d));  //false =>if they were equal, it would return true. 
		
		//Auto-boxing
		
		int x = 12;
		Integer y = x;
		
		System.out.println(x);
		System.out.println(y);
		
		//Un-boxing
		
		Integer z = 23;
		int t = z;
		System.out.println(z);
		System.out.println(t);	
		
	}

}
