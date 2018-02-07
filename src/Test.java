import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.asList(in.readLine().split(" "));

        List<Person> arr = list.stream().map(x -> new Person(x)).filter(Person.distinctByKey(Person::getName)).collect(Collectors.toList());

        arr.stream().map(x -> x.name = "Teko").collect(Collectors.toList());
        arr.forEach(x-> x.name = "Teko");
        arr.forEach(x -> System.out.println(x.name));
    }

    public static void doSomething(List<String> asd) {
        asd.set(0, "Pefko");
        asd.set(1, "Stefko");

    }

    public static void doSomethingSecond(Person person) {
        person = new Person("Stefko");
    }
}

class Person implements Comparator<Person> {
    public String name;
    private static int counter = 0;
    private int selfCounter;

    public Person(String name) {
        this.name = name;
        counter++;
        selfCounter = counter;
    }

    public int getCounter() {
        return selfCounter;
    }
    public String getName() {
        return name;
    }
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.name == o2.name) {
            return 0;
        }
        return 1;
    }
    public static <Person> Predicate<Person> distinctByKey(Function<? super Person, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
}
