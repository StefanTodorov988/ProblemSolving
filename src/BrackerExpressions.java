import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BrackerExpressions {//Not completed - sorting logic
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        List<String> combinations = new ArrayList<>();
        List<Integer> mafia = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                int detection = 0;
                int counterForSorting = 1;
                for (int j = i+1; j <str.length(); j++) {
                    if(str.charAt(j) == '('){
                        detection++;
                        counterForSorting++;
                    }
                    if(str.charAt(j) == ')'&& detection ==0){
                        String temp = str.substring(i,j+1);
                        if(temp.charAt(temp.length()-1) == ')'){
                            combinations.add(temp);
                            mafia.add(counterForSorting);
                        }
                        break;
                    }
                    else if(str.charAt(j) == ')' && detection >0){
                        detection--;
                    }
                }
                counterForSorting=1;
            }
        }
        while(true){
            int currentMin = getMin(mafia);
            if(currentMin == Integer.MAX_VALUE)break;
            for (int i = 0; i < mafia.size(); i++) {
                if(mafia.get(i) == currentMin){
                    System.out.println(combinations.get(i));
                    mafia.set(i , Integer.MAX_VALUE);
                }
            }
        }
    }
    public static int getMin(List<Integer> list){
        int min = Integer.MAX_VALUE;
        for (Integer integer: list
             ) {
            if (integer < min){
                min = integer;
            }
        }
        return min;
    }
}