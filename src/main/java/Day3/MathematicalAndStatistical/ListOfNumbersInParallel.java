package Day3.MathematicalAndStatistical;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class ListOfNumbersInParallel {
    static void main() {
     List<Integer> numbers = IntStream.rangeClosed(1,1000000)
                                      .boxed() .toList() ;
     long sum = numbers.parallelStream()
             .mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
