package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class ShortestWordString {
    static void main() {
        String sentence = "Java streams are very powerful";
      String ans = Stream.of(sentence.split(" "))
                  .min(Comparator.comparingInt(String::length))
                  .orElse(null);
        System.out.println(ans);


    }
}
