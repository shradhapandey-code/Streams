package Day1;
import java.util.*;
import java.util.stream.Collectors;

public class SortingList {
    public static void main(String args[]){
        List<Integer>  number = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<String> str = Arrays.asList("shradha","shubham","delhi","farrukhabad");
          List<Integer> ans = number.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
          System.out.println(ans);

   List<String> ans2= str. stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
   System.out.println(ans2);


        List<String> ans3 = str.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(ans3);


    }

}

