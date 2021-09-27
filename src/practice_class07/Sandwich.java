package practice_class07;
  /*
	 1.A sandwich is two pieces of bread with something in between. 
	 Print the string that is between the first and last appearance of "bread" in the given string, 
	 or return string "nothing" if there are not two pieces of bread.\
	 ex: breadozkanbread==> ozkan //// breadozkan==> nothing 
	 */



public class Sandwich {

	
	public static String isSandwich(String str) {
        int a=str.indexOf("bread");
        int b=str.lastIndexOf("bread");
        if(a==b) {
        	return "nothing";
        }else 
        return str.substring(a+5,b);
    }

	public static void main(String[] args) {
		System.out.println(isSandwich("breadozkan"));
	
	}
}
