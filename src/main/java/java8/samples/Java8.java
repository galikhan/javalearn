package java8.samples;

import java.sql.Time;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class Java8 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        System.out.println("base - " + Thread.currentThread().getId());
//        Supplier<String> supplier = value -> {
//            return value;
//        };

//
//        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
//
//            try {
////                System.out.println("inner - " +Thread.currentThread().getId());
//                TimeUnit.SECONDS.sleep(4);
////                Thread.sleep(123000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            return "hello world of completable future";
//
//        });
//
//
//
//
//
//
//        FISample fiSample = value -> {
////            System.out.println(value.toLowerCase());
//        };
//
//        fiSample.toLowerCase("GALIKHAN KMAITIOV");
//        String uuper = fiSample.toUpperCase("hello");
////        System.out.println(uuper);
//
////        CompletableFuture<String> completableResult = completableFuture.thenApply(name->{
////            System.out.println("base continue - " + Thread.currentThread().getId());
////            return "Gali  " + name;
////        });
//        CompletableFuture<String> tukaCompletedFuture = new CompletableFuture<>();
//        tukaCompletedFuture.handleAsync((v1, v2) -> {
//            System.out.println("v1, v2 " +  v1  + " - " + v2);
//            try {
//                Thread.sleep(4000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "iam result";
//        });
//
////        tukaCompletedFuture.thenApply(value-> {
////            System.out.println("then");
////            return value;
////        });
//
//
//        System.out.println("before return of result");
//
////        tukaCompletedFuture.get();
//        tukaCompletedFuture.whenComplete((v1, v2) -> {
//            System.out.println("completed");
//        });
////        tukaCompletedFuture.get();
//
//        Tuka<String, String> f = (in) -> {
//            return "hello, " + in;
//        };
//
//        String res = f.hello("Tuka");
//        System.out.println(res);
//            new OptionalSamples();
            new BenefitOfLambda();
    }
}
