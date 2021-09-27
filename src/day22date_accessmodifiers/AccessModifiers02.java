package day22date_accessmodifiers;

import day20arrayliss.AccessModifiers03;

public class AccessModifiers02 {

	public static void main(String[] args) {
		/*
		 To access any class member from another class there are ways
		1.Way: Call by class name
		2.Way: By object
		
		-If a class member is "private", we can not access it from different class. 
		-If there is no access modifier it means it is "default. If a class member is default, we can access it from the same package only.
		We can not reach that class from different package.
		
		 */
		
		AccessModifiers01 obj1= new AccessModifiers01();
		System.out.println(obj1.name);
		
		System.out.println(obj1.schoolName);
		
		AccessModifiers03 obj2= new AccessModifiers03();
		System.out.println(obj2.lName);
		
		
		
	}

}
