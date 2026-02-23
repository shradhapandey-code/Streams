package Day3;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.*;
// extract the words from String and count therir occurenecs
public class ExtractAllWordsFromString {
    static void main() {
        String input = "hello world hello";
        Map<String,Long>  ans = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(ans);

    }
}

