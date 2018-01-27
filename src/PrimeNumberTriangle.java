import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int n = scanner.nextInt();
        for (int i = 1; i <=n ; i++) {
            if(isPrime(i)){
                list.add(i);
            }
        }
        for (int i = 0; i <list.size() ; i++) {
            for (int j = 1; j <=list.get(i); j++) {
                System.out.print(isPrime(j) ? 1 : 0);
            }
            System.out.println();
        }

    }
    public static boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
