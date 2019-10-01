package jenkov.functional.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSamples {

    public StreamSamples() {

        Map<String, String> map = new HashMap<>();
        map.put("hello1", "1");
        map.put("hello2", "2");
        map.put("hello3", "3");
        map.put("hello4", "4");

        Stream<String> streamMap = map.values().stream();
//        streamMap.

        List<String> list = new ArrayList<>();
        list.add("One flew over the cuckoo's nest");
        list.add("To kill a muckingbird");
        list.add("Gone with the wind");


        Stream<String> stream = list.stream();
        Stream<String> streamForMap = list.stream();

        System.out.println("flatmap--------------------------------");
        //flat - расплющить
        stream.flatMap(value -> {
            String [] strarr = value.split(" ");
            return Arrays.asList(strarr).stream();
        }).forEach(System.out::println);

        System.out.println("map--------------------------------");

        streamForMap.map(value -> {
           value = value.toLowerCase();
           return value;
        }).forEach(System.out::println);

        System.out.println("anymatch-------------------------------");
        Stream<String> anyMatchStream = list.stream();
//        boolean anyMatch = anyMatchStream.anyMatch(value -> value.startsWith("Gone"));
        boolean anyMatch2 = anyMatchStream.anyMatch(value -> value.startsWith("Bo"));
//        System.out.println("anymatch result = " + anyMatch);
        System.out.println("anymatch2 result = " + anyMatch2);


        System.out.println("collect--------------------------------");
        Stream<String> collectStream = list.stream();

        List<String> newList = collectStream.map(value->value.toLowerCase()).collect(Collectors.toList());

        Person gali = new Person("Galikhan", "Khamitov");
        Person ivanov = new Person("Ivan", "Ivanov");
        Person serj = new Person("Serj", "Perj");
        Person alish = new Person("Alisher", "Karib");

        List<Person> personList = Arrays.asList(gali, serj, ivanov, alish);
        Stream<Person> personStream = personList.stream();

        personStream.map(value -> value.name).collect(Collectors.toList()).stream().forEach(System.out::println);
//        String collectValue = personStream.map(value -> value.name).collect(Collectors.reducing());
//        System.out.println("coolect value = " + collectValue);
    }

}

class Person {


    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
