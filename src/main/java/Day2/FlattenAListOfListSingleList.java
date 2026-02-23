package Day2;

import java.util.List;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class FlattenAListOfListSingleList {
    static void main() {
        List<List<Integer>> listOfLists = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
   List<Integer> ans =listOfLists.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(ans);
    }
}
