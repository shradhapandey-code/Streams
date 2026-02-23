package Day3;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.*;

public class ExtractAllWordsStartingSpecificLetter {
    static void main() {


        String input = "hello world this is a test";
      List<String> ans =  Arrays.stream(input.split(" "))
                .filter(word->word.startsWith("t"))
                .toList();
        System.out.println(ans);
    }
}
