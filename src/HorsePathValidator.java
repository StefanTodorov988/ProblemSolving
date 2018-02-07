import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HorsePathValidator {//Uncompleted
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(in.readLine());
        System.out.println(countOfPaths(n));
    }
    public static int countOfPaths(int n){
        List<Integer> list = new ArrayList<Integer>();
        int[][] matrix = new int[n][n];
        list.add(0);
        tracePath(n,matrix,0, list,0,0);
        return list.get(0);
    }
    public static void tracePath(int n,int[][] matrix, int counter ,List<Integer> list , int currentI , int currentJ ){//wrapping only 0 index

        if (isLegit(matrix, currentI - 2, currentJ - 1) && matrix[currentI - 2][currentJ - 1] == 0) {
            counter++;
            matrix[currentI][currentJ] = counter;
            currentI = currentI-2;
            currentJ = currentJ-1;
            tracePath(n , matrix ,counter, list,currentI,currentJ);
        } else if (isLegit(matrix, currentI - 2, currentJ + 1) && matrix[currentI - 2][currentJ + 1] == 0) {
            counter++;
            matrix[currentI][currentJ] = counter;
            currentI = currentI-2;
            currentJ = currentJ+1;
            tracePath(n , matrix ,counter, list,currentI,currentJ);
        } else if (isLegit(matrix, currentI - 1, currentJ - 2) && matrix[currentI - 1][currentJ - 2] == 0) {
            counter++;
            matrix[currentI][currentJ] = counter;
            currentI = currentI-1;
            currentJ = currentJ-2;
            tracePath(n , matrix ,counter, list,currentI,currentJ);
        } else if (isLegit(matrix, currentI - 1, currentJ + 2) && matrix[currentI - 1][currentJ + 2] == 0) {
            counter++;
            matrix[currentI][currentJ] = counter;
            currentI = currentI-1;
            currentJ = currentJ+2;
            tracePath(n , matrix ,counter, list,currentI,currentJ);
        } else if (isLegit(matrix, currentI + 1, currentJ - 2) && matrix[currentI + 1][currentJ - 2] == 0) {
            counter++;
            matrix[currentI][currentJ] = counter;
            currentI = currentI+1;
            currentJ = currentJ-2;
            tracePath(n , matrix ,counter, list,currentI,currentJ);
        } else if (isLegit(matrix, currentI + 1, currentJ + 2) && matrix[currentI + 1][currentJ + 2] == 0) {
            counter++;
            matrix[currentI][currentJ] = counter;
            currentI = currentI+1;
            currentJ = currentJ+2;
            tracePath(n , matrix ,counter, list,currentI,currentJ);
        } else if (isLegit(matrix, currentI + 2, currentJ - 1) && matrix[currentI + 2][currentJ - 1] == 0) {
            counter++;
            matrix[currentI][currentJ] = counter;
            currentI = currentI+2;
            currentJ = currentJ-1;
            tracePath(n , matrix ,counter, list,currentI,currentJ);
        } else if (isLegit(matrix, currentI + 2, currentJ + 1) && matrix[currentI + 2][currentJ + 1] == 0) {
            counter++;
            matrix[currentI][currentJ] = counter;
            currentI = currentI+2;
            currentJ = currentJ+1;
            tracePath(n , matrix ,counter, list,currentI,currentJ);
        } else {
            if (counter == (n*n)){
                list.set(0,list.get(0) + 1);
            }
        }
    }
    public static boolean isLegit(int[][] matrix, int i, int j) {
        if (i < 0) {
            return false;
        }
        if (i >= matrix.length) {
            return false;
        }
        if (j < 0) {
            return false;
        }
        if (j >= matrix[i].length) {
            return false;
        }
        return true;
    }
}
