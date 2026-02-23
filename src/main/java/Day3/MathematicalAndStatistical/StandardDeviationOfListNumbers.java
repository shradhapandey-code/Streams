package Day3.MathematicalAndStatistical;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class StandardDeviationOfListNumbers {
    static void main() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
            double mean = numbers.stream()
                    .mapToDouble(Double::doubleValue)
                    .average().orElse(0);
            double variance = numbers.stream()
                    .mapToDouble(n-> Math.pow(n-mean,2))
                    .average().orElse(0);
        double stdDev = Math.sqrt(variance);
        System.out.println(stdDev);
    }
}
