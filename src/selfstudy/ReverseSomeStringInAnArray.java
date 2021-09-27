package selfstudy;

//import java.util.ArrayList;
//import java.util.Arrays;

public class ReverseSomeStringInAnArray {
/*
 Show on the console one word as it is, and next word as reversed
        EXAMPLE
        String = "SQL takes time to learn, but it is useful software."
               =SQL sekat time ot learn, tub it si useful erawtfos. (harosa)
 */
	public static void main(String[] args) {
		
		 String str= "SQL takes time to learn, but it is useful software.";
		 String [] arr = str.split(" ");
		 
		 
		 for(int i=0; i<arr.length; i++) {
			 StringBuilder sb = new StringBuilder();
			 if(i%2==0) {
				 
				 sb.append(" "+arr[i]);	 
			 }else {
				 sb.append(arr[i]+" ").reverse();
			 }
			 System.out.print(sb.toString());	 
		 }
	 
		 
//		 ArrayList<String> list = new ArrayList<>();
//		 for(int i= 0; i<arr.length; i++) {
//			 if(i%2==0) {
//				 list.add(arr[i]);
//			 }else {
//				 String rvs="";
//				 for(int j = arr[i].length()-1; j>=0; j--) {
//					 rvs+=arr[i].charAt(j);	 
//				 }
//				 list.add(rvs);
//			 }	 
//		 }
//		 for(int i=0; i<list.size(); i++) {
//			 System.out.print(list.get(i)+" ");	 
//		 }	
	}
}
