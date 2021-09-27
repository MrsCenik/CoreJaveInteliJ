package practice_class07;
/*
 Static work flow in a single class:
 When u run a class in java, following steps will be executed.
 1) Identification of static members from top to bottom (During this process JVM assigns default value for each variable at the time of declaration)
 2) Execution of static variable assignments and static blocks from top to bottom
 3) Execution of main 
 //-----------------------------Static Control Flow in multiple classes---------------------------\\
    
    1) Identification of static members from from parent to child and off course from top to bottom
       During this process JVM assigns default value for each variable at the time of declaration)
    2) Execution of static variable assignments and static blocks from parent to child and off course from top to bottom
    
    3) Execution of main method of the child. if child class does not have one main method then parent's main method will be executed. 
****Important Note: Now, if u run the parent class only parent will be executed child class will not be loaded nor will be executed.
Because parent class members by default available to the child class where as child class members by default are not available to the parent class


	class Baba{
	int i  = 10;
	{
		m1();
		System.out.println("Baba first instance block");
	}
	Baba(){
		System.out.println("Baba Constructor");
	}
	public static void main(String[] args) {
		Baba t = new Baba(); //if this object creation was not here then the output would be only "Baba main"
		System.out.println("Baba main");
		//now If I add another object here. then it will repeat the instance control flow 
		//Baba tt = new Baba();
	}
	public void m1() {
		System.out.println(j);
	}
	{
		System.out.println("Baba second instance block");
	}
	int j = 20;
}




public class Lesson04_Instance_Control_Flow extends Baba {
	int i  = 100;
	{
		m2();
		System.out.println("Child First instance block");
	}
	Lesson04_Instance_Control_Flow(){
		System.out.println("Child Constructor");
	}
	public static void main(String[] args) {
		Lesson04_Instance_Control_Flow t = new Lesson04_Instance_Control_Flow();
		//if this object creation was not here then the output would be only "Child main"
		System.out.println("Child main");
		
		//now If I add another object here. then it will repeat the instance control flow 
		//Lesson04_Instance_Control_Flow tt = new Lesson04_Instance_Control_Flow();
	}
	public void m2() {
		System.out.println(y);
	}
	{
		System.out.println("Child Second instance block");
	}
	int y = 20;
}
 */

public class Review {

}
