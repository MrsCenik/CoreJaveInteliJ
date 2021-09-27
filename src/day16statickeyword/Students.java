package day16statickeyword;

public class Students {
// we have a student class here. inside the student class we created 5 variables. 
	String name;
	static String id;     //Class variable -static keyword is attached to the class not to the object
	int grade;
	int registrationYear;
	static int counter = 1000;   //Class variable -static keyword is attached to the class not to the object
	
	//
	
	public void setId() {
		
		counter++;
		id = ""+ registrationYear + grade + counter; 
		
	}
//I have constructor here. I created it from source / generate constructor using fields / last member / create
	
	public Students(String name, int grade, int registrationYear) {
		//there was super here. I deleted it. 
		this.name = name;
		this.grade = grade;
		this.registrationYear = registrationYear;
		setId();   // we use here atomic method. instead of typing code again we call method here. 
	}
	

	}
