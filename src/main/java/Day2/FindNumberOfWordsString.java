package Day2;
import java.util.*;
import java.util.stream.Stream;
import  java.util.stream.Collectors;


public class FindNumberOfWordsString {
    static void main() {
        String input = "hello world this is a test";
    long count =  Arrays.stream(input.split(" ")).count();
    }
}
