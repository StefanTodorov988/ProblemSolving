import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSumOf3x3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndM = in.readLine().split(" ");
        int n = Integer.parseInt(nAndM[0]);
        int m = Integer.parseInt(nAndM[1]);
        int[][] arr = new int[n][n];
        for (int i = 0; i <n ; i++) {
            String[] tokens = in.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                if (checkIndex(arr,i,j)){
                    arr[i][j]= Integer.parseInt(tokens[j]);
                }
            }
        }
        long max = Long.MIN_VALUE;
        for (int i = 2; i <n ; i++) {
            for (int j = 2; j < m; j++) {
               if (checkIndex(arr,i,j)){
                   int currentSumOf3x3 = arr[i][j]
                           +arr[i][j-1]
                           +arr[i][j-2]
                           +arr[i-1][j]
                           +arr[i-1][j-1]
                           +arr[i-1][j-2]
                           +arr[i-2][j]
                           +arr[i-2][j-1]
                           +arr[i-2][j-2];
                   if (max < currentSumOf3x3 ){
                        max=currentSumOf3x3;
                   }
               }
            }
        }
        System.out.println(max);
    }
    public static boolean checkIndex(int[][]arr,int i ,int j){
        if(i < 0 || j < 0){
            return false;
        }
        if (i > arr.length - 1){
            return false;
        }
        if(j >arr[i].length -1){
            return false;
        }
        return true;
    }
}