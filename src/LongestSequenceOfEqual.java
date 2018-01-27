import java.util.Scanner;

public class LongestSequenceOfEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lastNum = scanner.nextInt();
        int currentNum = 0;
        int longestSequence = -1232112312;
        int temporarySequence = 1;
        for (int i = 0; i < n - 1; i++) {
            currentNum = scanner.nextInt();
            if (currentNum == lastNum){
                temporarySequence++;
                if (longestSequence < temporarySequence){
                    longestSequence = temporarySequence;
                }
            }
            else  {
                temporarySequence = 1;
            }
            lastNum = currentNum;
        }
        System.out.println(longestSequence);
    }
}
