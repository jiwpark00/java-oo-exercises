
public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public double getDeciValue() {
		return (double) numerator/denominator;
	}
	
	public static void main(String args[]) {
		Fraction example1 = new Fraction(4,10);
		System.out.println(example1.getNumerator());
		System.out.println(example1.getDenominator());
		System.out.println(example1.getDeciValue());
		
	}
}
