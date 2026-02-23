package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class ListOfStringByLength {
    static void main() {
        List<String> words = List.of("apple", "banana", "kiwi");
   Map<Integer,List<String>> ans =   words.stream().collect(Collectors.groupingBy(String::length));
   System.out.println(ans);

    }
}
