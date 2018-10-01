import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	static boolean checkMenu(String menu) {
		Pattern p = Pattern.compile("^[1-4q]{1,1}$");
		Matcher m = p.matcher(menu);
		return m.matches();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String menu = "";
		boolean check = false;

		while (menu != "q") {
			
			System.out.println("1 - A/(x-a)");
			System.out.println("2 - A/pow((x-a),k) where k is int >=2");
			System.out.println("3 - (Ax+B)/(pow(x,2)+px+q) the roots are complex variables, pow(p,2)/4-q<0");
			System.out.println("4 - (Ax+B)/pow((pow(x,2)+px+q),2) k is =>2 the roots are complex pow(p,2)/4-q<0");

			System.out.println("q - to quit");
			System.out.print("choose:");

			while (!check) {
				menu = scanner.nextLine();
				check = checkMenu(menu);
				if(!check) {
					System.out.println("You entered wrong symbol!");
				}
			}
		}

		
		

	}
}
