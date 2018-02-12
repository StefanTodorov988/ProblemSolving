import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Steps {
    public static int counter = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(in.readLine());
        Integer result = getAllSteps(n);
        System.out.println(result);
    }
    private static Integer getAllSteps(int n){
        generateAllCombinations(0 ,n);
        return counter;
    }
    private static void generateAllCombinations(int combination,int n ){
        if(combination + 1 ==n){
            counter++;
            return;
        }
        if(combination  == n){
            counter++;
            return;
        }
        generateAllCombinations(combination + 1 , n);
        generateAllCombinations(combination + 2 , n);
    }
}