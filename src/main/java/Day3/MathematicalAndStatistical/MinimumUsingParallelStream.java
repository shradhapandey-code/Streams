package Day3.MathematicalAndStatistical;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;



public class MinimumUsingParallelStream {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
    int min =   numbers.parallelStream()
                .min(Integer::compare)
                .orElse(0);
        System.out.println(min);

    }
}
