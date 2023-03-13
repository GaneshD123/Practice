import java.lang.constant.Constable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsumerPractice {
    public static void main(String[] args) {
        //Write programe where you accept list as parameter then modify list using multiply by 2 then print the modified list
        //using consumer

        List<String> names = Arrays.asList("John", "Freddy", "Samuel");
        Consumer<List<String>>  printName= name->System.out.println(name);
        printName.accept(names);

        List<Integer> list = Arrays.asList(2,1,3);

        Consumer<List<Integer>> modifyList=listOne->listOne.stream().forEach(a->System.out.println(a*2));
        modifyList.accept(list);

        list.stream().forEach(number->System.out.println(number*3));
        //create consumer who can take
        List<Integer> values = Arrays.asList(3, 5, 8, 9, 12);
        int sum = values.stream() .reduce(0, (i1, i2) -> i1 + i2);


    }

}
