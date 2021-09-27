package day24multithreadsyncencapsulation;

public class Test01 {

	public static void main(String[] args) {
		String str1="Java";
		String str2="Java";
		String str3= new String ("Java");
		//StringBuilder strbld1=new StringBuilder("Java");
		
		
		if(str1==str2){ //getting output...String pool
			System.out.println("str1 and str2 equal to eachpther with==" );
		}
		if(str1==str3){ //no output because it is false. Java create new container after using "new" keyword
			System.out.println("str1 and str3 equal to eachother with==" );
		}
		if(str1.equals(str3)){
			System.out.println("str1 and str3 equal to eachpther with .equals()" );
		}
		//If you compare data in different data types with"==", Java gives you Compile Time Error
//		if(str1==strbld1){
//			System.out.println("str1 and str3 equal to each other with .equals()" );
//		}
		//If you compare data in different data types with ".equals()", Java gives you Compile Time Error
//		if(str1.equals(strbld1)){ //no output. there is gray underline.
//			System.out.println("str1 and strbld1 equal to each other with .equals()" );
//		}
		

	}

}
