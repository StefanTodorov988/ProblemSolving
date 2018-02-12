import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MaxSumofSubsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(in.readLine());
        int currentMax = Integer.MIN_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = Integer.parseInt(in.readLine());
        }
        for (int i = 0; i <n ; i++) {
            int sum = arr[i];
            for (int j = i+1; j <n ; j++) {
                sum+=arr[j];
                if (sum > currentMax){
                    currentMax = sum;
                }
            }
        }
        System.out.println(currentMax);
    }
}