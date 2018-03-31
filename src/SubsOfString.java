import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SubsOfString {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String word = in.readLine();

        while (word!=null){
            TreeMap<String ,Integer > map = new TreeMap<>();
            int max = -12312312;
            int kur = 0;
            while(kur < 4){
                for (int i = kur; i <word.length()-4; i+=4) {
                    String currentStr = word.substring(i,i+4);
                    if(map.containsKey(currentStr)){
                        map.put(currentStr , map.get(currentStr)+1);
                        if(max < map.get(currentStr)){
                            max = map.get(currentStr);
                        }
                    }
                    else{
                        map.put(currentStr,1);
                    }
                }
                kur++;
            }

            String leader = "}}}}";
            for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
                if(stringIntegerEntry.getValue() == max){
                    if(stringIntegerEntry.getKey().compareTo(leader) < 0){
                        leader =stringIntegerEntry.getKey();
                    }
                }
            }
            System.out.println(leader);
            word=in.readLine();
        }
    }
}