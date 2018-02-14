import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DogeCoin_NativeRecSolution {
    public static int maxSum = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] nAndM = in.readLine().split(" ");
        int n = Integer.parseInt(nAndM[0]);
        int m = Integer.parseInt(nAndM[1]);
        int[][] matrix = new int[n][m];
        int amountOfCoins = Integer.parseInt(in.readLine());
        for (int i = 0; i < amountOfCoins; i++) {
            String[] tokens = in.readLine().split(" ");
            Integer rowToken = Integer.parseInt(tokens[0]);
            Integer colToken = Integer.parseInt(tokens[1]);
            matrix[rowToken][colToken]++;
        }
        trace(matrix);
        System.out.println(maxSum);
    }
    public static void trace(int[][]matrix){
        traceHelper(matrix,0,0,0);
    }
    public static void traceHelper(int[][]matrix, int currentRow , int currentCol,int currentSum){
        if(currentRow == matrix.length-1 && currentCol == matrix[0].length -1){
            currentSum+=matrix[matrix.length-1][matrix[0].length -1];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            return;
        }
        if(currentRow < matrix.length-1 && currentCol <matrix[0].length-1){
            currentSum+=matrix[currentRow][currentCol];
            traceHelper(matrix,currentRow+1,currentCol,currentSum);
            traceHelper(matrix,currentRow,currentCol+1,currentSum);
        }
        else if(currentRow == matrix.length -1){
            currentSum+=matrix[currentRow][currentCol];
            traceHelper(matrix,currentRow,currentCol+1,currentSum);
        }
        else if(currentCol == matrix[0].length -1){
            currentSum += matrix[currentRow][currentCol];
            traceHelper(matrix,currentRow+1,currentCol,currentSum);
        }
    }
}
