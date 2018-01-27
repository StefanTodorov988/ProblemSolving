import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MostFrequent {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int maxValue = 0;
        int maxKey = 0;
        for (int i = 0; i < n; i++) {
            int temporary = Integer.parseInt(in.readLine());
            if (map.containsKey(temporary)){
                map.put(temporary, map.get(temporary) + 1);
            }
            else{
                map.put(temporary,  1);
            }
            Integer key = temporary;
            Integer value = map.get(temporary);

            if(maxValue < value){
                maxKey = key;
                maxValue = value;
            }
        }
        System.out.println(maxKey + " (" + maxValue + " times)");
    }
}