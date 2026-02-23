package Day1;
import java.util.*;
import java.util.stream.Stream;

public class KthLargest {
    static void main() {
      List<Integer> list =  Arrays.asList(4,5,6,7,8,9,2,3,1);
      List<String> list2 = Arrays.asList("shra","bob", "name","paris","shivangi","anitapandey");
      // 9,8,7,6,5,4,3,2,1
      int k=4;
 Integer largest=  list.stream().sorted(Comparator.reverseOrder()).skip(k-1).findFirst().get();

 System.out.println(largest);


 int k1 =4;
 String ans = list2.stream().sorted(Comparator.reverseOrder()).skip(k-1).findFirst().get();
 System.out.println(ans);



    }
}
