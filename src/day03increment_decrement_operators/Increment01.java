package day03increment_decrement_operators;

public class Increment01 {

	public static void main(String[] args) {
		
		int age = 20;
		
		System.out.println("Before increment:" + age);
		 
		//How to increase the value by addition
		//1.Way
		age = age + 5;
		
		System.out.println("After increment:" + age);
		
		//2.Way
		age+=5;
		
		System.out.println("After 2.increment:" + age);
		
		//3.Way: This is used just to increase by 1
		age++;
		
		System.out.println("After 3.increment:" + age);
		
		int salary = 1000;
		
		System.out.println("Before increment:" + salary);
		
		//How to increase the value of a variable by multiplication
		//1.Way
		salary = salary *2;
		
		System.out.println("After increment:" + salary);
		
		//2.Way
		salary*=3;
		
		System.out.println("After 2.increment:" + salary);
		

	}

}
