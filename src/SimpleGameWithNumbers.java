import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleGameWithNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer str = Integer.parseInt(in.readLine());
        Integer firstNum = str/100;
        str-= (firstNum * 100);
        Integer secondNum = str/10;
        Integer lastNum = str%10;

        int case1 = firstNum * secondNum * lastNum;
        int case2 = firstNum + secondNum + lastNum;
        int case3 = firstNum * secondNum + lastNum;
        int case4 = firstNum + secondNum * lastNum;
        int result1 = Math.max(case1,case2);
        int result2 = Math.max(case3,case4);
        int result = Math.max(result1,result2);
        System.out.println(result);
    }
}