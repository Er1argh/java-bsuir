public class Fraction {
    private int m;
    private int n;

    public Fraction(int m, int n) {
        if (n == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }

        this.m = m;
        this.n = n;

        simplify();
    }

    public Fraction(int m) {
        this(m, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    // Greatest Common Divisor
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;

            b = a % b;
            a = temp;
        }

        return Math.abs(a);
    }

    private void simplify() {
        int gcd = gcd(m, n);

        m /= gcd;
        n /= gcd;

        if (n < 0) {
            m = -m;
            n = -n;
        }
    }

    public static Fraction add(Fraction... fractions) {
        int numerator = 0;
        int denominator = 1;

        for (Fraction f : fractions) {
            numerator = numerator * f.n + f.m * denominator;
            denominator *= f.n;
        }

        return new Fraction(numerator, denominator);
    }

    public Fraction subtract(Fraction other) {
        return new Fraction(m * other.n - other.m * n, n * other.n);
    }

    public static Fraction multiply(Fraction... fractions) {
        int numerator = 1;
        int denominator = 1;

        for (Fraction f : fractions) {
            numerator *= f.m;
            denominator *= f.n;
        }

        return new Fraction(numerator, denominator);
    }

    public Fraction divide(Fraction other) {
        return new Fraction(m * other.n, n * other.m);
    }

    // It is automatically called in the println method
    @Override
    public String toString() {
        return m + "/" + n;
    }
}
