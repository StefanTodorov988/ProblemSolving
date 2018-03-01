import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Energy {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 0; i < input.length(); i++) {
            int currentNum = input.charAt(i) - '0';
           if(currentNum%2==0){
                sumOfEven+=currentNum;
           }
           else
           {
               sumOfOdd+=currentNum;
           }
        }
        if(sumOfEven > sumOfOdd){
            System.out.println(sumOfEven + " energy drinks");
        }
        else if(sumOfOdd > sumOfEven) {
            System.out.println(sumOfOdd + " cups of coffee");
        }
        else{
            System.out.println(sumOfEven + "of both");
        }
    }
}
