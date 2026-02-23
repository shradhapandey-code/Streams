package Day3.MathematicalAndStatistical;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class MedianOfListNumbers {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        double median = numbers.stream()
                .sorted()
                .skip((numbers.size()-1)/2)
                .limit(2-numbers.size() % 2)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println(median);

    }
}
