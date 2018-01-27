import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestIncreasingSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int lastNum = Integer.parseInt(in.readLine());
        int currentNum = 0;
        int longestSequence = -1232112312;
        int temporarySequence = 1;
        for (int i = 0; i < n - 1; i++) {
            currentNum = Integer.parseInt(in.readLine());
            if (currentNum > lastNum){
                temporarySequence++;
                if (longestSequence < temporarySequence){
                    longestSequence = temporarySequence;
                }
            }
            else  {
                temporarySequence = 1;
            }
            lastNum = currentNum;
        }
        System.out.println(longestSequence);
    }
}