package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public Fraction add(Fraction f2) {
		int newDen = this.getDenominator()*f2.getDenominator();
		int new1Num = this.getNumerator()*f2.getDenominator();
		int new2Num = this.getDenominator()*f2.getNumerator();
		int newNum = new1Num+new2Num;
		return new Fraction((new1Num+new2Num),newDen);
	}
	public Fraction mult(Fraction f2) {
		int newDen = this.getDenominator()*f2.getDenominator();
		int newNum = this.getNumerator()*f2.getNumerator();
		return new Fraction(newNum, newDen);
		}
	
	public int getNumerator() {
		return this.numerator;
	}
	public int getDenominator() {
		return this.denominator;
	}
	
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3,4);

	}

}
