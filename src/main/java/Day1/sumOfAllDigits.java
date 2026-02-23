package Day1;


public class sumOfAllDigits {
    public static void main(String args[]){
        int  number = 12345678;
          int sum = String.valueOf(number).chars().map(c-> c-'0').sum();
          System.out.println(sum);

          int sum2 = String.valueOf(number).chars().map(c-> c-'0').reduce(0,(a,b)-> a+b);
          System.out.println(sum2);


    }
}
