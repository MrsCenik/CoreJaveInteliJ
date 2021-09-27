package day26inheritanceoverriding;

public class OopConceptReview {
	/*
	 Oop concept has 4 main rules in Java
	 
	 1) Encapsulation:
	 	a) Data hiding
	 	b) By using "private" access modifier, we can hide data
	 	c) After hiding if you want to read data from other classes, create "getters"
	 	d) After hiding if you want to update data from other classes, create "setters"
	 	e) To create objects from classes in Java we have many ways
	 		i) A obj1=new A();   ==> Fixed object
	 		
	 		ii) A obj2=new A("Veli Han", 13);
	 			A obj3=new A("Ayse Tan", 23);
	 			
	 		iii) A obj4=new A();
	 			obj4.setName("Ayse Tan");
	 			obj4.setAge(43);
	 			
	 			.
	 			.
	 			.
	 			obj4.setName("Mark Stone");
	 			obj4.setAge(23);
	 			.
	 			.
	 			.
	2) Polymorphism: Overloading and Overriding 
	 	 a)Overloading:
	 	 	
	 	 	
	 	 b)Overriding: 
	 	 	1) When you override a method you use same access modifiers. 
 			2) Access modifier in child class can not have narrower access modifier
 				than its parent
 			3) "private" methods cannot be overridden, because overriding means 
    			you want to use the method in another class.. but private class members can not be used in other classes.
    
   				"final" methods cannot be overridden, because final method's body
    			can not be updated but in overriding, we update the method body. 
    
			    "static" methods cannot be overridden, because static methods are common methods
			     for all child classes.  If any child updates it the others child classes will be effected. 
			     It can create problems because of that Java does not let overriding for static methods. 
    
			 4) @Overtide annotation checks the overriding rules, if there is any missed
			 	or used wrongly overriding rule, it will give CTE.
			 	
			 5) In overriding return types of "overridden" and "overriding" methods can be same
			 6) In overriding, from "overriding" methods return type to "overridden" method return type 
			    you must have "IS-A" relationship
			    Note: If there is  "IS-A" relationship between return types, return types are called 
			    "Covariant Return Types"
			 7) In overriding, if the return type is "primitive" return types of "overridden" and "overriding" 
			 	methods must be same.
			 8) In overriding, if the return type is "void" return types of "overridden" and "overriding" 
			 	methods must be "void".
	 	 	
	 	 	
	 	 c)What is the difference between "Overloading" and "Overriding"?
	 	 
	 	 	i) Overloading does not need "inheritance", but inheritance is must for "Overriding".
	 	 	ii) private and static methods can be Overloaded, but private and static methods can not be overridden
	 	 	iii) final methods can be overloaded but final methods cannot be overridden.
	 	 	iv) Overloading happens in Compile Time, but Overriding happens in Run Time
	 	 	v) Overloading is faster than Overriding 
	 	 
	  3) Inheritance: look at the related classes 
	  	A. Single Inheritance: Child can have just a single parent
 		B. Hierarchical Inheritance: A parent will have  multiple child class
 		C. Multilevel Inheritance: If a child has parent, grandparent, grand grand parent,....
 		
 		I. In Java, there is parent-child relationship.
	 	II. A parent can have infinitively many child classes.
	 	III. Inheritance means; child classes can use class members from parent class
	 	IV. Inheritance is so beneficial in
		 	a)Edging repetition
		 	b)Maintenance
		 	c)Reusability
	 	V. A child class may have grandparents as well.
 	
	  
	 	 
	  4) Abstraction: coming soon...
	  
	 			
	 */

}
