package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class FirstRepeatedCharacterString {
    static void main() {
        String input = "hello";
    Character ans =  input.chars().mapToObj(c->(char)c)
                 .collect(Collectors.groupingBy(i->i, LinkedHashMap::new ,Collectors.counting()))
                 .entrySet().stream().filter(e->e.getValue()>1)
                 .map(Map.Entry::getKey)
                 .findFirst()
                 .orElse(null);
        System.out.println(ans);
    }
}
