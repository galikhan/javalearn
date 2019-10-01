package java8.samples;

/**
 * Created by gali on 11/20/17.
 */
@FunctionalInterface
public interface FISample {

    void toLowerCase(String v);

    default String toUpperCase(String value) {
        return value.toUpperCase();
    }
}
