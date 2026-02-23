package Day3;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class RemoveAllConstants {
    static void main() {
        String input = "hello world ";
     String ans=  input.chars()
                .filter(c->"aeiou".contains(String.valueOf((char)c)))
                .mapToObj(c-> String.valueOf((char) c))
                       .collect(Collectors.joining());
        System.out.println(ans);
    }

}
