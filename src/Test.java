import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Stefko",
                "Pefko"
        );
        System.out.println(list.get(0) + " " + list.get(1));
        doSomething(list);
        System.out.println(list.get(0) + " " + list.get(1));
        /////////////////////////////////////////////////////////
        Person pefko = new Person("Pefko");
        doSomethingSecond(pefko);
        System.out.println(pefko.name);
    }

    public static void doSomething(List<String> asd){
        asd.set(0,"Pefko");
        asd.set(1,"Stefko");

    }
    public static void doSomethingSecond(Person person){
        person= new Person("Stefko");
    }
}
class Person{
    public String name;
    public Person(String name ){
        this.name = name;
    }
}
