package Day1;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateCharactersFromString {
    public static void main(String args[]) {

        String inputString = "java is a awesome programming language";

        Set<Character> seen = new HashSet<>();

        Set<Character> ans = inputString.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> ch != ' ')          // optional: ignore spaces
                .filter(ch -> !seen.add(ch))      // duplicates
                .collect(Collectors.toSet());

        System.out.println(ans);
    }
}
