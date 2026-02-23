package Day1;
import java.util.*;
import java.util.stream.*;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        Character c1 = input.chars().mapToObj(c -> (char) c).filter(i -> input.indexOf(i) == input.lastIndexOf(i)).findFirst().get();
        System.out.println(c1);

    }
}