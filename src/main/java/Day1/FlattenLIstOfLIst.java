package Day1;

import java.util.Arrays;
import java.util.*;

public class FlattenLIstOfLIst {
    static void main() {
        List<List<Integer>> list= Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(7,8,9));
    List<Integer> ans =     list.stream().flatMap(li->li.stream()).toList();
    System.out.println(ans);
    }
}
