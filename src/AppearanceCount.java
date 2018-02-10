import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AppearanceCount {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(in.readLine());
        Map<String , Integer> map = new HashMap<>();
        for (String str:in.readLine().split(" ")) {
            if (map.containsKey(str)){
                map.put(str,map.get(str) + 1);
            }
            else{
                map.put(str,1);
            }
        }
        String searchedNum = in.readLine();
        //ystem.out.println(map.containsKey(searchedNum)? map.get(searchedNum): 0);
    }
}
