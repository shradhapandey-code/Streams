package Day1;

public class ReverseOfString {
    static void main() {
        String s = "Shradha";
        String reduce = s.chars()
                .mapToObj(c -> (char) c)
                .map(c -> String.valueOf(c))
                .reduce("", (a, b) -> b + a);

        System.out.println(reduce);
    }
}
