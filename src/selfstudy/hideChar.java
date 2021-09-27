package selfstudy;

import java.util.Scanner;

public class hideChar {

	/*public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String name=scanner.nextLine();
		String surname=scanner.nextLine();
		String card = scanner.nextLine();
		if(card.length()!=16){
		  System.out.println("Invaild credit card number");
		}
		int i=1;
		int nameLength = name.length();
		StringBuilder nameSB = new StringBuilder();
		nameSB.append(name.charAt(0));
		while(i<nameLength){		
			nameSB.append('*');
			i++	;
		}
		i=1;
		int surnameLength = surname.length();
		StringBuilder surnameSB = new StringBuilder();
		surnameSB.append(surname.charAt(0));
		while(i<surnameLength){		
			surnameSB.append('*');
			i++	;
		}
		i=0;
		int cardLength = card.length();
		StringBuilder cardSB = new StringBuilder();
		while(i<cardLength){
			if(i<12) {
				cardSB.append('*');
			}else {
				cardSB.append(card.charAt(i));
			}
			if((i+1)%4==0) {
				cardSB.append(' ');
			}
			i++;
		}
		System.out.println("Name: "+ nameSB.toString() + " "+ surnameSB.toString());
		System.out.println("CC: " + cardSB.toString());
		
		scanner.close();
	}*/
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String name=scanner.nextLine();
		String surname=scanner.nextLine();
		String card = scanner.nextLine();
		int cardLength = card.length();
		if(cardLength!=16){
			System.out.println("Invaild credit card number");
		}
		int i=1;
		int nameLength = name.length();
		String newName = new String();
		newName += name.charAt(0);
		while(i<nameLength){		
			newName += '*';
			i++	;
		}
		i=1;
		int surnameLength = surname.length();
		String newSurname = new String();
		newSurname += surname.charAt(0);
		while(i<surnameLength){		
			newSurname += '*';
			i++	;
		}
		i=0;
		String newCard = new String();
		while(i<cardLength){
			if(i<12) {
				newCard += '*';
			}else {
				newCard += card.charAt(i);
			}
			i++;
			if(i%4==0 && i<cardLength) {
				newCard += ' ';
			}
		}
		System.out.println("Name: "+ newName + " "+ newSurname);
		System.out.println("CC: " + newCard);
		
		scanner.close();
	}	
}