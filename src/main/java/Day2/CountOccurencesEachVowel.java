package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class CountOccurencesEachVowel {
    static void main() {
        String input = "hello world";
   Map<Character, Long> ans= input.chars()
           .mapToObj(c-> (char) c)
           .filter(c-> "aeiou".contains(String.valueOf(c)))
           .collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(ans);
    }
}
