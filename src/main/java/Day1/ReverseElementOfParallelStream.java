package Day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream.*;

public class ReverseElementOfParallelStream {
    static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,1,12,13,14,15,16,17,18,19,20);
     List<Integer> ans =   list.parallelStream().collect(Collectors.toList());
     Collections.reverse(ans);
     System.out.println(ans);

    }

}
