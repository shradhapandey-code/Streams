package Day2;

import java.util.List;

public class FlattenListCheckSumOfAllEvenNumber {
    static  void main() {
        List<List<Integer>> list1 = List.of(
                List.of(1,2,3) ,
                List.of(4,5,6) ,
                List.of(7,8,9)
        );
        int ans =  list1.stream().flatMap(List::stream).filter(n-> n%2==0).mapToInt(Integer::intValue).sum();
        System.out.println(ans);


    }
}
