package Day1;

import java.util.stream.Collectors;
import java.util.*;

public class FrequencyOfChars {
    public static void main(String args[]) {

        String input = "java is a awesome programming language";
        Map<Character,Long> res = input.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(x->x, Collectors.counting()));
        System.out.println(res);

        Map<Character, Long>  res2 = input.chars().mapToObj(c-> (char) c).filter(c->c != ' ').collect(Collectors.groupingBy(x->x, Collectors.counting()));
        System.out.println(res2);

    }

}
