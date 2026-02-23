package Day1;

import java.util.Arrays;
import java.util.List;


public class StringStartsWithNumber {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "6ix","45ro,'7ko");
          List<String> ans=         listOfStrings.stream().filter(str->Character.isDigit(str.charAt(0))).toList();
          System.out.println(ans);

    }
}
