package day24multithreadsyncencapsulation;
/*			
 * 			
 * 				
 * 
 * 		
 * 
 * 
 * 
 * 
 * 
 * 
 */

/*
 	1. Single Inheritance: Child can have just a single parent
 	2. Hierarchical Inheritance: A parent will have  multiple child class
 	3. Multilevel Inheritance: If a child has parent, grandparent, grand grand parent,....
 	
 */

	/*
	 1.In JAva, there is parent-child relationship.
	 2.A parent can have infinitively many child classes.
	 3.Inheritance means; child classes can use class members from parent class
	 4.Inheritance is so beneficial in
	 	a)Edging repetition
	 	b)Maintenance
	 	c)Reusability
	 5.A child class may have grandparents as well.
	 
	 
	 */
public class Animal{
	public void move() {
		System.out.println("Animals mave...");
	}
	public void eat() {
		System.out.println("Animals eat...");
	}
	

}
