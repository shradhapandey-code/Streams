package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class ShortestPalindromeOfString {
    static void main() {
        List<String> words = List.of("madam", "racecar", "apple", "banana", "level");
      String ans =    words.stream().
                  filter(word-> word.equals(new StringBuilder(word).reverse().toString()))
                  .min(Comparator.comparingInt(String::length))
                  .get();
        System.out.println(ans);


    }
}
