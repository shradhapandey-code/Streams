package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class CountOcuurencesOfEachWordString {
    static void main() {
        String input = "hello world hello";
        Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect);


    }
}
