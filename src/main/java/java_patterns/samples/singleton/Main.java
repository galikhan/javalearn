package java_patterns.samples.singleton;

import java_patterns.samples.singleton.TestSingleton;
import java_patterns.samples.singleton.TestStaticBlockSingleton;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Runtime.getRuntime();

        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().forEach(value -> {

            Thread thread = new Thread(() -> {
                TestSingleton.getInstance();
                TestStaticBlockSingleton.getInstance();
                TestSingleton.getInstance();
            });
            thread.start();
        });
    }
}
