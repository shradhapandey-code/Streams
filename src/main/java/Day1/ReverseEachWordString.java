package Day1;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordString {
    public static void main(String[] args) {
        String str = "java is a awesome programming language";
        var ans = Stream.of(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(ans);
    }}

