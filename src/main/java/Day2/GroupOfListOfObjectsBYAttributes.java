package Day2;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class GroupOfListOfObjectsBYAttributes {
    record Person(String name, int age){}


    public static void main(String args[]) {
        List<Person> people = List.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 25)
        );

       Map<Integer, List<Person>> ans =  people.stream().collect(Collectors.groupingBy(Person::age));
       System.out.println(ans);
    }
}