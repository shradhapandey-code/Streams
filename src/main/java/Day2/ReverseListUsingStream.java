package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class ReverseListUsingStream {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    List<Integer> reversed=  numbers.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(),list->{
                 Collections.reverse(list);
                 return list;
                }));
        System.out.println(reversed);

    }
}
