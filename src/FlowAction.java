
public class FlowAction {

	private View view = new View();
	private Preparator preparator = new Preparator();

	public void run() {
		String menu = "";
		for (Circle circle : preparator.getCircles()) {
			view.printMenu();
			menu = Reader.setMenu();
			switch (menu) {
			case "1": {
				circle = Function.firstType(circle);
				break;
			}
			case "2": {
				circle = Function.secondType(circle);
				break;
			}
			case "3": {
				circle = Function.thirdType(circle);
				break;
			}
			case "4": {
				circle = Function.fourthType(circle);
				break;
			}
			}
		}
	}

	public void additionalFunctions() {
		Function.findMaxMinSAndP(this.preparator.getCircles());
	}
}
