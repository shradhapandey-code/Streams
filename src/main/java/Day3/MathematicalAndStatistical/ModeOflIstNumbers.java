package Day3.MathematicalAndStatistical;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class ModeOflIstNumbers {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 4);
      int mode =  numbers.stream()
                .collect(Collectors.groupingBy(i->i,Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(0);
        System.out.println(mode);

    }
}
