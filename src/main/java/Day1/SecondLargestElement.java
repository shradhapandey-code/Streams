package Day1;
import java.util.*;
import java.util.stream.Stream;

public class SecondLargestElement {
    static void main() {
        List<Integer> listOfIntegers = Arrays.asList(32,3,2323,23,23,23,234,24,234,324,232,3121,21,3213,123);
    var  ans  =   listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    System.out.println(ans);


    }
}
