import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BiggestOfThree {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String num1 = in.readLine();
        String num2 = in.readLine();
        String num3 = in.readLine();

        if (Double.parseDouble(num1) > Double.parseDouble(num2)&&Double.parseDouble(num1) > Double.parseDouble(num3)){
            System.out.println(num1);
        }
        else if(Double.parseDouble(num2) > Double.parseDouble(num1)&&Double.parseDouble(num2) > Double.parseDouble(num3)){
            System.out.println(num2);
        }
        else{
            System.out.printf(num3);
        }
    }
}
