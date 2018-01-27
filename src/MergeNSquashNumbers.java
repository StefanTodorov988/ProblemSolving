import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeNSquashNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(in.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(in.readLine());
        }
        int[] merged = new int[n-1];
        int[] squashed = new int[n-1];
        for (int i = 0; i < n-1; i++)
        {
            int firstNum = arr[i]/10;
            int second = arr[i]%10;
            int third = arr[i+1]/10;
            int fourthNum = arr[i+1]%10;
            int secondAndThird = second + third;
            String asd = String.valueOf(secondAndThird);
            merged[i] = Integer.parseInt(String.valueOf(second) + String.valueOf(third));
            squashed[i] = Integer.parseInt(String.valueOf(firstNum) + (asd.length() < 2 ? asd.charAt(0) :asd.charAt(1)) + String.valueOf(fourthNum));
        }
        for (int i = 0; i < n-1; i++)
        {
            if (i < n-2)
            {
                System.out.print(merged[i] + " ");
            }
            else
            {
                System.out.print(merged[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < n - 1; i++)
        {
            if (i < n - 2)
            {
                System.out.print(squashed[i] + " ");
            }
            else
            {
                System.out.print(squashed[i]);
            }
        }
    }
}
