import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;

public class CokiSkoki {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] tokens = in.readLine().split(" ");
        int[] arr = new int[tokens.length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        int max = 0;
        for (int i = 0; i < arr.length -1; i++) {
            int current = arr[i];
            int counter =0;
            arr[i] = 0;
            for (int j = i+1; j <arr.length ; j++) {
                if (current < arr[j]){
                    counter++;
                    current = arr[j];
                    arr[i] = counter;
                    if (max<counter){
                        max=counter;
                    }
                }
            }
        }
        arr[arr.length-1] = 0;
        System.out.println(max);
        for (int token: arr
             ) {
            System.out.print(token+ " ");
        }
    }
}
