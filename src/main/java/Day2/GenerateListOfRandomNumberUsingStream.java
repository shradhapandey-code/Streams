package Day2;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class GenerateListOfRandomNumberUsingStream {
    static void main() {
//        List<Double> randomNumber =  Stream.generate(Math::random)
//                .limit(10)
//                .collect(Collectors.toList());
//        System.out.println(randomNumber);

        List<Integer> randomNumber = Stream.generate(()-> new Random().nextInt(100))
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(randomNumber);
    }
}
