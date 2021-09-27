package ReplitQuestions;
		/*
		 1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.
		
		
		OutPut: 
		
		Sayilarin Toplami : 5050
		 */

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println("Sayilarin Toplami "+": "+sum);		
	}
}