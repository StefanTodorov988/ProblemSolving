import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MissCat {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int[] arr = new int[10];
        int max = -1231212;
        for (int i = 0; i < n; i++) {
            int temporary = Integer.parseInt(in.readLine());
            arr[temporary-1]++;
        }
        for (int i = 0; i < 10; i++) {
            if(arr[i] > max){
                max=arr[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if(arr[i] == max){
                System.out.println(i+1);
                break;
            }
        }
    }
}