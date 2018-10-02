
public class Function {
	private final static double Pi = 3.14;

	static Circle calculationP(Circle circle) {
		circle.setP(2 * circle.getR() * Pi);
		return circle;
	}

	static Circle calculationS(Circle circle) {
		circle.setS(circle.getR() * Pi);
		return circle;
	}

	static Circle firstType(Circle circle) {
		Fraction fraction = new Fraction(Reader.setOtherVariable(), Reader.setOtherVariable());
		try {
			circle.setY(fraction.getA() / (circle.getX() - fraction.getSmalA()));
		} catch (ArithmeticException e) {
			System.out.println("The operation is wrong devide by zero!");
		}
		return circle;
	}

	static Circle secondType(Circle circle) {
		Fraction fraction = new Fraction(Reader.setOtherVariable(), Reader.setOtherVariable(), Reader.setK());
		try {
			circle.setY(fraction.getA() / (int) Math.pow((circle.getX() - fraction.getSmalA()), 2));
		} catch (ArithmeticException e) {
			System.out.println("The operation is wrong devide by zero!");
		}
		return circle;
	}

	static Circle thirdType(Circle circle) {
		Fraction fraction = new Fraction(Reader.setOtherVariable(), Reader.setOtherVariable(),
				Reader.setOtherVariable(), Reader.setP(), Reader.setQ());
		try {
			circle.setY((fraction.getA() * circle.getX() + fraction.getB())
					/ (int) (Math.pow(circle.getX(), 2 + fraction.getP() * circle.getX() + fraction.getQ())));
		} catch (ArithmeticException e) {
			System.out.println("The operation is wrong devide by zero!");
		}
		return circle;
	}

	static Circle fourthType(Circle circle) {
		Fraction fraction = new Fraction(Reader.setOtherVariable(), Reader.setOtherVariable(), Reader.setK(),
				Reader.setOtherVariable(), Reader.setP(), Reader.setQ());
		try {
			circle.setY((fraction.getA() * circle.getX() + fraction.getB()) / (int) Math
					.pow((Math.pow(circle.getX(), 2 + fraction.getP() * circle.getX() + fraction.getQ())), 2));
		} catch (ArithmeticException e) {
			System.out.println("The operation is wrong devide by zero!");
		}
		return circle;
	}

	static void findMaxMinSAndP(Circle[] circles) {
		double minS = circles[0].getS();
		double maxS = circles[0].getS();
		double minP = circles[0].getP();
		double maxP = circles[0].getP();
		int maxPindex = 0, minPindex = 0, maxSindex = 0, minSindex = 0;
		for (int i = 1; i < circles.length; i++) {
			if (circles[i].getP() > maxP) {
				maxPindex = i;
			}
			if (circles[i].getP() < minP) {
				minPindex = i;
			}
			if (circles[i].getS() < minS) {
				minSindex = i;
			}
			if (circles[i].getS() > maxS) {
				maxSindex = i;
			}
		}
		System.out.printf("Circle %d has max P = %.2f\n", maxPindex + 1, circles[maxPindex].getP());
		System.out.printf("Circle %d has min P = %.2f\n", minPindex + 1, circles[minPindex].getP());
		System.out.printf("Circle %d has max S = %.2f\n", maxSindex + 1, circles[maxSindex].getS());
		System.out.printf("Circle %d has min S = %.2f\n", minSindex + 1, circles[minSindex].getS());
	}
}
