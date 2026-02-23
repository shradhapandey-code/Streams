package Day3;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class ExtractAllUniqueWords {
    static void main() {
        String input = "hello world hello";
      List<String> ans =  Arrays.stream(input.split(" ")).distinct().toList();
        System.out.println(ans);

    }
}
