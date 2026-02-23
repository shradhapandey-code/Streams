package Day3;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class RemoveAllDigits {
    static void main() {
        String input = "hello 123 world";
             String ans = input.chars()
                 .filter(c-> !Character.isDigit(c))
                 .mapToObj(c-> String.valueOf((char)c))
                 .collect(Collectors.joining());
        System.out.println(ans);

    }
}
