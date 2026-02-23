package Day2;

import java.util.List;

public class DifferenceBetweenTwoLIst {
    static void main() {
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(3, 4, 5, 6);
     List<Integer>  ans = list1.stream().filter(n-> !list2.contains(n)).toList();
        System.out.println(ans);
    }
}
