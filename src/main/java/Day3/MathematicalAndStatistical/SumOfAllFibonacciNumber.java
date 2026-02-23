package Day3.MathematicalAndStatistical;

import java.util.List;

public class SumOfAllFibonacciNumber {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sum =    numbers.stream().filter(n->{
            int a=0, b=1;
            while (b<n){
                int temp =b;
                b=a+b;
                a=temp;
            }
            return b==n;
        }).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

}
