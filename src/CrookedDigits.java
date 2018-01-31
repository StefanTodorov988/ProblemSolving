import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrookedDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String number = in.readLine();

        String[] charsToRemove = new String[] {".","-" };
        for (String c : charsToRemove)
        {
            number = number.replace(c, "");
        }

        while (Long.parseLong(number) > 9)
        {
            long n = 0;
            for (int i = 0; i < number.length(); i++)
            {
                n += Long.parseLong(String.valueOf(number.charAt(i)));
            }
            number = String.valueOf(n);
        }
        if (Integer.parseInt(number) == 0)
        {
            System.out.println(number.charAt(0));;
            return;
        }
        System.out.println(number);;
    }
}