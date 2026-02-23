package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class FindLeastFrequentElement {
    static void main() {
        List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
          String ans =     words.stream()
                 .collect(Collectors.groupingBy(i->i,Collectors.counting()))
                    .entrySet().stream().min(Map.Entry.comparingByValue())
                    .map(Map.Entry::getKey)
                     .orElseThrow(()->  new RuntimeException("No words found by default")); // orElse("null"), get()
        System.out.println(ans);

    }
}
