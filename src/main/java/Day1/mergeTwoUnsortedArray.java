package Day1;


import java.util.Arrays;
import java.util.stream.IntStream;

public class mergeTwoUnsortedArray {
    public static void main(String[] args) {
        int[] a = new int[] {6,0,4,5};
        int[] b = new int[] {1,0,9,3};
      int [] ans= IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
      System.out.println(ans.toString());

    }
}
