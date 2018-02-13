import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubsetOfSumsOptimized {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int searchedSum = Integer.parseInt(in.readLine());
        String[] tokens = in.readLine().split(" ");
        int[] arr = new int[tokens.length];
        for (int i = 0; i <tokens.length ; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        boolean temp = existingChecker(searchedSum,arr);
        System.out.println( temp ? "yes" : "no" );
    }
    public static boolean existingChecker(int searchedSum,int[] arr){
        return existingCheckerHelper(searchedSum,arr,0);
    }
    public static boolean existingCheckerHelper(int searchedSum,int[] arr,int currentSum){
        if(currentSum == searchedSum){
            return true;
        }
        // TODO
        return false;
    }
}
