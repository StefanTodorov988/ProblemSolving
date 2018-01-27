import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GeneratingAllNbitVectorsWithRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(in.readLine());
        getAllNBitNumbers(n).forEach(System.out::println);
    }
    private static List<String> getAllNBitNumbers(int n){
        List<String> combinations = new ArrayList<String>();
        generateNBitCombination("",n,combinations);
        return combinations;
    }
    private static void generateNBitCombination(String combination,int n ,List<String> combinations){
        if(combination.length() == n){
            combinations.add(combination);
            return;
        }
        generateNBitCombination(combination + '0' , n ,combinations);
        generateNBitCombination(combination + '1' , n ,combinations);
    }
}
