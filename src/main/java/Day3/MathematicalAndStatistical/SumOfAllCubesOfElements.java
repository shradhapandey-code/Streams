package Day3.MathematicalAndStatistical;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class SumOfAllCubesOfElements {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
   int sum = numbers.stream().mapToInt(n-> n*n*n).sum();
        System.out.println(sum);
    }
}
