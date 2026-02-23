package Day1;
import java.util.*;

public class KthSmallest {
    static void main() {
        List<Integer>  numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int k =3;

   Integer  ans = numbers.stream().sorted().skip(k-1).findFirst().get();
   System.out.println(ans);
    }
}
