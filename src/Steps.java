import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Steps {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(in.readLine());
        Integer result = getAllSteps(n);
        System.out.println(result);
    }

    private static Integer getAllSteps(int n){
        List<Integer> combinations = new ArrayList<Integer>();//Using only 0 index of the list so it can be given by reference
        combinations.add(0);
        generateAllCombinations(0 ,n , combinations);
        return combinations.get(0);
    }
    private static void generateAllCombinations(int combination,int n ,List<Integer> combinations){
        if(combination + 1 ==n){
            combinations.set(0,combinations.get(0) + 1);
            return;
        }
        if(combination  == n){
            combinations.set(0,combinations.get(0) + 1);
            return;
        }
        generateAllCombinations(combination + 1 , n ,combinations);
        generateAllCombinations(combination + 2 , n ,combinations);
    }
}