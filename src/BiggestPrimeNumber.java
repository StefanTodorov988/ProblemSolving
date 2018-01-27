import java.util.Scanner;

public class BiggestPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;
        for (int i = n; i >= 0 ; i--) {
            if (isPrime(i)){
               max=i;
                break;
            }
        }
        System.out.println(max);
    }
    public static boolean isPrime(long n) {
        if(n > 2 && (n & 1) == 0)
            return false;
        for(int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}
