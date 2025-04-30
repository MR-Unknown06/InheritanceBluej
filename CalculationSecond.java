
/**
 * Write a description of class zf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculationSecond extends Calculation {
    public long factorial(int n) {
        if (n == 0) return 1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
