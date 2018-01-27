import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double x = scanner.nextDouble();
        double sum = 1;
        for (double i = 1; i <=n ; i++) {
                sum += factorial(i)/Math.pow(x,i);
        }
        System.out.printf("%.5f", sum);
    }
    public static long factorial(double number) {
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }
}
