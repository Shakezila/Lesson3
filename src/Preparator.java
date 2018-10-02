import java.util.HashSet;

public class Preparator {
	private Circle[] circles = { new Circle(4, 5), new Circle(8, 6), new Circle(7, 2), new Circle(11, 4),
			new Circle(13, 8), };
	private HashSet<Circle> circlesHashSet = new HashSet<>();
	
	private void prepareCircles () {
		for(Circle circle : this.circles) {
			Function.calculationP(circle);
			Function.calculationS(circle);
		}
	}

	public Circle[] getCircles() {
		prepareCircles();
		return circles;
	}

	public HashSet<Circle> getCirclesHashSet() {
		return circlesHashSet;
	}

	public void setCirclesHashSet(HashSet<Circle> circlesHashSet) {
		this.circlesHashSet = circlesHashSet;
	}
}
