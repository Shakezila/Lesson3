
public class Function {
	private final static double Pi = 3.14;
	
	static Circle calculationP(Circle circle) {
		circle.setP(2*circle.getR()*Pi);
		return circle;
	}
	
	static Circle calculationS(Circle circle) {
		circle.setS(circle.getR()*Pi);
		return circle;
	}
	
	static Circle firstType(Circle circle) {
		Fraction fraction = new Fraction(Reader.setOtherVariable(), Reader.setOtherVariable());
		circle.setY(fraction.getA()/(circle.getX()-fraction.getSmalA()));
		return circle;
	}
}
