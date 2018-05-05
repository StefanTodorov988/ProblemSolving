import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SecondTest {


    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(52/5);
        int t = Integer.parseInt(in.readLine());
        for (int a= 0; a < t; a++) {
            String[] input = in.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int l = Integer.parseInt(input[1]);
            int m = Integer.parseInt(input[2]);
            int k = Integer.parseInt(input[3]);
            int[] peshoWinning = Arrays.stream(in.readLine().split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] stanchoWinning = Arrays.stream(in.readLine().split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }
    }

}