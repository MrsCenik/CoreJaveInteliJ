package day14methodoverloadingconstruction;


/*
There are three main variable types in JAVA.
a)Local Variables : They are created inside a method body
					You have to initializing(Assigning a value) local variables
					When you create a variable, java uses default values for the variables, but
					if the variable is local variable Java does NOT use default values. Other wise when you try to use 
					local variable Java starts complaining. 

b)Instance(Object) Variables: If you create a variable outside the class without using "static" keyword,
								it is called "instance(Object) variable"
								
								Instance variables my initialize or not.
								If you initialize, Java uses the value which 
c)Class Variables
*/

public class VariableTypes01 {
	

	public static void main(String[] args) {
		
		//Local Variable
		//int y =11;
		//Local variable without initializing
	//	int z;
		
		//z=13;
		//When you try to use non-initialized local variable Java complains.
//		System.out.println(z);
	
	}
	public int add(int a, int b) {
		//Local variable
		//int x=12;
		
		return a+b;
		
		
	}

}
