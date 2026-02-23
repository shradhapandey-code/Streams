package Day2;

import java.util.Map;
import java.util.stream.Collectors;

public class CountTheOcuurenecesOFEachDigit {
    static void main() {
        String input = "hello 123 world 456";
      Map<Character,Long> ans =input.chars()
              .mapToObj(c-> (char) c)
              .filter(Character::isDigit)
              .collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(ans);
    }
}
