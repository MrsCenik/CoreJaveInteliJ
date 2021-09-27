package day03increment_decrement_operators;

public class Decrement01 {

	public static void main(String[] args) {
		
		int num = 100;
		
		// How to decrease the value of variable by substruction
		
		//1.way
		
		num = num-5;
		
		System.out.println("After 1.decrease num is " + num);
		
		//2.way
		
		num -=5;
		
		System.out.println("After 2.decrease num is " + num);
		
		//3.Way
		
		num--; 
		
		System.out.println("After 3.decrease num is " + num);
		
		
		//How to decrease the value of variable by devision
		
		int salary = 5000;
		
		//1.way
		
		salary = salary / 2;
		
		System.out.println("After 1.decrease salary is " + salary);
		
		//2.way
		salary /=2;
		
		System.out.println("after 2 decrease salary is " + salary);
		
		//Q: Decrease Ali's salary 20% then increase it by 100 dollars.		
		//  Increase Veli's salary 500 dollars then decrease it by 20%.	
		//  Then compare their salaries?
		
		
		int aliSalary = 600;
		int veliSalary = 500;
		
		aliSalary = (int) (aliSalary * 0.8);
		aliSalary += 100;
		
		System.out.println("Final Ali's Salary is " + aliSalary);
		
		//If you multiply int by double, the result will be double. that is why we should put (int) before veraible.
		
		veliSalary = (int) (veliSalary * 0.8);
		System.out.println("Final Veli's Salary is " + veliSalary);
		
		
		
		
				
				
	}

}
