import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] str = in.readLine().split(" ");
        System.out.println(gcd(Integer.parseInt(str[0]),Integer.parseInt(str[1])));
    }
    public static int gcd (int n, int m) {

        if (m > n) {
            if ((m % n) == 0)
                return n;
            else
                return gcd(n, m % n);
        }
        else {
            if ((n % m) == 0)
                return m;
            else
                return gcd(m, n % m);
        }
    }
}
