package Day1;
import java.util.Arrays;
import java.util.OptionalDouble;
import  java.util.stream.Stream;


public class SumAndAverage {
    static void main() {
        int[] a = new int[]{12, 32, 3, 23, 34, 123, 23, 4324, 3, 4, 3, 4, 3, 5443, 534, 5, 34, 52, 4, 34, 234, 325, 353};
        int sum = Arrays.stream(a).sum();
        OptionalDouble average = Arrays.stream(a).average();
        double ans = average.getAsDouble();
        System.out.println(ans);
        System.out.println(sum);
    }
}