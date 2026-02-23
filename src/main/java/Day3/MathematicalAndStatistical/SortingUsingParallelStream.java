package Day3.MathematicalAndStatistical;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class SortingUsingParallelStream {
    static void main() {
        List<Integer> numbers = List.of(5, 3, 1, 4, 2);
      List<Integer> ans =  numbers.parallelStream().sorted().toList();
        System.out.println(ans);

    }
}
