package interviewquestions;

import java.util.Scanner;

public class Iq03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eneter a number");
		int num = scan.nextInt();
		System.out.println(checkTobePrime(num));

		scan.close();

	}

	public static boolean checkTobePrime(int num) {
		int counter = 0;

		if (num > 0) {

			if (num == 1) {
				return true;
			} else {
				for (int i = 2; i < num; i++) {
					if (num % 1 == 0) {
						counter++;
					}
				}

				if (counter == 0) {
					return true;

				} else {
					return false;
				}
			}

		} else {
			return false;
		}
	}

}
