package Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramString {
//    public static boolean anagram(String s1, String s2){
//         s1 = Stream.of(s1.split("")).map(val-> val.toLowerCase()).sorted().collect(Collectors.joining());
//         s2 = Stream.of(s2.split("")).map(val-> val.toLowerCase()).sorted().collect(Collectors.joining());
//         return s1.equals(s2);
//    }
//
//    public static void main(String[] args) {
//        String s1 = "saurav";
//        String s2 = "vauras";
//        System.out.println(anagram(s1,s2));
//
//
//    }
static void main() {
    List<String> words = List.of("listen","silent","enlist","google","inlets");
    String target = "silent";
    List<String> anagrams =  words.stream().filter(word-> Arrays.equals(
            word.chars().sorted().toArray(),
            target.chars().sorted().toArray()
    )).collect(Collectors.toList());
    System.out.println(anagrams);

}

}