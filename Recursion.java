public class Recursion extends Rational {
    public static double harmonicDouble(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 1.0 / n + harmonicDouble(n - 1);
        }
    }
    
    public static Rational harmonicRational(int num) {
        if (num == 1) {
            return new Rational(1, 1);
        } else {
            return new Rational(1, num).add(harmonicRational(num - 1));
        }
    }
    
    public static void main(String[] args) {
        System.out.println(harmonicDouble(8));
        System.out.println(harmonicRational(3));
    }
}
