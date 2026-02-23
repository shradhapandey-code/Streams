package Day3;
import java.util.*;
import  java.util.stream.Stream;
import java.util.stream.Collectors;

public class RemoveAllSpecialCharacters {
    static void main() {
//        String input = "hello@world!";
//        String ans =  input.chars().filter(c-> Character.isLetterOrDigit(c)|| Character.isWhitespace(c))
//                .mapToObj(c->String.valueOf((char)c))
//                .collect(Collectors.joining());
//        System.out.println(ans);
        String text = "Hello@ World! 123 #$%";
        String cleaned = text.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(cleaned);
    }
}
