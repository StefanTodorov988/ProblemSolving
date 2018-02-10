import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Hops {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<Long> list = new ArrayList<>();
        for (String str : in.readLine().split(", ")) {
                list.add(Long.parseLong(str));
        }
        long[] arr =  list.stream().mapToLong(i->i).toArray();
        long[] secondArr = arr.clone();
        int n = Integer.parseInt(in.readLine());
        long counter = 0 ;
        int currentPosition = 0;
        long maxCounter = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            counter+= arr[0];
            arr[0] = Integer.MIN_VALUE;
            for (String str : in.readLine().split(", ")) {
                Integer indexer = Integer.parseInt(str);
                if(indexer > 0){
                    currentPosition += indexer;
                        if(isLegit(arr,currentPosition)){
                        counter+= arr[currentPosition];
                        arr[currentPosition] = Integer.MIN_VALUE;
                    }
                    else break;

                }
                else{
                    currentPosition+= indexer;
                    if(isLegit(arr,currentPosition)){
                        counter+= arr[currentPosition];
                        arr[currentPosition] = Integer.MIN_VALUE;
                    }
                    else break;
                }
            }
            if(counter > maxCounter){
                maxCounter = counter;
            }
            arr = secondArr.clone();
            currentPosition = 0;
            counter = 0;
        }
        System.out.println(maxCounter);
    }
    public static boolean isLegit(long[] arr , int index){
        if(index >= arr.length){
            return  false;
        }
        if(index < 0){
            return false;
        }
        if(arr[index]== Integer.MIN_VALUE){
            return false;
        }
        return true;
    }
}
