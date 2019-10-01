package java8.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BenefitOfLambda {

    public BenefitOfLambda() {

        List<Integer> list = Arrays.asList(1, 2, -3, 4, 5, 6, -7);
        Stream<Integer> stream = list.stream();
//        stream.filter(this::isEven).forEach(System.out::println);

        //new style streams
        stream.forEach(System.out::println);

        //old style streams
        for(int i = 0; i < list.size(); i++ ) {
            System.out.println("item : " + list.get(i));
        }

        for(int i = 0; i < list.size(); i++ ) {
            if(isEven(i)) {
//                System.out.println("even : " +i);
            }
        }

        for(int i = 0; i < list.size(); i++ ) {
            if(isOdd(i)) {
//                System.out.println("odd : " + i);
            }
        }



         //#Lambda with predicates
        System.out.println("--odds--");
        Predicate<Integer> odds = value -> value % 2 != 0;
        List<Integer> oddList = manipulateStream(list, odds);
        oddList.stream().forEach(System.out::println);

        System.out.println("--gthan4--");
        Predicate<Integer> gThan4 = value -> value > 4;
        List<Integer> gthan4List = manipulateStream(list, gThan4);
        gthan4List.stream().forEach(System.out::println);

        System.out.println("--le4--");
        Predicate<Integer> le4 = value -> value <= 4;
        List<Integer> le4List = manipulateStream(list, le4);
        le4List.stream().forEach(System.out::println);


    }

    public List<Integer> manipulateStream(List<Integer> list, Predicate<Integer> t) {

        List<Integer> newList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            if(t.test(list.get(i))) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }


    public boolean isEven(int value) {

        if(value%2 == 0) {
            return true;
        }
        return false;

    }

    public boolean isOdd(int value) {

        if(value%2!=0) {
            return true;
        }
        return false;

    }



    public int increaseToTen(int value) {
        return value * 10;
    }

}
