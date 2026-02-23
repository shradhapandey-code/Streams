package Day3.MathematicalAndStatistical;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;
public class MaximumElementsUsingParallelStream {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
      int max =   numbers.parallelStream()
                  .max(Integer::compare)
                  .orElse(0);
        System.out.println(max);
    }
}
