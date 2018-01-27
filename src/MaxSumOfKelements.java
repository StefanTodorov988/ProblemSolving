import java.util.Scanner;

public class MaxSumOfKelements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        int[] secondArray = new int[k];
        for (int i = 0; i <n ; i++) {
            arr[i] = scanner.nextInt();
            if (i <k){
                secondArray[i] = -123132123;
            }
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int IndexOfBiggest = -1;
            for (int j = 0; j < n; j++) {
                    if (secondArray[i]<arr[j]){
                        secondArray[i] = arr[j];
                        IndexOfBiggest = j;
                    }
            }
            sum += arr[IndexOfBiggest];
            arr[IndexOfBiggest] = -123132123;
        }
        System.out.println(sum);
    }
}
