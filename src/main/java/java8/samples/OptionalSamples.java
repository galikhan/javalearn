package java8.samples;



import java.util.Optional;
import java.util.function.Consumer;

public class OptionalSamples {

    public OptionalSamples() {

        String valueMain = getOptString().orElse("bye");
        System.out.println("valueMain : " + valueMain);

        if(getOptString().isPresent()) {
            System.out.println("is present and it is : " + getOptString().get());
            Consumer<String> consumer = value -> {
                System.out.println(value.toLowerCase());
            };

            getOptString().ifPresent(value -> {
                System.out.println(value.toUpperCase());
            });

            if(getOptString().isPresent()) {
                consumer.accept(getOptString().get());
            }

        } else {
            System.out.println("null");
        }


    }

    public Optional<String> getOptString() {
//        String hello = "hello";
        String hello = null;
        return Optional.ofNullable(hello);
    }
}
