import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class Demo1 {

    public static void main(String[] args) {
        // find input 100 primenumbers
      //  IntStream.range(1,100).filter(number->number%2==0).forEach(System.out::println);

        //String a="mainismain"
        //output= s //non repeating character.

        String input="zmainismain";
    Map<Character,Integer> charFrequency=new LinkedHashMap<>();

    for(char c:input.toCharArray()){
        charFrequency.put(c,charFrequency.getOrDefault(c,0)+1);
    }
    System.out.println(charFrequency.toString());

        Optional<Character> firstchar = input.chars().mapToObj(c -> (char) c).filter(c -> charFrequency.get(c) == 1).findFirst();
        System.out.println("First Non repeated character: "+firstchar.get());

//

    }
}
