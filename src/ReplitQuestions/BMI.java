package ReplitQuestions;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		    //System.out.println("Kilonuzu giriniz");
		    double kg=scanner.nextDouble();
		    //System.out.println("Boyunuzu giriniz");
		    double cm=scanner.nextDouble();
		    double bmi=kg/(cm*cm);
		    System.out.println("Agirlik : "+kg);
		    System.out.println("Boy : "+cm);
		    System.out.println("BMI : "+bmi);

		    if(bmi<18.5){
		      System.out.println("Zayifsiniz");
		    }else if(18.5<bmi&&bmi<25){
		      System.out.println("Zayifsiniz");
		    }else if(25<bmi&&bmi<30){
		      System.out.println("Sismansiniz");
		    }else if(bmi>30){
		      System.out.print("obez");
		    }
		    scanner.close();
		  }
	}