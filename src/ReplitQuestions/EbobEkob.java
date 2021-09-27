package ReplitQuestions;

import java.util.Scanner;

/*
		 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
		
		Input : 
			
		30
		
		40
			
			Beklenen Cikti:
		
		30 ve 40 icin GCD = 10
		
		30 ve 40 icin LCM = 120
		 */
public class EbobEkob {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number");
			int num1 = scanner.nextInt();
			System.out.println("Enter an other number");
			int num2 = scanner.nextInt();
			int gcd=1;
			for(int i = 1; i <= num1 && i <= num2; i++){
	      if(num1%i==0 && num2%i==0){
	        gcd = i;
	      }             
	    }
			int lcm = (num1 * num2) / gcd;
			System.out.println(num1+" ve "+ num2 +" icin "+ "GDC"+" = "+gcd);
			System.out.println(num1+" ve "+ num2 +" icin "+ "LMC"+" = "+lcm);
		scanner.close();
	  }
	}