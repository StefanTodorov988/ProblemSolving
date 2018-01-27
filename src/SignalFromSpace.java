import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SignalFromSpace {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String n = in.readLine();
        StringBuilder stringBuilder = new StringBuilder("+");
        int currentlast = 0;
        for (int i = 0; i < n.length(); i++)
        {
            if (stringBuilder.charAt(currentlast) != n.charAt(i))
            {
                stringBuilder.append(n.charAt(i));
                currentlast++;
            }
        }
        System.out.println(stringBuilder.substring(1));
    }
}