package Day2;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StringIsPalindrome {
    static void main() {
        String input = "madam";
        boolean isPalinfrome = IntStream.range(0,input.length()/2)
                .allMatch(i->input.charAt(i)==input.charAt(input.length()-1-i));
        System.out.println(isPalinfrome);

    }
}
