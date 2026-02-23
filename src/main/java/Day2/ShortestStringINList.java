package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class ShortestStringINList {
    public static void main(String args[]){
        List<String> words = List.of("apple", "banana", "kiwi");
      List<String> ans = words.stream().sorted(Comparator.comparingInt(String::length)).toList();
      System.out.println(ans);

    }
}
