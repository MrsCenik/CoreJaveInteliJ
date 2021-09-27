package ReplitQuestions;
/*
  Create 2 constructors one is with parameters, the other one is without parameter.
By using that constructors create at least 2 objects then print their features on the console.
 */

public class Constructors03 {
	String color="Red";
	char size='S';
	
	Constructors03(){
		System.out.print("Blouse is ");
	}	
	
	Constructors03(char newSize, String newColor) {
	color=newColor;
	size=newSize;
	System.out.print("Tshirt is ");
	}
	
	public static void main(String[] args) {
		
	Constructors03 tshirt = new Constructors03('M',"Blue");
	
	System.out.print(tshirt.size +" ");
	System.out.print(tshirt.color);
	System.out.println();
	
	Constructors03 blouse = new Constructors03();
	System.out.print(blouse.size);
	System.out.print(blouse.color+" ");

	}
}