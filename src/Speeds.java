import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Speeds {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Integer> map = new HashMap<>();
        int n = Integer.parseInt(in.readLine());
        int[] speeds = new int[n];
        for (int i = 0; i < n; i++)
        {
            speeds[i] = Integer.parseInt(in.readLine());
        }
        int maxValue = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int j = i+1;
            int currentSum = speeds[i];
            int counter = 1;
            while( j < n &&speeds[i]<speeds[j]){
                currentSum+=speeds[j];
                j++;
                counter++;
            }
            map.put(currentSum , counter);

            if(currentSum > max){
                max = currentSum;
            }
            if(counter>maxValue){
                maxValue = counter;
            }
        }
        List<Integer> list = new LinkedList<>();
        int maxNum = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value == maxValue){
                list.add(key);
                if(key > maxNum){
                    maxNum=key;
                }
            }
        }
        System.out.println(maxNum);
    }
}