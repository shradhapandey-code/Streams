package Day3.MathematicalAndStatistical;
import java.util.*;
import java.util.stream.IntStream;

public class SumOfAllIndexedOdd {

    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      int sum =  IntStream.range(0,numbers.size())
              .filter(i->i%2!=0)
              .map(numbers::get)
              .sum();
        System.out.println(sum);
    }

}
