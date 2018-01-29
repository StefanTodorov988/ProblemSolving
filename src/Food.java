import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Food {//Uncompleted
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double maximumCapacity = Double.parseDouble(in.readLine());
        long amountOfFoods = Long.parseLong(in.readLine());
        List<FoodA> arrayOfFoods = new ArrayList<>();
        FoodA[] arr = new FoodA[(int) amountOfFoods];
        for (int i = 0; i <amountOfFoods ; i++) {
            String[] tokens = in.readLine().split(" ");
            int weight = Integer.parseInt(tokens[1]);
            int taste = Integer.parseInt(tokens[2]);
            arrayOfFoods.add(new FoodA(tokens[0] , weight , taste));
            arr[i] =new FoodA(tokens[0] , weight , taste);
        }
        arrayOfFoods.sort(new Comparator<FoodA>() {
            public int compare(FoodA left, FoodA right)  {
                return (int) (right.taste - left.taste);
            }
        });
        List<FoodA> secondList = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i <amountOfFoods ; i++) {
            if(i < arrayOfFoods.size()&&arrayOfFoods.get(i).weight <= maximumCapacity){
                counter+=arrayOfFoods.get(i).taste;
                maximumCapacity-=arrayOfFoods.get(i).weight;
                secondList.add(arrayOfFoods.get(i));
                arrayOfFoods.remove(i);
                i--;
            }
        }
        System.out.println(counter);
        for (long i = amountOfFoods-1; i >=0 ; i--) {
            for (int j = 0; j < secondList.size(); j++) {
                if (arr[(int) i].name == secondList.get(j).name){
                    System.out.println(arr[(int) i].name);
                }
            }
        }
    }
}
class FoodA{
    public String name;
    public double weight;
    public double taste;
    public FoodA(String name ,double weight ,double taste){
        this.name = name;
        this.weight = weight;
        this.taste = taste;
    }
}