import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reader {

	static Scanner scanner = new Scanner(System.in);

	static int setK() {
		int k;
		do {
			printMessage("k");
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
		printMessage("other");
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("You entered not a number!");
		}
		return variable = scanner.nextInt();
	}

	static int setP() {
		int p;
		double check = 0;

		do {
			int q = setOtherVariable();
			printMessage("p");
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You entered not a number!");
			}
			p = scanner.nextInt();
			check = Math.pow(p, 2) / 4 - q;
			if (check >= 0) {
				System.out.println("p isn't correct!");
			}
		} while (check >= 0);

		return p;
	}

	static int setQ() {
		int q;
		double check = 0;

		do {
			int p = setOtherVariable();
			printMessage("q");
			while (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("You entered not a number!");
			}
			q = scanner.nextInt();
			check = Math.pow(p, 2) / 4 - q;
			if (check >= 0) {
				System.out.println("q isn't correct!");
			}
		} while (check >= 0);

		return q;
	}

	static String setMenu() {
		String menu = "";
		boolean check = false;
		while (!check) {
			menu = scanner.next();
			check = checkMenu(menu);
			if (!check) {
				System.out.println("You entered wrong symbol!");
			}
		}
		return menu;
	}

	private static boolean checkMenu(String menu) {
		Pattern p = Pattern.compile("^[1-4q]{1,1}$");
		Matcher m = p.matcher(menu);
		return m.matches();
	}
	
	private static void printMessage(String var) {
		System.out.printf("Enter %s: ",var);
	}
}
