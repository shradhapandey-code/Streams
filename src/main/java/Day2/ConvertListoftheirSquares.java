package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class ConvertListoftheirSquares {
    static  void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
     System.out.println(numbers.stream().map(n-> n*n).collect(Collectors.toList()));
    var ans =  numbers.stream().reduce((a,b)->b).get();
    System.out.println(ans);


    }
}
