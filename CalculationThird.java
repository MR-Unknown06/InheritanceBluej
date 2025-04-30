
/**
 * Write a description of class js here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculationThird extends CalculationSecond {
    
    public double division(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        }
        return (double)a / b;
    }
}
