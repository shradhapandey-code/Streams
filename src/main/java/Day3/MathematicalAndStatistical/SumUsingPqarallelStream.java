package Day3.MathematicalAndStatistical;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class SumUsingPqarallelStream {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
  int sum  =  numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

    }
}
