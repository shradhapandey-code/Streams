package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class FlattenlIstCheckSumOfAllOdd {
    static void main() {
        List<List<Integer>> lisofList = List.of(
                List.of(1,2,3),
                List.of(4,5,6),
                List.of(7,8,9),
                List.of(10,11,12,13)
        );
    int sum  =   lisofList.stream().flatMap(List::stream).filter(n->n%2!=0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }

}
