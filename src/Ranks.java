import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ranks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] secondArr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int count = n;
        for (int j = 0; j < n ; j++) {
            for (int i = 0; i <n ; i++) {
                if (arr[i] < min && arr[i] != -665656565 ){
                    min = arr[i];
                }
            }
            secondArr[IndexOfMin(arr,min)] = count;
            count--;
            arr[IndexOfMin(arr,min)] = -665656565;
            min = Integer.MAX_VALUE;
        }

        String result = Arrays.stream(secondArr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
    public static int IndexOfMin(int[] arr , int min){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min)return i;
        }
        return 0;
    }
}
