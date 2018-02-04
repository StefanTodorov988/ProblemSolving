import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        printAllPermutations(n);
    }
    public static void printAllPermutations(int n){
        traceAllCombinations(n , "");
    }
    public static void traceAllCombinations(int n , String string){
        if (string.length() == n){
            System.out.println(string);
            return;
        }
        for (int i = 1; i <=n ; i++) {
            if (!string.contains(Integer.toString(i)))
            traceAllCombinations(n , string + i);
        }
    }
}