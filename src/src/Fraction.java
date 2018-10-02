
public class Fraction {
	
	private Reader reader = new Reader();
	private int A;
	private int a;
	private int k;
	private int B;
	private int p;
	private int q;
	
	public Fraction(int A, int a) {
		this.A = a;
		this.a = a;
	}

	public Fraction(int A, int a, int k) {
		this.A = A;
		this.a = a;
		this.k = k;
	}

	public Fraction(int A, int a, int B, int p, int q) {
		this.A = A;
		this.a = a;
		this.B = B;
		this.p = p;
		this.q = q;
	}

	public Fraction(int A, int a, int k, int B, int p, int q) {
		this.A = A;
		this.a = a;
		this.k = k;
		this.B = B;
		this.p = p;
		this.q = q;
	}

	public Reader getReader() {
		return this.reader;
	}

	public int getSmalA() {
		return this.a;
	}
	
	public int getA() {
		return this.A;
	}

	public int getK() {
		return this.k;
	}

	public int getB() {
		return this.B;
	}

	public int getP() {
		return this.p;
	}

	public int getQ() {
		return this.q;
	}
}
