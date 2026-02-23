package Day1;

import java.util.Arrays;
import java.util.*;

public class ThreeMaximumAndThreeMinimum {
    static void main() {
        List<Integer> listOfIntegers = Arrays.asList(23,231,23,122,34,2,44,3435,1232,434,234,2,24234,232,2423423);
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(i->System.out.println(i));
        listOfIntegers.stream().sorted(Comparator.naturalOrder()).distinct().limit(3).forEach(i->System.out.println(i));


    }
}
