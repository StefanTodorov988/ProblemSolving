import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String string = in.readLine();
        long sum = 0;
        boolean check = true;
        while(check){
            check = false;
            int x = Character.getNumericValue(string.charAt(2));
            int y = Character.getNumericValue(string.charAt(0));
            int z = Character.getNumericValue(string.charAt(1));
            if (z == (y+x)){
                sum+= Integer.parseInt(string);
                check = true;
            }
            else{
                break;
            }
            string = in.readLine();
        }
        System.out.println(sum);
    }
}
