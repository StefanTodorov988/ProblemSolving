import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class Trapezoid {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        System.out.print(String.join("", Collections.nCopies(n, ".")));
        System.out.print(String.join("", Collections.nCopies(n, "*")));
        System.out.println();

        int counter = n - 1;
        int secondCounter = n - 1;
        while (counter > 0) {
            System.out.print(String.join("", Collections.nCopies(counter, ".")));
            System.out.print("*");
            System.out.print(String.join("", Collections.nCopies(secondCounter, ".")));
            System.out.print("*");
            System.out.println();
            secondCounter++;
            counter--;
        }
        System.out.println(String.join("", Collections.nCopies(n * 2, "*")));
    }
}
