import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphaNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String string = "";
        long sum = 0;
        boolean check = true;
        for (int i = 0; i <7 ; i++) {
            string = in.readLine();
            int x = Character.getNumericValue(string.charAt(2));
            int y = Character.getNumericValue(string.charAt(0));
            int z = Character.getNumericValue(string.charAt(1));

            int firstPairDifference = Math.abs(y    - x);
            int secondPairDifference = Math.abs(y- z);
            int thirdPairDifference = Math.abs(z - x);
            int max = Math.max(thirdPairDifference , Math.max(secondPairDifference,firstPairDifference));

            int sumOfAllDigits = x + y +z;
            if(max > sumOfAllDigits % 10){
                System.out.println(string);
            }

        }
    }
}
