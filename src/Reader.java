import java.util.Scanner;

public class Reader {

	static Scanner scanner = new Scanner(System.in);

	static int setK() {
		int k;
		do {
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You entered not a number!");
			}
			k = scanner.nextInt();
			if (k < 2) {
				System.out.println("K less than 2!");
			}
		} while (k <= 2);
		return k;
	}

	static int setOtherVariable() {
		
		int variable;
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("You entered not a number!");
		}
		return variable = scanner.nextInt();
	}

	static int setP() {

		int q = setOtherVariable();
		int p;
		double check = 0;

		do {
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You entered not a number!");
			}
			p = scanner.nextInt();
			check = Math.pow(p,2)/4-q;
			if(check >= 0) {
				System.out.println("p isn't correct!");
			}
		} while (check >= 0);

		return p;
	}
	
	static int setQ() {
		int p = setOtherVariable();
		int q;
		double check = 0;

		do {
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You entered not a number!");
			}
			q = scanner.nextInt();
			check = Math.pow(p,2)/4-q;
			if(check >= 0) {
				System.out.println("q isn't correct!");
			}
		} while (check >= 0);

		return q;
	}
}
