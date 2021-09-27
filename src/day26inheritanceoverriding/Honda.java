package day26inheritanceoverriding;

public class Honda extends Car{
/*
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
 */
	public void move() {

		System.out.println("Honda moves fast..");
	}
}
