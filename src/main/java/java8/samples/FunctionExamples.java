package java8.samples;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionExamples {


    public static void main(String [] args) {

        //This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

        Function<Ctx, Long> f1 = (val) -> {

            String value = val.getName();
            System.out.println("My name is " + value);
            System.out.println("end");
            return 1l;
        };

//        myfunct(f1);

        Consumer<Integer> consumer = (ctx) -> {
            System.out.println(ctx /10*999);
        };

        f1.apply(new Ctx("d"));

        System.out.println("hello world");
//        System.out.println();
        consumer.andThen(r -> {
            r = r - 91;
            System.out.println(r);
        }).accept(100);

        new Ctx("gali");

    }
    public static void myfunct(Function<Ctx, Long> func){

    }

//    public String func(Function<, R> f) {
//        System.out.println("start func");
//
//        f.apply(T);
//
//        System.out.println("end func");
//        return "";
//    }

    //
}
class Ctx {

    public String getName() {
        return "Galikhan";
    }

    public Ctx(String val) {
        String globalValue = meth((v) -> {
            return v = v + " - " + v + " - " + v ;
        }, val);

        System.out.println(globalValue);
    }

    public String meth(Function<String, String> fmeth, String value) {
        return fmeth.apply(value);
    }
}
