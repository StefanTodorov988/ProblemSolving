package NBUContests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parking {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String input = in.readLine();
        int count = 1;
        while (!input.equals("end")){
            if(input.equals("0")){
                System.out.println("test case #" + count+": " + 0 + " " + 0);
                input = in.readLine();
                count++;
                continue;
            }
            int searchedNum = Integer.parseInt(input);
            int num = -1;
            int index = 0;
            int letsAdd = 1;
            for (int i = 0; ; i++) {
                num+= letsAdd;
                if(num >= searchedNum){
                    index = i;
                    break;
                }
                letsAdd ++;
            }
            int indexX = index - (num - searchedNum);
            int indexY = num - searchedNum;

            System.out.println("test case #" + count+": " + indexY + " " + indexX);
            input = in.readLine();
            count++;
        }
    }
}
