package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class LongestPalindromeOfString {
    static void main() {
        List<String> words = List.of("madam", "racecar", "apple", "banana", "level");
        String ans = words.stream().filter(word->word.equals(new StringBuilder(word).reverse().toString()))
                .max(Comparator.comparingInt(String::length))
                .orElse("null");
        System.out.println(ans);
    }
}
