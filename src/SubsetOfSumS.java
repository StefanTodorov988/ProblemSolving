import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SubsetOfSumS {
    public static List<String> listOfByteMasks = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        listOfByteMasks.add("");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int searchedSum = Integer.parseInt(in.readLine());
        List<Integer> listOfElements = new ArrayList<>();
        for (String token:in.readLine().split(" ")) {
            Integer num = Integer.parseInt(token);
            listOfElements.add(num);
        }
        generateAllByteMasks(listOfElements.size());
        listOfByteMasks.remove(0);
        for (String str:listOfByteMasks) {
            int currentSum =0;
            for (int i = 0; i < listOfElements.size(); i++) {
                    if(str.charAt(i) == '1'){
                        currentSum+=listOfElements.get(i);
                    }
            }
            if(currentSum== searchedSum){
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
    }
    public static void generateAllByteMasks(int lenght){
        generateAllByteMasksHelper(lenght,"");
    }
    public static void generateAllByteMasksHelper(int lenght, String combination){
        if(combination.length() == lenght){
            listOfByteMasks.add(combination);
            return;
        }
        generateAllByteMasksHelper(lenght,combination+"0");
        generateAllByteMasksHelper(lenght,combination+"1");
    }
}