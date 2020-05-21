public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        numerator = 0;
        denominator = 1;
    }

    public Rational(int p, int q) {
        this.numerator = p;
        this.denominator = q;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public void negate() {
        numerator = -numerator;
    }

    public void invert() {
        if (numerator == 0) {
            return;
        }
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    public double toDouble() {
        return ((double) numerator) / denominator;
    }

    public Rational reduce() {
        int gcd = findGcd(numerator, denominator);
        return new Rational(numerator / gcd, denominator / gcd);
    }

    public static int findGcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            // Checks if i is factor of both integers
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public Rational add(Rational r) {
        int p = numerator * r.getDenominator() + r.getNumerator() * denominator;
        int q = denominator * r.getDenominator();
        Rational result = new Rational(p, q);
        return result.reduce();
    }

    public static void main(String[] args) {
        Rational r = new Rational(3, 4);
        r.invert();
        System.out.println(r.toDouble());

        Rational s = new Rational(6, 12);
        System.out.println(r.add(s));
    }
}
