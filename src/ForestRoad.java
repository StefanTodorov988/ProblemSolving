import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class ForestRoad {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(in.readLine());

        for (int i = 0; i <n; i++) {
            System.out.println(String.join("", Collections.nCopies(i, ".")) + "*" +String.join("",
                    Collections.nCopies(n-i-1, ".")));
        }
        for (int i = 1; i < n; i++) {
            System.out.println(String.join("", Collections.nCopies(n-i-1, ".")) + "*" +String.join("",
                    Collections.nCopies(i, ".")));
        }
    }
}
