import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class NFactorial {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(factorial(Double.parseDouble(in.readLine())));
    }
    public static BigInteger factorial(double number) {
        BigInteger result = new BigInteger(String.valueOf(1));
        for (int factor = 2; factor <= number; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }
}
