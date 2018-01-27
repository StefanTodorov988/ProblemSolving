import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Legs {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(in.readLine());
        int score = 0;
        for (int i = 0; i <= n ; i+=7)
        {
            for (int j = 0; j <= (n-i);j+=5 )
            {
                if ((n - (i +j)) %2==0)
                {
                    score++;
                }
            }
        }
        System.out.println(score);
    }
}
