package Day1;
import java.util.stream.Collectors;
import java.util.*;

public class LastElementoflIst {
    public static void main(String args[]){
        List<String> list = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten");

System.out.println(list.stream().skip(list.size()-1).findFirst().get());

    }


}
