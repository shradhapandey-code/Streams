package Day1;

import java.util.Arrays;
import java.util.List;

public class NumberMultipleof5and3 {
    static void main() {
        List<Integer> listOfIntegers = Arrays.asList(445,23,555,4,5,6,7,7788,265,875);
       List<Integer> ans = listOfIntegers.stream().filter(num-> (num % 5==0 && num % 3 ==0)).toList();
       System.out.println(ans);

    }
}
