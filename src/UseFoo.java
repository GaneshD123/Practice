import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class UseFoo {
    public String add(String string, Foo foo) {
        return foo.method(string);
    }
    public String add(Integer number, Function<Integer, String> fn) {
        return fn.apply(number);
    }

    public static void main(String[] args) {
        List<String> names=Arrays.asList("John", "Freddy", "Samuel");
        names.forEach(name -> System.out.println("Hello, " + name));




        Supplier<Double> number=()->Math.random();
        Supplier<Double> randomValue = () -> Math.random();

        System.out.println(number.get());


        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 40000);
        salaries.put("Freddy", 30000);
        salaries.put("Samuel", 50000);
        salaries.replaceAll((name, oldValue) ->
                name.equals("Freddy") ? oldValue : oldValue + 10000);
        UseFoo useFoo=new UseFoo();
        Foo foo = parameter -> parameter.toUpperCase() + " from lambda";
        String result = useFoo.add("Message ", foo);
        System.out.println("Hi="+result);

        Function<Integer,String> function=(parameter -> String.valueOf(parameter*12));


        List<Person> listPersons = new ArrayList<>();

        listPersons.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, 26));
        listPersons.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32));
/*
        listPersons.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, 23));
        listPersons.add(new Person("David", "Green", "david@gmail.com", Gender.MALE, 39));
        listPersons.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26));
        listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, 33));
        listPersons.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27));
        listPersons.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, 30));
        listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, 22));
        listPersons.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, 24));
*/


        listPersons.stream().filter(person -> person.getAge()>25).forEach(System.out::println);
        listPersons.parallelStream().filter(person -> person.getAge()>25).forEach(System.out::println);

        String result1 = useFoo.add(12, function);
        System.out.println("Hi="+result1);
        Optional<String> optional = Optional.empty();

    }
}
