package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class ReverseStringUsingStream {
    static void main() {
        String input = "hello";
       var ans = input.chars().mapToObj(c->(char)c)
                  .map(c->String.valueOf(c))
                  .reduce("",(a,b)-> b+a);
        System.out.println(ans);

    }
}
