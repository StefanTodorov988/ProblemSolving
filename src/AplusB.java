import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int temporaryOne = sc.nextInt();
            int temporaryTwo = sc.nextInt();
            System.out.println(temporaryOne + temporaryTwo);
        }
    }
}
