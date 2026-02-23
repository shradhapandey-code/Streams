package Day3;

public class ExtractAllDigitFromStringSumThem {
    static void main() {
        String input = "hello 123 world 456";
       int sum =   input.chars()
                 .filter(c-> Character.isDigit(c))
                 .map(c-> Character.getNumericValue(c))
                 .sum();
        System.out.println(sum);
    }
}
