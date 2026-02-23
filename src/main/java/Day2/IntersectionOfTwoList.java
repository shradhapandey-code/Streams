package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class IntersectionOfTwoList {
    public static void main(String args[]) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = List.of(4, 5, 6, 7, 8, 9);
        List<Integer> ans = list1.stream().filter(list2::contains).toList();
        System.out.println(ans);
    }
}