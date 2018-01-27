import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class JediMeditation {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        Queue<String> master = new LinkedList<String>();
        Queue<String> knight = new LinkedList<String>();
        Queue<String> padawans = new LinkedList<String>();
        String[] tokens = in.readLine().split(" ");
        for (String token: tokens ) {
            if(token.charAt(0) == 'M'){
                master.add(token);
            }
            if(token.charAt(0) == 'K'){
                knight.add(token);
            }
            if(token.charAt(0) == 'P'){
                padawans.add(token);
            }
        }
        while(master.peek() != null){
            System.out.print(master.poll() +" ");
        }
        while(knight.peek() != null){
            System.out.print(knight.poll() +" ");
        }
        while(padawans.peek() != null){
            System.out.print(padawans.poll() +" ");
        }
    }
}
