package Day1;

import java.util.Optional;

public class AvoidNullPointerException {
    public static void main(String[] args) {
        Optional<String> optional=Optional.ofNullable("saurav");
        System.out.println(optional.orElse("default value"));
    }
}
