import java8.samples.FISample;
import java8.samples.Java8Samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {

        double i = 12345678123456.0;
        double iii = 12345678123456.0;

//        System.out.println("result = " + (i+iii));
//        System.out.println("i  = " + (double)(i));

        double summary =
                Double.parseDouble("0,123".replace(",", "."))
                + Double.parseDouble("0,1312".replace(",", "."));

//        System.out.println("i  = " + String.format("%1$.2f", summary));

//        System.out.println("random : "+ UUID.randomUUID().toString());

//        System.out.println("СА10".equals("CA10"));
//        System.out.println("random : "+ UUID.fromString("user-email-adress-is-galikhan.khamitov@gmail.com"));
//        System.out.println("random : "+ UUID.randomUUID());
//        System.out.println("random : "+ UUID.randomUUID());
//        System.out.println("simple : "+ UUID.fromString("12345"));

        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(3);
        list.add(5);
        list.add(1);

        Collections.sort(list, (Integer i1, Integer i2) -> {
            if(i1 < i2) {
                return -1;
            } else if(i1 > i2) {
                return 1;
            } else {
                return 0;
            }
        });
//        list.stream()
//                .filter(i -> i % 2 == 1)
//                .filter(integer -> integer > 3)
//                .forEach(System.out::println);


        Java8Samples java8Samples = new Java8Samples();
//        java8Samples.formatText(FISample.);
        java8Samples.doSomeMath();

        String [] names = {"ali", "hali", "xali"};

        String fname = Arrays.stream(names)
                            .filter(str -> str.length() == 4)
                            .collect(Collectors.joining(","));
//        System.out.println(fname);

//        Arrays.stream(names).forEach(System.out::println);


        List<Integer> integers = new ArrayList<>();
        for(int a = 0; a< 1000; a++) {
            integers.add(a);
        }

        long start = new Date().getTime();
        integers.parallelStream().forEach(val -> {
//            System.out.print(val);
//            System.out.print(",");

            long a = (long) (val * 400 * Math.random());
            String aa = String.valueOf(a);
            char [] arr = aa.toCharArray();

            long b = (long) (val * 400 * Math.random());
            String bb = String.valueOf(b);
            char [] arrb = bb.toCharArray();
            long c = (long) (val * 400 * Math.random());
            String cc = String.valueOf(c);
            char [] arrc = cc.toCharArray();

            long d = (long) (val * 400 * Math.random());
            String dd = String.valueOf(d);
            char [] arrd= dd.toCharArray();

        });
        long end = new Date().getTime();
//        System.out.println("-time-");
//        System.out.println("se " + (end - start));


        long start1 = new Date().getTime();
        integers.stream().forEach(val -> {
//            System.out.print(val);
//            System.out.print(",");

            long a = (long) (val * 400 * Math.random());
            String aa = String.valueOf(a);
            char [] arr = aa.toCharArray();

            long b = (long) (val * 400 * Math.random());
            String bb = String.valueOf(b);
            char [] arrb = bb.toCharArray();
            long c = (long) (val * 400 * Math.random());
            String cc = String.valueOf(c);
            char [] arrc = cc.toCharArray();

            long d = (long) (val * 400 * Math.random());
            String dd = String.valueOf(d);
            char [] arrd= dd.toCharArray();
        });
        long end1 = new Date().getTime();
//        System.out.println("-time-");
//        System.out.println("se " + (end1 - start1));
        String a = "a";
        a.toUpperCase();


        List<Employee> emp = new ArrayList<>();
        for(int aa = 0; aa<199000; aa++) {
            int val = (int)(1500 * Math.random());
            emp.add(new Employee(String.valueOf(val)));
        }

        long seq = System.currentTimeMillis();
        emp.stream().map(v -> Integer.parseInt(v.salary)).forEach(System.out::print);
        long seqEnd = System.currentTimeMillis();
        System.out.println("---");
        System.out.println("seq :" +(seqEnd -seq));


        System.out.println("parallel");
        long parall = System.currentTimeMillis();
        emp.parallelStream().map(v -> Integer.parseInt(v.salary)).forEach(System.out::print);
        long parallEnd = System.currentTimeMillis();
        System.out.println("---");
        System.out.println("parallel : " + (parallEnd -parall));


        System.out.println("simple");
        long simple = System.currentTimeMillis();
        for(int b = 0; b < emp.size(); b++) {
            System.out.print(Integer.parseInt(emp.get(b).salary));
        }
        long simpleEnd = System.currentTimeMillis();
        System.out.println("");
        System.out.println("simple : " + (simpleEnd -simple));

    }


}

class Employee {
    public String salary;
    public Employee(String salary) {
        this.salary = salary;
    }
}
