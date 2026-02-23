package Day1;

import java.util.stream.IntStream;

public class FactorialOfNumber {
    public static void main(String args[]){
        int number = 25;
         long factorial =IntStream.rangeClosed(1,number).reduce(1,(a,b)->a*b);
         System.out.println(factorial);

    }

}
