package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming01 {
		/*
		 1) Lambda is Functional Programming
		 2) Functional Programming was added to Java in Java 8, before Java 8 we were using just 
		 	Structured Programming  but after JAva 8 we are able to use both Functional and Structural programming
		 3) Structured Programming focus on "How to do" most of times. 
		 4) Functional Programming is used with Collections and Arrays
		 
		 */
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(14);
        l.add(9);
        l.add(10);
        l.add(4);
        l.add(12);
        l.add(15);
        printElStructured(l);
        System.out.println();
        printElFunctional(l);
        System.out.println();
        printEvensStructured(l);
        System.out.println();
        printEvensFunctional(l);
        System.out.println();
        printSquersOfOdds(l);
        System.out.println();
        printCubeOfDistinctOdds(l);
        System.out.println();
        sumOfSquareDistinctEvens(l);  
        productsOfCubesOfDistinctEvens(l);
        getMaxElement(l);
        getMinElement(l);
        getMaxElement2(l);
        getMinElement2(l);
        getMinGreaterThanSevenEven(l);
        getMinGreaterThanSevenEven2(l); 
        getHalfOfDistinctElReversed(l);
        
	}
	
	//1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements(structured)
	
	public static void printElStructured(List<Integer> l) {
		for(Integer w : l) {
			System.out.print(w + " ");
			
		}
		
	}
	
	//1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements(functional)
	
	public static void printElFunctional(List<Integer> l ) {
		l.stream().forEach(t->System.out.print(t+ " "));
		
	}	
	//2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Structured)
	public static void printEvensStructured(List<Integer> l) {	
		for(Integer w : l) {
			if(w%2==0) {
				System.out.print(w + " ");
			}
			
		}
	}
	
	//2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Structured)
		public static void printEvensFunctional(List<Integer> l) {	
			l.stream().filter(t->t%2==0).forEach(t->System.out.print(t+ " ")); //t->t%2==0 the name of that structure is called "Lambda Expression"
		}
	//3)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
		public static void printSquersOfOdds(List<Integer> l) {
			l.stream().filter(t->t%2!=0).map(t->t*t).forEach(t->System.out.print(t+ " ")); //map() is used to change the value of elements
			
		}
	//4)Create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elements.
		public static void printCubeOfDistinctOdds(List<Integer> l) {
			l.stream().filter(t->t%2!=0).distinct().map(t->t*t*t).forEach(t->System.out.print(t+" ")); //distinct() removes repeated ones
			
		}
	//5)Create a method to calculate the sum of the squares of distinct even elements
		public static  void sumOfSquareDistinctEvens(List<Integer> l) {
			Integer sum = l.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t, u)->t+u);//For sum make the first parameter zero
			
			System.out.println("The sum of the squares of even distinct elements is " + sum);
		}
	//6)Create a method to calculate the product of the cubes of distinct even elements
		public static  void productsOfCubesOfDistinctEvens(List<Integer> l) {
			Integer product = l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t, u)->t*u); //we start with 1 because we will do multiplication.
			System.out.println("The multiplication of the cubes of even distinct elements is " + product); 
			
		}
	//7)Create a method to find the maximum value from the list elements
		//1.Way
		public static  void getMaxElement(List<Integer> l) {
			Integer maxEl = l.stream().reduce(Integer.MIN_VALUE, (t,u)->t>u ? t : u);
			System.out.println("The max element is " + maxEl);
		}
		//2.Way
		public static  void getMaxElement2(List<Integer> l) {
			//sorted()==> Returns a stream consisting of the elements of this stream, sorted according to natural order.
			Integer maxEl = l.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
			System.out.println("The max element is " + maxEl);
		}
		
	//8)Create a method to find the minimum value from the list elements
		//1.Way
		public static  void getMinElement(List<Integer> l) {
			Integer minEl = l.stream().reduce(Integer.MAX_VALUE, (t,u)->t<u ? t : u);
			System.out.println("The min element is " + minEl);
		}
		//2.Way
		public static  void getMinElement2(List<Integer> l) {
			//sorted()==> Returns a stream consisting of the elements of this stream, sorted according to natural order.
			Integer minEl = l.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
			System.out.println("The min element is " + minEl);
		}
	//9) Create a method to find the minimum value which is greater than 7 and even
		//1.Way
		public static void getMinGreaterThanSevenEven(List<Integer> l) {
			Integer minEl = l.stream().distinct().filter(t->t>7 && t%2==0).reduce(Integer.MAX_VALUE, (t,u)->t<u?t:u);
			System.out.println("1) The min element is "+minEl);	
		}
		//2.Way
		public static void getMinGreaterThanSevenEven2(List<Integer> l) {
			//Use findFirst() together with get() to get Integer return type
			Integer minEl = l.stream().distinct().filter(t->t>7 && t%2==0).sorted().findFirst().get(); 
			System.out.println("2) The min element is "+minEl);	
		}
	//10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
	    public static void getHalfOfDistinctElReversed(List<Integer> l) {
	        
	        List<Double> resutList = l.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	        
	        
	        System.out.println("Half of the elements list: " + resutList);//[7.5, 7.0, 6.5, 6.0, 5.0, 4.5]
	    }
		
}	
