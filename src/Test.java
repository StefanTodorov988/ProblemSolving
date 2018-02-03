import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(

                new Person("Stefan",12),
                new Person("Stefan",12),
                new Person("Stefan",12),
                new Person("Stefan",12),
                new Person("Stefan",12),
                new Person("Stefan",12)
        );
        list.stream();
    }
}
class Person{
    public String name;
    public int age;
    public Person(String name ,int age){
        this.name = name;
        this.age =age;
    }
}
