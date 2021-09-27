package day25encapsulationandinterviewquestions;

public class InterviewQuestions02 {

	public static void main(String[] args) {
		// Print 1 to 100 without using any number in your code
		
		//1st way
		int zero = 'b'/'b';//1
		String ten="$$$$$$$$$$";
		int t=ten.length();
		
		for (int i = zero; i<=t*t;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		
		//2nd way ascii
		//a=97, b=98, c=99, d=100
		
		for(int j= zero; j<='d';j++) {
			System.out.print(j+" ");
			
		}

	}
}
