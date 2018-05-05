package NBUContests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vafles {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(in.readLine().trim());
        while (tests > 0) {
            String[] tokens = in.readLine().trim().split(" ");
            String[] secondTokens = in.readLine().trim().split(" ");
            long boxN = Integer.parseInt(tokens[0]);
            long boxM = Integer.parseInt(tokens[1]);
            long boxK = Integer.parseInt(tokens[2]);

            long vafN = Integer.parseInt(secondTokens[0]);
            long vafM = Integer.parseInt(secondTokens[1]);
            long vafK = Integer.parseInt(secondTokens[2]);

            long best = 0;

            best = Math.max((boxK / vafK) * (boxN / vafN) * (boxM / vafM), best);
            best = Math.max((boxK / vafK) * (boxN / vafM) * (boxM / vafN), best);

            best = Math.max((boxK / vafM) * (boxN / vafK) * (boxM / vafN), best);
            best = Math.max((boxK / vafM) * (boxN / vafN) * (boxM / vafK), best);

            best = Math.max((boxK / vafN) * (boxN / vafM) * (boxM / vafK), best);
            best = Math.max((boxK / vafN) * (boxN / vafK) * (boxM / vafM), best);

            System.out.println(best);

            tests--;
        }
    }
}
