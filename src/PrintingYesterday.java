import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintingYesterday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        String monthString = "";
        Map<Integer,String> dic = new HashMap<Integer,String>();
        dic.put(2 , "Feb");
        dic.put(1 , "Jan");
        dic.put(3 , "Mar");
        dic.put(4 , "Apr");
        dic.put(5 , "May");
        dic.put(6 , "Jun");
        dic.put(7 , "Jul");
        dic.put(8 , "Aug");
        dic.put(9 , "Sep");
        dic.put(10 , "Oct");
        dic.put(11 , "Nov");
        dic.put(12 , "Dec");

        if(day == 1)
        {
            int visokosnaChecher1 = year % 4;
            if (month == 1)
            {
                monthString = "Dec";
                day = 31;
                year -= 1;
            }
            else
            {
                monthString = dic.get(month-1);
                month -= 1;
                if (month == 1)
                    day = 31;
                else if (month == 2)
                    day = 29;
                else if (month == 3)
                    day = 31;
                else if (month == 4)
                    day = 30;
                else if (month == 5)
                    day = 31;
                else if (month == 6)
                    day = 30;
                else if (month == 7)
                    day = 31;
                else if (month == 8)
                    day = 31;
                else if (month == 9)
                    day = 30;
                else if (month == 10)
                    day = 31;
                else if (month == 11)
                    day = 30;
                else if (month == 12)
                    day = 31;
            }
            System.out.println(day + "-" + monthString + "-" + year);
        }
        else
        {
            System.out.println(day - 1 + "-" + dic.get(month) + "-" + year);
        }
    }
}
