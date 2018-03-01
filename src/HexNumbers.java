import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringBuilder cocnated = new StringBuilder("");
        for (int i = 0; i < n; i++) {//123123123123
            Long temporary = Long.parseLong(in.readLine());
            cocnated.append(String.valueOf(Long.toHexString(temporary)).toUpperCase());
        }
        char currentChar= '0';
        char lastChar = cocnated.charAt(0);
        int longestSequence = 1;
        int temporarySequence = 1;
        for (int i = 1; i < cocnated.length(); i++) {
            currentChar = cocnated.charAt(i);
            if(currentChar == lastChar){
                temporarySequence++;
                if(temporarySequence > longestSequence){
                    longestSequence = temporarySequence;//11ADD
                }
            }
            else{
                temporarySequence = 1;
            }
            lastChar = currentChar;
        }
        char newcurrentChar= '0';
        char newlastChar = cocnated.charAt(0);
        int newlongestSequence = 1;
        int newtemporarySequence = 1;
        int counter =0;
        for (int i = 1; i < cocnated.length(); i++) {
            newcurrentChar = cocnated.charAt(i);
            if(newcurrentChar == newlastChar){
                newtemporarySequence++;
                if(newtemporarySequence > newlongestSequence){
                    newlongestSequence = newtemporarySequence;//11ADD
                }
            }
            else{
                if(longestSequence == newtemporarySequence){
                    counter++;
                }
                newtemporarySequence = 1;
            }
            newlastChar = newcurrentChar;
            if(i == cocnated.length()-1){
                if(longestSequence == newtemporarySequence){
                    counter++;
                }
            }
        }
        if(counter == 0)counter =1;
        System.out.println(longestSequence + " " + counter);
    }
}