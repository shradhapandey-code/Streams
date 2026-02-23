package Day3.MathematicalAndStatistical;
import java.util.List;
import java.util.stream.IntStream;
public class SumOfAllPrimeNumbers
{
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sumOfPrimes = numbers.stream()
                .filter(n -> n > 1 &&
                        IntStream.rangeClosed(2, (int) Math.sqrt(n))
                                .noneMatch(i -> n % i == 0))
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of prime numbers: " + sumOfPrimes);

    }
}
