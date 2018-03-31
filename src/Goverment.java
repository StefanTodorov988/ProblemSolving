import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.lang.reflect.Array;
        import java.util.Arrays;

public class Goverment {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine().trim();
        while(input != null){
            int partyAmount = Integer.parseInt(input);
            int[] parties = new int[partyAmount];
            int maxSum = 0;
            int countOfCoalitions = 0;
            for (int j = 0; j < partyAmount; j++) {
                String[] str = in.readLine().trim().split(" ");
                parties[j] = Integer.parseInt(str[1]);
                maxSum += parties[j];
            }
            int amountOfmask = (int) Math.pow(2, partyAmount);

            for (int j = 0; j < amountOfmask; j++) {
                String binString = Integer.toBinaryString(j);
                int temporary = 0;
                int counter = 0;


                for (int k = binString.length() - 1; k >= 0; k--) {
                    if (binString.charAt(k) == '1') {
                        temporary += parties[counter];

                    }
                    counter++;
                }
                if (temporary > maxSum - temporary) {
                    countOfCoalitions++;
                }
            }
            Arrays.sort(parties);
            int temp = 0;
            int count = 0;
            for (int i = parties.length-1; i >= 0 ; i--) {
                temp+=parties[i];
                count++;
                if(temp>maxSum-temp){
                    break;
                }
            }
            System.out.println(countOfCoalitions + " " + count);
            input = in.readLine();
        }
    }
}
