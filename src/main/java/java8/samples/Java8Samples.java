package java8.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.LongToIntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by gali on 11/20/17.
 */
public class Java8Samples implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        if(i1 < i2) {
            return -1;
        } else if(i1 > i2) {
            return 1;
        } else {
            return 0;
        }
    }


    public String formatText(FISample sample) {
        String s = "HELLO";
        sample.toLowerCase(s);
        return s;
    }

    public void doSomeMath() {

//        MathOperation add = (a, b) -> a + b;
//        MathOperation subtruct = (a, b) -> a - b;
//        MathOperation multiply = (a, b) -> a * b;
//        MathOperation divide = (a, b) -> a / b;
//
//        System.out.println("10+5=" + operate(10, 5, add));
//        System.out.println("10-5=" + operate(10, 5, subtruct));
//        System.out.println("10*5=" + operate(10, 5, multiply));
//        System.out.println("10/5=" + operate(10, 5, divide));

//        MathOperation output = (String value) -> System.out.println(value);
        MathOperation output = this::outtutter;
        MathOperation c = System.out::println;

//        output("Gali", c);

        String [] names = {"Bali", "ALI", "Dali", "Li"};
//        List<String> names = new ArrayList<>();
//        names.add("Bali");
//        names.add("ali");
//        names.add("li");
//        names.add("Dali");
//        names.stream()
//                .forEach(System.out::println);

//        Arrays.stream(names).forEach(System.out::println);

//        Arrays.sort(names, String::compareToIgnoreCase);
//        System.out.println("------------------------");
//        Arrays.stream(names).forEach(System.out::println);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        eval(list, n->false);

        MyPredicate<Integer> myPr = (Integer n) -> {
            if(n % 2 == 0) {
                return true;
            } else {
                return false;
            }
        };
//        eval(list, myPr);
        BiConsumer<Integer, Integer> bi = (i, b) -> System.out.println(i+b);
        bi.accept(3,4);

        Function<Integer, String> hello = (i) -> String.valueOf(i*10);
        System.out.println(hello.apply(2));

        LongToIntFunction lti = b-> Integer.parseInt(String.valueOf(b));


        int i = lti.applyAsInt(1l);
        System.out.println(i);

    }


    public void eval(List<Integer> list , MyPredicate<Integer> predicate) {
        System.out.println("---");
        for(Integer i : list) {
            if(predicate.test(i)) {
                System.out.println(i);
//                System.out.print(",");
            }
        }
        System.out.println("---");
        List<String> listS = Arrays.asList("1", "1", "1","1");

//        listS.stream().forEach(System.out::println);
//
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers
                .stream()
                .distinct()
//                .forEach(System.out::println);
//                .forEach(i -> System.out.print(i*i));
                .collect(Collectors.toList());

//        squaresList.stream().forEach(System.out::println);
    }


    public void outtutter(String value) {
        System.out.println("value " + value);
    }

    public int operate(int a, int b, MathOperation operation) {
//        return operation.operation(a, b);
        return 0;
    }

    public void output(String value, MathOperation mathOperation) {
        mathOperation.output(value);
    }

    public interface MyPredicate<T>{
        boolean test(T t);
    }

    public interface MathOperation {
//        int operation(int a, int b);
        void output(String value);
    }
}
