import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

       int n = Integer.parseInt(in.readLine());

       for (int i = 0 ; i < n;i++){
           String useless = in.readLine();
           String temp  = in.readLine();
           int count = 1;
           List<String> list = (LinkedList<String>) palindromes(temp);
           Collections.sort(list, new Comparator<String>() {
               @Override
               public int compare(String o1, String o2) {
                   return o2.length() - o1.length();
               }
           });
           for (String str: list) {
               System.out.println(str   );
           }
           System.out.println(count);
       }
    }
    public static List<String> palindromes(final String input) {

        final List<String> result = new LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            // expanding even length palindromes:
            expandPalindromes(result,input,i,i+1);
            // expanding odd length palindromes:
            expandPalindromes(result,input,i,i);
        }
        return result;
    }
    public static  void expandPalindromes(final List<String> result, final String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            result.add(s.substring(i,j+1).trim());
            i--; j++;
        }
    }

}


