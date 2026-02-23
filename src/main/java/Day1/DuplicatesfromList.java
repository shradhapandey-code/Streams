package Day1;
import java.util.*;
import java.util.stream.Stream;


public class DuplicatesfromList {
    public static void main(String args[]) {
        List<String> list = Arrays.asList("Java", "Ruby", "C#", "Java", "Kotlin", "Ruby", "C++", "COBOL", "C#");
        List<Integer> number = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 7, 8, 9, 10, 10);

     System.out.println (   list.stream().distinct().toList());
     System.out.println(number.stream().distinct().sorted().toList());
    }
}