package Day2;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.*;

public class FibonacciSequenceUsingStream {
    static void main() {
Stream.iterate(new int[]{0,1},fib-> new int[]{fib[1],fib[0]+fib[1]})
        .limit(10)
        .map(fib->fib[0])
        .forEach(System.out::println);
    }
}
