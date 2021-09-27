package day26inheritanceoverriding;

public class FinalKeyWord {
	
	
	/*
	 "final" keyword can be used for;
	 a) Variables: It means you have to initialize the variable 
	 			   It means you cannot update the value after initializing
	 b) Methods: It means you can not change the body of the method. 
	 c) Class: Final classes cannot have child classes. It means you can not extend to final classes.
	 			Note: final classes can be child but cannot be parent class
	 			i) All wrapper classes are final classes
	 			ii) All immutable classes are final classes, so String Class is a final class 			
	*/
	
	public final String name="Ali Can";

	public static void main(String[] args) {
		//FinalKeyWord  obj=new FinalKeyWord ();
		//obj.name="Veli Han";// you can not assign final value. 
	}

}
