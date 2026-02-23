package Day3;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class ExtractAllPalindromicWordsFromString {
    static void main() {
        String input = "madam racecar apple banana level";
      List<String> ans =   Arrays.stream(input.split(" "))
                 .filter(word->word.equals(new StringBuilder(word).reverse().toString()))
                 .toList();
        System.out.println(ans);
    }
}
