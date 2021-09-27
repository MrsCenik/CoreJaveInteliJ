package day24multithreadsyncencapsulation;

public class Runner {

	public static void main(String[] args) {
		Cat cat1= new Cat();
		
		cat1.move();
		cat1.eat();
		cat1.meow();
		
		
		System.out.println("========================");
		
		Dog dog1= new Dog();
		dog1.bark();
		dog1.move();
		dog1.eat();
		
		System.out.println("========================");
		
		Bird bird1=new Bird();
		bird1.eat();
		bird1.move();
		bird1.fly();
		
		

	}

}
