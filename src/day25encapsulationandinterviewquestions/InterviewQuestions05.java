package day25encapsulationandinterviewquestions;

import java.util.Scanner;

public class InterviewQuestions05 {

	//Create a method to check if a number is arm strong or not.
	//153 is an armstrong number 
	//1*1*1+5*5*5+3*3*3=153
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number if it is a Armstrong number or not");
        int n = scan.nextInt();

        isArmstrong(n);
        scan.close();
    }
    public  static  void isArmstrong(int n){
        int sumOfCubes = 0;
        int temp=n;
        int digit =0;

        while(n>0){
            digit = n%10;
            sumOfCubes=sumOfCubes+digit*digit*digit;
            n= n/10;
        }
        if (temp==sumOfCubes){
            System.out.println(temp+" is an Armstrong number");
        }else{
            System.out.println(temp+" is not an Armstrong number");
     }
     }
}

