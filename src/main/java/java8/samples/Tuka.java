package java8.samples;

@FunctionalInterface
public interface Tuka<T, R> {

    R hello(T t);
}
