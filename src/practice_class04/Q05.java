package practice_class04;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// ask user to enter 8 primitive data and print on the console
		//Byte,int,float,short,long,Boolean,double,char
		//INPUT     : int num1=41                 
		//OUTPUT : user enter  41
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num=scanner.nextInt();
		System.out.println("User ente " + num);
		
		System.out.println("Enter a byte");
		byte by= scanner.nextByte();
		System.out.println("User ente " + by);
		
		System.out.println("Enter a Float");
		float fl=scanner.nextFloat();
		System.out.println("User ente " + fl);
		
		System.out.println("Enter a short");
		short sh=scanner.nextShort();
		System.out.println("User ente " + sh);
		
		System.out.println("Enter a long");
		long ln=scanner.nextLong();
		System.out.println("User ente " + ln);
		
		System.out.println("Enter a Boolean");
		boolean bl=scanner.nextBoolean();
		System.out.println("User ente " + bl);
		
		System.out.println("Enter a Double");
		double db =scanner.nextDouble();
		System.out.println("User ente " + db);
		
		System.out.println("Enter a char");
		char ch=scanner.next().charAt(0);
		
		System.out.println("User ente " + ch);
				
		
		
		
		
		
		
		scanner.close();
	}

}
