import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HorsePath {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[][] matrix = new int[n][n];
        int iterator = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    int temporaryI = i;
                    int temporaryJ = j;
                    while (true) {
                        matrix[temporaryI][temporaryJ] = iterator;
                        if (isLegit(matrix, temporaryI - 2, temporaryJ - 1) && matrix[temporaryI - 2][temporaryJ - 1] == 0) {
                            matrix[temporaryI - 2][temporaryJ - 1] = iterator;
                            temporaryI = temporaryI - 2;
                            temporaryJ = temporaryJ - 1;
                            iterator++;
                        } else if (isLegit(matrix, temporaryI - 2, temporaryJ + 1) && matrix[temporaryI - 2][temporaryJ + 1] == 0) {
                            matrix[temporaryI - 2][temporaryJ + 1] = iterator;
                            temporaryI = temporaryI - 2;
                            temporaryJ = temporaryJ + 1;
                            iterator++;
                        } else if (isLegit(matrix, temporaryI - 1, temporaryJ - 2) && matrix[temporaryI - 1][temporaryJ - 2] == 0) {
                            matrix[temporaryI - 1][temporaryJ - 2] = iterator;
                            temporaryI = temporaryI - 1;
                            temporaryJ = temporaryJ - 2;
                            iterator++;
                        } else if (isLegit(matrix, temporaryI - 1, temporaryJ + 2) && matrix[temporaryI - 1][temporaryJ + 2] == 0) {
                            matrix[temporaryI - 1][temporaryJ + 2] = iterator;
                            temporaryI = temporaryI - 1;
                            temporaryJ = temporaryJ + 2;
                            iterator++;
                        } else if (isLegit(matrix, temporaryI + 1, temporaryJ - 2) && matrix[temporaryI + 1][temporaryJ - 2] == 0) {
                            matrix[temporaryI + 1][temporaryJ - 2] = iterator;
                            temporaryI = temporaryI + 1;
                            temporaryJ = temporaryJ - 2;
                            iterator++;
                        } else if (isLegit(matrix, temporaryI + 1, temporaryJ + 2) && matrix[temporaryI + 1][temporaryJ + 2] == 0) {
                            matrix[temporaryI + 1][temporaryJ + 2] = iterator;
                            temporaryI = temporaryI + 1;
                            temporaryJ = temporaryJ + 2;
                            iterator++;
                        } else if (isLegit(matrix, temporaryI + 2, temporaryJ - 1) && matrix[temporaryI + 2][temporaryJ - 1] == 0) {
                            matrix[temporaryI + 2][temporaryJ - 1] = iterator;
                            temporaryI = temporaryI + 2;
                            temporaryJ = temporaryJ - 1;
                            iterator++;
                        } else if (isLegit(matrix, temporaryI + 2, temporaryJ + 1) && matrix[temporaryI + 2][temporaryJ + 1] == 0) {
                            matrix[temporaryI + 2][temporaryJ + 1] = iterator;
                            temporaryI = temporaryI + 2;
                            temporaryJ = temporaryJ + 1;
                            iterator++;
                        } else {
                            iterator++;
                            break;
                        }
                    }
                }
            }
        }
        printMatrix(matrix, n);
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

    public static void printMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
