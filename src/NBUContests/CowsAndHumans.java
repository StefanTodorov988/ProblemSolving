package NBUContests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CowsAndHumans {
    static char[][] temp;
    static int manCounter = 0;
    static int cowCounter = 0;

    static void picIterator(int nextX, int nextY, char ch) {
        if (nextX < 0 || nextX >= temp.length || nextY < 0 || nextY >= temp[nextX].length || temp[nextX][nextY] == 'o' || temp[nextX][nextY] != ch) {
            return;
        }
        temp[nextX][nextY] = 'o';
        picIterator(nextX + 1, nextY, ch);
        picIterator(nextX - 1, nextY, ch);
        picIterator(nextX, nextY + 1, ch);
        picIterator(nextX, nextY - 1, ch);

    }

    static void cowPicIterator(int nextX, int nextY, char ch) {
        if (nextX < 0 || nextX >= temp.length || nextY < 0 || nextY >= temp[nextX].length || temp[nextX][nextY] == 'o') {
            return;
        }
        if ((temp[nextX][nextY] == 'R' || temp[nextX][nextY] == 'G') && ch == 'B') {
            return;
        } else if (ch != 'B' && temp[nextX][nextY] == 'B') {
            return;
        }

        temp[nextX][nextY] = 'o';
        cowPicIterator(nextX + 1, nextY, ch);
        cowPicIterator(nextX - 1, nextY, ch);
        cowPicIterator(nextX, nextY + 1, ch);
        cowPicIterator(nextX, nextY - 1, ch);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int tests = Integer.parseInt(in.readLine());
        while (tests > 0) {
            int rows = Integer.parseInt(in.readLine());
            String col = in.readLine();
            char[][] pic = new char[rows][col.length()];

            for (int i = 0; i < col.length(); i++) {
                pic[0][i] = col.charAt(i);
            }
            for (int i = 0; i < rows - 1; i++) {
                col = in.readLine();
                for (int j = 0; j < col.length(); j++) {
                    pic[i + 1][j] = col.charAt(j);
                }
            }
            temp = cloneMatrix(pic);

            for (int i = 0; i < pic.length; i++) {
                for (int j = 0; j < pic[i].length; j++) {
                    if (temp[i][j] != 'o') {
                        picIterator(i, j, temp[i][j]);
                        manCounter++;
                    }
                }
            }

            temp = cloneMatrix(pic);
            for (int i = 0; i < pic.length; i++) {
                for (int j = 0; j < pic[i].length; j++) {
                    if (temp[i][j] != 'o') {
                        cowPicIterator(i, j, temp[i][j]);
                        cowCounter++;
                    }
                }
            }
            System.out.print(manCounter + " " + cowCounter);
            System.out.println();


            manCounter = 0;
            cowCounter = 0;
            tests--;
        }
    }

    static char[][] cloneMatrix(char[][] mat) {
        char[][] newMat = new char[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            System.arraycopy(mat[i], 0, newMat[i], 0, mat[i].length);
        }
        return newMat;
    }

    static void printMatrix(char[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
