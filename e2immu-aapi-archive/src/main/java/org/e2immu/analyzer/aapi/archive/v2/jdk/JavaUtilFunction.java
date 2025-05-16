package org.e2immu.analyzer.aapi.archive.v2.jdk;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class JavaUtilFunction {
    public static final String PACKAGE_NAME = "java.util.function";
    //public interface BiPredicate
    class BiPredicate$<T, U> {
        //frequency 1
        boolean test(/*@Independent(hc=true)[T] @NotModified[T]*/ T t, /*@Independent(hc=true)[T] @NotModified[T]*/ U u) {
            return false;
        }
        BiPredicate<T, U> and(/*@IgnoreModifications[T]*/ BiPredicate<? super T, ? super U> other) { return null; }
        BiPredicate<T, U> negate() { return null; }
        BiPredicate<T, U> or(/*@IgnoreModifications[T]*/ BiPredicate<? super T, ? super U> other) { return null; }
    }

    //public interface Consumer
    class Consumer$<T> {
        //frequency 1
        void accept(/*@Independent(hc=true)[T] @NotModified[T]*/ T t) { }
        Consumer<T> andThen(/*@IgnoreModifications[T]*/ Consumer<? super T> after) { return null; }
    }

    //public interface Function
    class Function$<T, R> {
        //frequency 5
        //@Independent(hc=true)[T]
        R apply(/*@Independent(hc=true)[T] @NotModified[T]*/ T t) { return null; }

        <V> Function<V, R> compose(/*@IgnoreModifications[T]*/ Function<? super V, ? extends T> before) { return null; }
        <V> Function<T, V> andThen(/*@IgnoreModifications[T]*/ Function<? super R, ? extends V> after) { return null; }
        //frequency 2
        static <T> Function<T, T> identity() { return null; }
    }

    //public interface Supplier
    //@Container[M]
    class Supplier$<T> {
        //@Independent(hc=true)[T]
        T get() { return null; }
    }
}
