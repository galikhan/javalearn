import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CancurrentJava {

    public static void main(String[] args) throws Exception {

        String str = "1234567";
        int len = str.length();
        String rstr = "";
        for(int i = 1; i<=str.length(); i++ ) {

            char first = str.charAt(len - i);
            rstr = rstr + first;
        }

        System.out.println(rstr);


        int a = 10;
        if(a == 10) System.out.println("hello");
        System.out.println("bye");
//
//        ExecutorService executorService = Executors.newFixedThreadPool(40);
//
//        long start2 = System.currentTimeMillis();
//        List<String> strs = new ArrayList<>();
//        for (int a = 0; a < 100; a++) {
//
//            int hour = LocalDateTime.now().getHour();
//            int minute = LocalDateTime.now().getMinute();
//            int second = LocalDateTime.now().getSecond();
//            int nano = LocalDateTime.now().getNano();
//
//            Future<String> hello = executorService.submit(() -> {
//
//                String num = "212394012";
//                String num2 = "243242";
//                long result  = 0;
//                String resultStr = "";
//                Thread.sleep(10);
//                System.out.println("tread - " + Thread.currentThread().getName());
//
////                for(int j =0; j < 100; j++) {
////                    if(j%2==0) {
////                        result = Integer.parseInt(num) * Integer.parseInt(num2);
////                    } else {
////                        resultStr = String.valueOf(result);
////                    }
////                    Thread.sleep(10);
////                    System.out.println("tread - " + Thread.currentThread().getName());
////                }
//
//                return resultStr;
//            });
//            strs.add(hello.get());
//        }
////        strs.stream().forEach(System.out::println);
//        long end2 = System.currentTimeMillis();
//        System.out.println(end2 - start2);
//
//
//        long start = System.currentTimeMillis();
//        List<String> strs2 = new ArrayList<>();
//        for (int a = 0; a < 500; a++) {
//
//            int hour = LocalDateTime.now().getHour();
//            int minute = LocalDateTime.now().getMinute();
//            int second = LocalDateTime.now().getSecond();
//            int nano = LocalDateTime.now().getNano();
//
////            String num = "212394012";
////            String num2 = "243242";
////            long result  = 0;
////            String resultStr = "";
////            for(int j =0; j < 100; j++) {
////                if(j%2==0) {
////                    result = Integer.parseInt(num) * Integer.parseInt(num2);
////                } else {
////                    resultStr = String.valueOf(result);
////                }
////                Thread.sleep(50);
////            }
//            Thread.sleep(10);
//            System.out.println("tread - " + Thread.currentThread().getName());
//
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
//        ExecutorService executorService = Executors.newFixedThreadPool(40);
//
//        long start2 = System.currentTimeMillis();
//        List<String> strs = new ArrayList<>();
//        for (int a = 0; a < 100; a++) {
//
//            int hour = LocalDateTime.now().getHour();
//            int minute = LocalDateTime.now().getMinute();
//            int second = LocalDateTime.now().getSecond();
//            int nano = LocalDateTime.now().getNano();
//
//            Future<String> hello = executorService.submit(() -> {
//
//                String num = "212394012";
//                String num2 = "243242";
//                long result  = 0;
//                String resultStr = "";
//                Thread.sleep(10);
//                System.out.println("tread - " + Thread.currentThread().getName());
//
////                for(int j =0; j < 100; j++) {
////                    if(j%2==0) {
////                        result = Integer.parseInt(num) * Integer.parseInt(num2);
////                    } else {
////                        resultStr = String.valueOf(result);
////                    }
////                    Thread.sleep(10);
////                    System.out.println("tread - " + Thread.currentThread().getName());
////                }
//
//                return resultStr;
//            });
//            strs.add(hello.get());
//        }
////        strs.stream().forEach(System.out::println);
//        long end2 = System.currentTimeMillis();
//        System.out.println(end2 - start2);
//
//
//        long start = System.currentTimeMillis();
//        List<String> strs2 = new ArrayList<>();
//        for (int a = 0; a < 500; a++) {
//
//            int hour = LocalDateTime.now().getHour();
//            int minute = LocalDateTime.now().getMinute();
//            int second = LocalDateTime.now().getSecond();
//            int nano = LocalDateTime.now().getNano();
//
////            String num = "212394012";
////            String num2 = "243242";
////            long result  = 0;
////            String resultStr = "";
////            for(int j =0; j < 100; j++) {
////                if(j%2==0) {
////                    result = Integer.parseInt(num) * Integer.parseInt(num2);
////                } else {
////                    resultStr = String.valueOf(result);
////                }
////                Thread.sleep(50);
////            }
//            Thread.sleep(10);
//            System.out.println("tread - " + Thread.currentThread().getName());
//
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

    }


}
