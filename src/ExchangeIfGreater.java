import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExchangeIfGreater {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String n = in.readLine();
        String m = in.readLine();
        if (n.contains(".")){
            double first = Double.parseDouble(n);
            double second = Double.parseDouble(m);
            System.out.println(first > second ? n + " " + m : m + " " + n);
        }
        else{
            int first = Integer.parseInt(n);
            int second = Integer.parseInt(m);
            System.out.println(first < second ? n + " " + m : m + " " + n);
        }

    }
}
