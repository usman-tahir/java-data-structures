
public class Ratio {
    protected int numerator;
    protected int denominator;

    public Ratio(int top, int bottom) {
        // pre: bottom != 0
        // post: Constructs a ratio equal to top::bottom

        this.numerator = top;
        this.denominator = bottom;
        this.reduce();
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public double getValue() {
        // post: return the double equivalent of the value
        return (double)this.numerator / (double)this.denominator;
    }

    public Ratio add(Ratio other) {
        // pre: other is non-null
        // post: return a new fraction - the sum of this and other
        int top = this.numerator * other.denominator + this.denominator * other.numerator;
        int bottom = this.denominator * other.denominator;

        return new Ratio(top, bottom);
    }

    protected void reduce() {
        // post: numerator and denominator are set so that the greatest common divisor
        // of the numerator and denominator is 1
        int divisor = gcd(this.numerator, this.denominator);
        if (this.denominator < 0) {
            divisor = -divisor;
        }
        this.numerator /= divisor;
        this.denominator /= divisor;
    }

    protected static int gcd(int a, int b) {
        // post: computes the greatest integer value that divides a and b
        if (a < 0) {
            return gcd(-a, b);
        }

        if (a == 0) {
            if (b == 0) {
                return 1;
            } else {
                return b;
            }
        }

        if (b < a) {
            return gcd(b, a);
        }

        return gcd(b % a, a);
    }

    public String toString() {
        // post: returns a string that represents this ratio
        return this.getNumerator() + "/" + this.getDenominator();
    }
}