package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterString {
    static void main() {
        String input = "hello";
 Character ans =    input.chars()
                  .mapToObj(c->(char) c)
                  .collect(Collectors.groupingBy(i->i,LinkedHashMap::new, Collectors.counting()))
                     .entrySet()
                     .stream()
                     .filter(entry->entry.getValue()==1)
         .map(Map.Entry::getKey)
         .findFirst()
         .orElse(null);
        System.out.println(ans);

    }
}
