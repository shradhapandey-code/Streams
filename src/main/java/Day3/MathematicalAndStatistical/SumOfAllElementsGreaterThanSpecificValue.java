package Day3.MathematicalAndStatistical;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class SumOfAllElementsGreaterThanSpecificValue {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int threshold = 5;
        int sum = numbers.stream()
                .filter(n-> n> threshold)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

    }
}
