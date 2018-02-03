import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiralMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[][] matrix = new int[n][n];
        int counter = 1;
        int currentI = 0;
        int currentJ = 0;
        boolean checker = true;
        while(checker){
            checker = false;
            while (currentJ < matrix.length && matrix[currentI][currentJ] == 0){
                matrix[currentI][currentJ]  = counter;
                counter++;
                currentJ++;
                checker = true;
            }
            currentJ--;
            currentI++;
            while (currentI < matrix.length && matrix[currentI][currentJ] == 0){
                matrix[currentI][currentJ]  = counter;
                counter++;
                currentI++;
                checker = true;
            }
            currentI--;
            currentJ--;
            while (currentJ >= 0 && matrix[currentI][currentJ] == 0){
                matrix[currentI][currentJ]  = counter;
                counter++;
                currentJ--;
                checker = true;
            }
            currentJ++;
            currentI--;
            while (currentI >= 0 && matrix[currentI][currentJ] == 0){
                matrix[currentI][currentJ]  = counter;
                counter++;
                currentI--;
                checker = true;
            }
            currentI++;
            currentJ++;
        }
        printMatrix(matrix,n);
    }
    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
