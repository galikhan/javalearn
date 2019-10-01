package jenkov.functional.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HigherOrderFunctionSamples {


    public HigherOrderFunctionSamples() {
        sort();
    }

    public void sort() {
        List<String> list = new ArrayList<>();
        list.add("aaron");
        list.add("ccron");
        list.add("bbron");

        Collections.sort(list, (String a, String b) -> {
            return a.compareTo(b);
        });

        list.stream().forEach(System.out::println);
    }
}
