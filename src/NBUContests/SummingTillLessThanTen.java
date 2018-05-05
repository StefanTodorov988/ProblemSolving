package NBUContests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummingTillLessThanTen {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine() ;
        while (true) {
            while (str.length() > 1) {
                int temp = 0;
                for (int i = 0; i < str.length(); i++) {
                    temp += str.charAt(i) - '0';
                }
                str = String.valueOf(temp);
            }
            System.out.println(str);

            str = in.readLine();
            if(str.equals("-1")){
                return;
            }
        }
    }
}
