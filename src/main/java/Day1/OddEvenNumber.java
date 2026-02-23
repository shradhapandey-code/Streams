package Day1;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.*;

public class OddEvenNumber {
    public static void main(String args[]){
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,99);
     Map<Boolean,List<Integer>> result =  numbers.stream().collect(Collectors.partitioningBy(i-> i%2==0));
     System.out.println(result);
     List<Integer> even = result.get(true);
     List<Integer> odd  = result.get(false);

     System.out.println(even);
     System.out.println(odd);



     ///  Using the filter
        List<Integer> collect = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        List<Integer> collect2 =numbers.stream().filter(i-> i % 2==0).collect(Collectors.toList());


        System.out.println(collect);
        System.out.println(collect2);



        // using the grouping by
      Map<String , List<Integer>>  res =    numbers.stream().collect(Collectors.groupingBy(n-> n % 2 ==0 ?"even":"odd"));
      var ans =  numbers.stream()
              .collect(Collectors.groupingBy(n-> {
                int lowerBound = n-n%10;
                int upperBound = lowerBound + 9;
                return lowerBound+"-"+upperBound;
        }));
        System.out.println(ans);
      // 1,6,15,37,56 33, 89
//        0-9: 1,6
//                10-19 - 15
//                        30-39 - 37,33
      System.out.println(res);




    }

}
