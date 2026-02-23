package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateWithItsCount {
    static void main() {
        List<String> names = Arrays.asList("Rahul", "Rohan", "Rahul", "Keshav", "Rohan");
        List<Integer> numbers = Arrays.asList(1,2,3,4,2,3,5,6,3,7,8,2);
        Map<String, Long> ans  = names
                                .stream()
                                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                                .entrySet().stream().filter(entry-> entry.getValue()>1)
                                .collect(Collectors.toMap(entry-> entry.getKey(),entry-> entry.getValue()));
            System.out.println(ans);


            Map<Integer, Long> ans2 =  numbers.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()))
                    .entrySet().stream()
                    .filter(entry-> entry.getValue()>1)
                    .collect(Collectors.toMap(entry-> entry.getKey(), entry-> entry.getValue()));

            System.out.println(ans2);




    }



}
