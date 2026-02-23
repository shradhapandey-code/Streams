package Day1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortListOfString {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("java","Bengaluru","Mumbai","Delhi","Kolkata","Chennai");
     List<String > ans   = listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(ans);
    }

}
