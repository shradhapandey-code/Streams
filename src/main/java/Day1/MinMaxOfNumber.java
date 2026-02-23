package Day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxOfNumber {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(89,212,11,10,21,12,34,90);
     Optional<Integer> ans1= listOfIntegers.stream().max(Comparator.reverseOrder());
     Optional<Integer> ans2 = listOfIntegers.stream().max(Comparator.naturalOrder());
     System.out.println(ans1.get());
     System.out.println(ans2.get());


    }

}
