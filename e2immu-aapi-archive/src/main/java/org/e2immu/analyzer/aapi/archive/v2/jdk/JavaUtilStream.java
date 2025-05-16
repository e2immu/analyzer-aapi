package org.e2immu.analyzer.aapi.archive.v2.jdk;
import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.function.*;
import java.util.stream.*;

public class JavaUtilStream {
    public static final String PACKAGE_NAME = "java.util.stream";
    //public interface BaseStream implements AutoCloseable
    class BaseStream$<T, S extends BaseStream<T, S>> {
        Iterator<T> iterator() { return null; }
        Spliterator<T> spliterator() { return null; }
        boolean isParallel() { return false; }
        S sequential() { return null; }
        S parallel() { return null; }
        S unordered() { return null; }
        S onClose(Runnable runnable) { return null; }
        //override from java.lang.AutoCloseable
        void close() { }
    }

    //public final class Collectors
    class Collectors$ {
        //@Independent[T]
        static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(
            /*@IgnoreModifications[T]*/ Supplier<C> collectionFactory) { return null; }

        //frequency 16
        //@Independent[T]
        static <T> Collector<T, ?, List<T>> toList() { return null; }

        //@Independent[T]
        static <T> Collector<T, ?, List<T>> toUnmodifiableList() { return null; }

        //frequency 32
        //@Independent[T]
        static <T> Collector<T, ?, Set<T>> toSet() { return null; }

        //@Independent[T]
        static <T> Collector<T, ?, Set<T>> toUnmodifiableSet() { return null; }

        //@Independent[T]
        static Collector<CharSequence, ?, String> joining() { return null; }

        //frequency 5
        //@Independent[T]

        static Collector<CharSequence, ?, String> joining(
            /*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ CharSequence delimiter) { return null; }

        //@Independent[T]
        static Collector<CharSequence, ?, String> joining(
            /*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ CharSequence delimiter,
            /*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ CharSequence prefix,
            /*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ CharSequence suffix) { return null; }

        //@Independent[T]
        static <T, U, A, R> Collector<T, ?, R> mapping(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends U> mapper,
            Collector<? super U, A, R> downstream) { return null; }

        //@Independent[T]
        static <T, U, A, R> Collector<T, ?, R> flatMapping(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends Stream<? extends U>> mapper,
            Collector<? super U, A, R> downstream) { return null; }

        //@Independent[T]
        static <T, A, R> Collector<T, ?, R> filtering(
            /*@IgnoreModifications[T]*/ Predicate<? super T> predicate,
            Collector<? super T, A, R> downstream) { return null; }

        //@Independent[T]
        static <T, A, R, RR> Collector<T, A, RR> collectingAndThen(
            Collector<T, A, R> downstream,
            /*@IgnoreModifications[T]*/ Function<R, RR> finisher) { return null; }

        //@Independent[T]
        static <T> Collector<T, ?, Long> counting() { return null; }

        //@Independent[T]
        static <T> Collector<T, ?, Optional<T>> minBy(
            /*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ Comparator<? super T> comparator) {
            return null;
        }

        //@Independent[T]
        static <T> Collector<T, ?, Optional<T>> maxBy(
            /*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ Comparator<? super T> comparator) {
            return null;
        }

        //@Independent[T]
        static <T> Collector<T, ?, Integer> summingInt(/*@IgnoreModifications[T]*/ ToIntFunction<? super T> mapper) {
            return null;
        }

        //@Independent[T]
        static <T> Collector<T, ?, Long> summingLong(/*@IgnoreModifications[T]*/ ToLongFunction<? super T> mapper) {
            return null;
        }

        //@Independent[T]
        static <T> Collector<T, ?, Double> summingDouble(/*@IgnoreModifications[T]*/ ToDoubleFunction<? super T> mapper) {
            return null;
        }

        //@Independent[T]
        static <T> Collector<T, ?, Double> averagingInt(/*@IgnoreModifications[T]*/ ToIntFunction<? super T> mapper) {
            return null;
        }

        //@Independent[T]
        static <T> Collector<T, ?, Double> averagingLong(/*@IgnoreModifications[T]*/ ToLongFunction<? super T> mapper) {
            return null;
        }

        //@Independent[T]
        static <T> Collector<T, ?, Double> averagingDouble(
            /*@IgnoreModifications[T]*/ ToDoubleFunction<? super T> mapper) { return null; }

        //@Independent[T]
        static <T> Collector<T, ?, T> reducing(
            /*@Independent(hc=true)[T] @NotModified[T]*/ T identity,
            /*@IgnoreModifications[T]*/ BinaryOperator<T> op) { return null; }

        //@Independent[T]
        static <T> Collector<T, ?, Optional<T>> reducing(/*@IgnoreModifications[T]*/ BinaryOperator<T> op) {
            return null;
        }

        //@Independent[T]
        static <T, U> Collector<T, ?, U> reducing(
            /*@Independent(hc=true)[T] @NotModified[T]*/ U identity,
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends U> mapper,
            /*@IgnoreModifications[T]*/ BinaryOperator<U> op) { return null; }

        //frequency 1
        //@Independent[T]

        static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> classifier) { return null; }

        //@Independent[T]
        static <T, K, A, D> Collector<T, ?, Map<K, D>> groupingBy(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> classifier,
            Collector<? super T, A, D> downstream) { return null; }

        //@Independent[T]
        static <T, K, D, A, M extends Map<K, D>> Collector<T, ?, M> groupingBy(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> classifier,
            /*@IgnoreModifications[T]*/ Supplier<M> mapFactory,
            Collector<? super T, A, D> downstream) { return null; }

        //@Independent[T]
        static <T, K> Collector<T, ?, ConcurrentMap<K, List<T>>> groupingByConcurrent(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> classifier) { return null; }

        //@Independent[T]
        static <T, K, A, D> Collector<T, ?, ConcurrentMap<K, D>> groupingByConcurrent(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> classifier,
            Collector<? super T, A, D> downstream) { return null; }

        //@Independent[T]
        static <T, K, A, D, M extends ConcurrentMap<K, D>> Collector<T, ?, M> groupingByConcurrent(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> classifier,
            /*@IgnoreModifications[T]*/ Supplier<M> mapFactory,
            Collector<? super T, A, D> downstream) { return null; }

        //@Independent[T]
        static <T> Collector<T, ?, Map<Boolean, List<T>>> partitioningBy(
            /*@IgnoreModifications[T]*/ Predicate<? super T> predicate) { return null; }

        //@Independent[T]
        static <T, D, A> Collector<T, ?, Map<Boolean, D>> partitioningBy(
            /*@IgnoreModifications[T]*/ Predicate<? super T> predicate,
            Collector<? super T, A, D> downstream) { return null; }

        //frequency 7
        //@Independent[T]

        static <T, K, U> Collector<T, ?, Map<K, U>> toMap(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> keyMapper,
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends U> valueMapper) { return null; }

        //@Independent[T]
        static <T, K, U> Collector<T, ?, Map<K, U>> toUnmodifiableMap(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> keyMapper,
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends U> valueMapper) { return null; }

        //frequency 2
        //@Independent[T]

        static <T, K, U> Collector<T, ?, Map<K, U>> toMap(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> keyMapper,
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends U> valueMapper,
            /*@IgnoreModifications[T]*/ BinaryOperator<U> mergeFunction) { return null; }

        //@Independent[T]
        static <T, K, U> Collector<T, ?, Map<K, U>> toUnmodifiableMap(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> keyMapper,
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends U> valueMapper,
            /*@IgnoreModifications[T]*/ BinaryOperator<U> mergeFunction) { return null; }

        //@Independent[T]
        static <T, K, U, M extends Map<K, U>> Collector<T, ?, M> toMap(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> keyMapper,
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends U> valueMapper,
            /*@IgnoreModifications[T]*/ BinaryOperator<U> mergeFunction,
            /*@IgnoreModifications[T]*/ Supplier<M> mapFactory) { return null; }

        //@Independent[T]
        static <T, K, U> Collector<T, ?, ConcurrentMap<K, U>> toConcurrentMap(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> keyMapper,
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends U> valueMapper) { return null; }

        //@Independent[T]
        static <T, K, U> Collector<T, ?, ConcurrentMap<K, U>> toConcurrentMap(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> keyMapper,
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends U> valueMapper,
            /*@IgnoreModifications[T]*/ BinaryOperator<U> mergeFunction) { return null; }

        //@Independent[T]
        static <T, K, U, M extends ConcurrentMap<K, U>> Collector<T, ?, M> toConcurrentMap(
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends K> keyMapper,
            /*@IgnoreModifications[T]*/ Function<? super T, ? extends U> valueMapper,
            /*@IgnoreModifications[T]*/ BinaryOperator<U> mergeFunction,
            /*@IgnoreModifications[T]*/ Supplier<M> mapFactory) { return null; }

        //@Independent[T]
        static <T> Collector<T, ?, IntSummaryStatistics> summarizingInt(
            /*@IgnoreModifications[T]*/ ToIntFunction<? super T> mapper) { return null; }

        //@Independent[T]
        static <T> Collector<T, ?, LongSummaryStatistics> summarizingLong(
            /*@IgnoreModifications[T]*/ ToLongFunction<? super T> mapper) { return null; }

        //@Independent[T]
        static <T> Collector<T, ?, DoubleSummaryStatistics> summarizingDouble(
            /*@IgnoreModifications[T]*/ ToDoubleFunction<? super T> mapper) { return null; }

        //@Independent[T]
        static <T, R1, R2, R> Collector<T, ?, R> teeing(
            Collector<? super T, ?, R1> downstream1,
            Collector<? super T, ?, R2> downstream2,
            /*@IgnoreModifications[T]*/ BiFunction<? super R1, ? super R2, R> merger) { return null; }
    }

    //public interface DoubleStream implements BaseStream<Double,DoubleStream>
    class DoubleStream$ {
        //public interface Builder implements DoubleConsumer
        class Builder {
            //override from java.util.function.DoubleConsumer
            void accept(double d) { }
            DoubleStream.Builder add(double t) { return null; }
            DoubleStream build() { return null; }
        }

        //public interface DoubleMapMultiConsumer
        class DoubleMapMultiConsumer {
            void accept(double d, /*@IgnoreModifications[T]*/ DoubleConsumer doubleConsumer) { }
        }
        DoubleStream filter(/*@IgnoreModifications[T]*/ DoublePredicate doublePredicate) { return null; }
        DoubleStream map(/*@IgnoreModifications[T]*/ DoubleUnaryOperator doubleUnaryOperator) { return null; }
        <U> Stream<U> mapToObj(/*@IgnoreModifications[T]*/ DoubleFunction<? extends U> doubleFunction) { return null; }
        IntStream mapToInt(/*@IgnoreModifications[T]*/ DoubleToIntFunction doubleToIntFunction) { return null; }
        LongStream mapToLong(/*@IgnoreModifications[T]*/ DoubleToLongFunction doubleToLongFunction) { return null; }
        DoubleStream flatMap(/*@IgnoreModifications[T]*/ DoubleFunction<? extends DoubleStream> doubleFunction) {
            return null;
        }
        DoubleStream mapMulti(DoubleStream.DoubleMapMultiConsumer mapper) { return null; }
        DoubleStream distinct() { return null; }
        DoubleStream sorted() { return null; }
        DoubleStream peek(/*@IgnoreModifications[T]*/ DoubleConsumer doubleConsumer) { return null; }
        DoubleStream limit(long l) { return null; }
        DoubleStream skip(long l) { return null; }
        DoubleStream takeWhile(/*@IgnoreModifications[T]*/ DoublePredicate predicate) { return null; }
        DoubleStream dropWhile(/*@IgnoreModifications[T]*/ DoublePredicate predicate) { return null; }
        void forEach(/*@IgnoreModifications[T]*/ DoubleConsumer doubleConsumer) { }
        void forEachOrdered(/*@IgnoreModifications[T]*/ DoubleConsumer doubleConsumer) { }
        double [] toArray() { return null; }
        double reduce(double d, /*@IgnoreModifications[T]*/ DoubleBinaryOperator doubleBinaryOperator) { return 0.0; }
        //@Immutable[T] @Independent[T]
        OptionalDouble reduce(/*@IgnoreModifications[T]*/ DoubleBinaryOperator doubleBinaryOperator) { return null; }

        //@Independent(hc=true)[T]
        <R> R collect(
            /*@IgnoreModifications[T]*/ Supplier<R> supplier,
            /*@IgnoreModifications[T]*/ ObjDoubleConsumer<R> objDoubleConsumer,
            /*@IgnoreModifications[T]*/ BiConsumer<R, R> biConsumer) { return null; }
        double sum() { return 0.0; }
        //@Immutable[T] @Independent[T]
        OptionalDouble min() { return null; }

        //frequency 1
        //@Immutable[T] @Independent[T]
        OptionalDouble max() { return null; }
        long count() { return 0L; }
        //@Immutable[T] @Independent[T]
        OptionalDouble average() { return null; }
        DoubleSummaryStatistics summaryStatistics() { return null; }
        boolean anyMatch(/*@IgnoreModifications[T]*/ DoublePredicate doublePredicate) { return false; }
        boolean allMatch(/*@IgnoreModifications[T]*/ DoublePredicate doublePredicate) { return false; }
        boolean noneMatch(/*@IgnoreModifications[T]*/ DoublePredicate doublePredicate) { return false; }
        //@Immutable[T] @Independent[T]
        OptionalDouble findFirst() { return null; }

        //@Immutable[T] @Independent[T]
        OptionalDouble findAny() { return null; }
        Stream<Double> boxed() { return null; }
        //override from java.util.stream.BaseStream
        DoubleStream sequential() { return null; }

        //override from java.util.stream.BaseStream
        DoubleStream parallel() { return null; }

        //override from java.util.stream.BaseStream
        PrimitiveIterator.OfDouble iterator() { return null; }

        //override from java.util.stream.BaseStream
        Spliterator.OfDouble spliterator() { return null; }
        static DoubleStream.Builder builder() { return null; }
        static DoubleStream empty() { return null; }
        static DoubleStream of(double t) { return null; }
        static DoubleStream of(double ... values) { return null; }
        static DoubleStream iterate(double seed, /*@IgnoreModifications[T]*/ DoubleUnaryOperator doubleUnaryOperator) {
            return null;
        }

        static DoubleStream iterate(
            double seed,
            /*@IgnoreModifications[T]*/ DoublePredicate doublePredicate,
            /*@IgnoreModifications[T]*/ DoubleUnaryOperator hasNext) { return null; }
        static DoubleStream generate(/*@IgnoreModifications[T]*/ DoubleSupplier s) { return null; }
        static DoubleStream concat(DoubleStream a, DoubleStream b) { return null; }
    }

    //public interface IntStream implements BaseStream<Integer,IntStream>
    class IntStream$ {
        //public interface Builder implements IntConsumer
        class Builder {
            //override from java.util.function.IntConsumer
            void accept(int i) { }
            IntStream.Builder add(int t) { return null; }
            IntStream build() { return null; }
        }

        //public interface IntMapMultiConsumer
        class IntMapMultiConsumer {void accept(int i, /*@IgnoreModifications[T]*/ IntConsumer intConsumer) { } }
        IntStream filter(/*@IgnoreModifications[T]*/ IntPredicate intPredicate) { return null; }
        IntStream map(/*@IgnoreModifications[T]*/ IntUnaryOperator intUnaryOperator) { return null; }
        //frequency 1
        <U> Stream<U> mapToObj(/*@IgnoreModifications[T]*/ IntFunction<? extends U> intFunction) { return null; }
        LongStream mapToLong(/*@IgnoreModifications[T]*/ IntToLongFunction intToLongFunction) { return null; }
        DoubleStream mapToDouble(/*@IgnoreModifications[T]*/ IntToDoubleFunction intToDoubleFunction) { return null; }
        IntStream flatMap(/*@IgnoreModifications[T]*/ IntFunction<? extends IntStream> intFunction) { return null; }
        IntStream mapMulti(IntStream.IntMapMultiConsumer mapper) { return null; }
        IntStream distinct() { return null; }
        IntStream sorted() { return null; }
        IntStream peek(/*@IgnoreModifications[T]*/ IntConsumer intConsumer) { return null; }
        IntStream limit(long l) { return null; }
        IntStream skip(long l) { return null; }
        IntStream takeWhile(/*@IgnoreModifications[T]*/ IntPredicate predicate) { return null; }
        IntStream dropWhile(/*@IgnoreModifications[T]*/ IntPredicate predicate) { return null; }
        void forEach(/*@IgnoreModifications[T]*/ IntConsumer intConsumer) { }
        void forEachOrdered(/*@IgnoreModifications[T]*/ IntConsumer intConsumer) { }
        int [] toArray() { return null; }
        int reduce(int i, /*@IgnoreModifications[T]*/ IntBinaryOperator intBinaryOperator) { return 0; }
        //@Immutable[T] @Independent[T]
        OptionalInt reduce(/*@IgnoreModifications[T]*/ IntBinaryOperator intBinaryOperator) { return null; }

        //@Independent(hc=true)[T]
        <R> R collect(
            /*@IgnoreModifications[T]*/ Supplier<R> supplier,
            /*@IgnoreModifications[T]*/ ObjIntConsumer<R> objIntConsumer,
            /*@IgnoreModifications[T]*/ BiConsumer<R, R> biConsumer) { return null; }

        //frequency 1
        int sum() { return 0; }

        //@Immutable[T] @Independent[T]
        OptionalInt min() { return null; }

        //frequency 1
        //@Immutable[T] @Independent[T]
        OptionalInt max() { return null; }
        long count() { return 0L; }
        //@Immutable[T] @Independent[T]
        OptionalDouble average() { return null; }
        IntSummaryStatistics summaryStatistics() { return null; }
        boolean anyMatch(/*@IgnoreModifications[T]*/ IntPredicate intPredicate) { return false; }
        boolean allMatch(/*@IgnoreModifications[T]*/ IntPredicate intPredicate) { return false; }
        boolean noneMatch(/*@IgnoreModifications[T]*/ IntPredicate intPredicate) { return false; }
        //@Immutable[T] @Independent[T]
        OptionalInt findFirst() { return null; }

        //@Immutable[T] @Independent[T]
        OptionalInt findAny() { return null; }
        LongStream asLongStream() { return null; }
        DoubleStream asDoubleStream() { return null; }
        Stream<Integer> boxed() { return null; }
        //override from java.util.stream.BaseStream
        IntStream sequential() { return null; }

        //override from java.util.stream.BaseStream
        IntStream parallel() { return null; }

        //override from java.util.stream.BaseStream
        PrimitiveIterator.OfInt iterator() { return null; }

        //override from java.util.stream.BaseStream
        Spliterator.OfInt spliterator() { return null; }
        static IntStream.Builder builder() { return null; }
        static IntStream empty() { return null; }
        static IntStream of(int t) { return null; }
        static IntStream of(int ... values) { return null; }
        static IntStream iterate(int seed, /*@IgnoreModifications[T]*/ IntUnaryOperator f) { return null; }
        static IntStream iterate(
            int seed,
            /*@IgnoreModifications[T]*/ IntPredicate hasNext,
            /*@IgnoreModifications[T]*/ IntUnaryOperator next) { return null; }
        static IntStream generate(/*@IgnoreModifications[T]*/ IntSupplier s) { return null; }
        static IntStream range(int startInclusive, int endExclusive) { return null; }
        //frequency 1
        static IntStream rangeClosed(int startInclusive, int endInclusive) { return null; }
        static IntStream concat(IntStream a, IntStream b) { return null; }
    }

    //public interface LongStream implements BaseStream<Long,LongStream>
    class LongStream$ {
        //public interface Builder implements LongConsumer
        class Builder {
            //override from java.util.function.LongConsumer
            void accept(long l) { }
            LongStream.Builder add(long t) { return null; }
            LongStream build() { return null; }
        }

        //public interface LongMapMultiConsumer
        class LongMapMultiConsumer {void accept(long l, /*@IgnoreModifications[T]*/ LongConsumer longConsumer) { } }
        LongStream filter(/*@IgnoreModifications[T]*/ LongPredicate longPredicate) { return null; }
        LongStream map(/*@IgnoreModifications[T]*/ LongUnaryOperator longUnaryOperator) { return null; }
        <U> Stream<U> mapToObj(/*@IgnoreModifications[T]*/ LongFunction<? extends U> longFunction) { return null; }
        IntStream mapToInt(/*@IgnoreModifications[T]*/ LongToIntFunction longToIntFunction) { return null; }
        DoubleStream mapToDouble(/*@IgnoreModifications[T]*/ LongToDoubleFunction longToDoubleFunction) { return null; }

        LongStream flatMap(/*@IgnoreModifications[T]*/ LongFunction<? extends LongStream> longFunction) { return null; }
        LongStream mapMulti(LongStream.LongMapMultiConsumer mapper) { return null; }
        LongStream distinct() { return null; }
        LongStream sorted() { return null; }
        LongStream peek(/*@IgnoreModifications[T]*/ LongConsumer longConsumer) { return null; }
        LongStream limit(long l) { return null; }
        LongStream skip(long l) { return null; }
        LongStream takeWhile(/*@IgnoreModifications[T]*/ LongPredicate predicate) { return null; }
        LongStream dropWhile(/*@IgnoreModifications[T]*/ LongPredicate predicate) { return null; }
        void forEach(/*@IgnoreModifications[T]*/ LongConsumer longConsumer) { }
        void forEachOrdered(/*@IgnoreModifications[T]*/ LongConsumer longConsumer) { }
        long [] toArray() { return null; }
        long reduce(long l, /*@IgnoreModifications[T]*/ LongBinaryOperator longBinaryOperator) { return 0L; }
        OptionalLong reduce(/*@IgnoreModifications[T]*/ LongBinaryOperator longBinaryOperator) { return null; }
        //@Independent(hc=true)[T]
        <R> R collect(
            /*@IgnoreModifications[T]*/ Supplier<R> supplier,
            /*@IgnoreModifications[T]*/ ObjLongConsumer<R> objLongConsumer,
            /*@IgnoreModifications[T]*/ BiConsumer<R, R> biConsumer) { return null; }

        //frequency 1
        long sum() { return 0L; }
        OptionalLong min() { return null; }
        OptionalLong max() { return null; }
        long count() { return 0L; }
        //@Immutable[T] @Independent[T]
        OptionalDouble average() { return null; }
        LongSummaryStatistics summaryStatistics() { return null; }
        //frequency 1
        boolean anyMatch(/*@IgnoreModifications[T]*/ LongPredicate longPredicate) { return false; }
        boolean allMatch(/*@IgnoreModifications[T]*/ LongPredicate longPredicate) { return false; }
        boolean noneMatch(/*@IgnoreModifications[T]*/ LongPredicate longPredicate) { return false; }
        OptionalLong findFirst() { return null; }
        OptionalLong findAny() { return null; }
        DoubleStream asDoubleStream() { return null; }
        Stream<Long> boxed() { return null; }
        //override from java.util.stream.BaseStream
        LongStream sequential() { return null; }

        //override from java.util.stream.BaseStream
        LongStream parallel() { return null; }

        //override from java.util.stream.BaseStream
        PrimitiveIterator.OfLong iterator() { return null; }

        //override from java.util.stream.BaseStream
        Spliterator.OfLong spliterator() { return null; }
        static LongStream.Builder builder() { return null; }
        static LongStream empty() { return null; }
        static LongStream of(long t) { return null; }
        static LongStream of(long ... values) { return null; }
        static LongStream iterate(long seed, /*@IgnoreModifications[T]*/ LongUnaryOperator longUnaryOperator) {
            return null;
        }

        static LongStream iterate(
            long seed,
            /*@IgnoreModifications[T]*/ LongPredicate longPredicate,
            /*@IgnoreModifications[T]*/ LongUnaryOperator hasNext) { return null; }
        static LongStream generate(/*@IgnoreModifications[T]*/ LongSupplier s) { return null; }
        static LongStream range(long startInclusive, long l) { return null; }
        static LongStream rangeClosed(long startInclusive, long l) { return null; }
        static LongStream concat(LongStream a, LongStream b) { return null; }
    }

    //public interface Stream implements BaseStream<T,Stream<T>>
    class Stream$<T> {
        //public interface Builder implements Consumer<T>
        class Builder<T> {
            //override from java.util.function.Consumer
            void accept(/*@Independent(hc=true)[H] @NotModified[T]*/ T t) { }
            Stream.Builder<T> add(/*@Independent(hc=true)[T] @NotModified[T]*/ T t) { return null; }
            Stream<T> build() { return null; }
        }

        //frequency 114
        Stream<T> filter(/*@IgnoreModifications[T]*/ Predicate<? super T> predicate) { return null; }

        //frequency 99
        <R> Stream<R> map(/*@IgnoreModifications[T]*/ Function<? super T, ? extends R> function) { return null; }

        //frequency 2
        IntStream mapToInt(/*@IgnoreModifications[T]*/ ToIntFunction<? super T> toIntFunction) { return null; }

        //frequency 1
        LongStream mapToLong(/*@IgnoreModifications[T]*/ ToLongFunction<? super T> toLongFunction) { return null; }

        //frequency 1
        DoubleStream mapToDouble(/*@IgnoreModifications[T]*/ ToDoubleFunction<? super T> toDoubleFunction) {
            return null;
        }

        //frequency 6
        <R> Stream<R> flatMap(/*@IgnoreModifications[T]*/ Function<? super T, ? extends Stream<? extends R>> function) {
            return null;
        }

        IntStream flatMapToInt(/*@IgnoreModifications[T]*/ Function<? super T, ? extends IntStream> function) {
            return null;
        }

        LongStream flatMapToLong(/*@IgnoreModifications[T]*/ Function<? super T, ? extends LongStream> function) {
            return null;
        }

        DoubleStream flatMapToDouble(/*@IgnoreModifications[T]*/ Function<? super T, ? extends DoubleStream> function) {
            return null;
        }

        <R> Stream<R> mapMulti(/*@IgnoreModifications[T]*/ BiConsumer<? super T, ? super Consumer<R>> mapper) {
            return null;
        }

        IntStream mapMultiToInt(/*@IgnoreModifications[T]*/ BiConsumer<? super T, ? super IntConsumer> mapper) {
            return null;
        }

        LongStream mapMultiToLong(/*@IgnoreModifications[T]*/ BiConsumer<? super T, ? super LongConsumer> mapper) {
            return null;
        }

        DoubleStream mapMultiToDouble(/*@IgnoreModifications[T]*/ BiConsumer<? super T, ? super DoubleConsumer> mapper) {
            return null;
        }

        //frequency 2
        Stream<T> distinct() { return null; }

        //frequency 1
        Stream<T> sorted() { return null; }

        //frequency 10
        Stream<T> sorted(
            /*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ Comparator<? super T> comparator) {
            return null;
        }

        //frequency 2
        Stream<T> peek(/*@IgnoreModifications[T]*/ Consumer<? super T> consumer) { return null; }

        //frequency 3
        Stream<T> limit(long l) { return null; }
        Stream<T> skip(long l) { return null; }
        Stream<T> takeWhile(/*@IgnoreModifications[T]*/ Predicate<? super T> predicate) { return null; }
        Stream<T> dropWhile(/*@IgnoreModifications[T]*/ Predicate<? super T> predicate) { return null; }
        //frequency 24
        void forEach(/*@IgnoreModifications[T]*/ Consumer<? super T> consumer) { }
        void forEachOrdered(/*@IgnoreModifications[T]*/ Consumer<? super T> consumer) { }
        Object [] toArray() { return null; }
        //frequency 3
        <A> A [] toArray(/*@IgnoreModifications[T]*/ IntFunction<A []> intFunction) { return null; }

        //@Independent(hc=true)[T]
        T reduce(
            /*@Independent(hc=true)[T] @NotModified[T]*/ T t,
            /*@IgnoreModifications[T]*/ BinaryOperator<T> binaryOperator) { return null; }

        //@Immutable(hc=true)[T] @Independent(hc=true)[T]
        Optional<T> reduce(/*@IgnoreModifications[T]*/ BinaryOperator<T> binaryOperator) { return null; }

        //@Independent(hc=true)[T]
        <U> U reduce(
            /*@Independent(hc=true)[T] @NotModified[T]*/ U u,
            /*@IgnoreModifications[T]*/ BiFunction<U, ? super T, U> biFunction,
            /*@IgnoreModifications[T]*/ BinaryOperator<U> binaryOperator) { return null; }
        <R> Stream<R> gather(Gatherer<? super T, ?, R> gatherer) { return null; }
        //@Independent(hc=true)[T]
        <R> R collect(
            /*@IgnoreModifications[T]*/ Supplier<R> supplier,
            /*@IgnoreModifications[T]*/ BiConsumer<R, ? super T> biConsumer,
            /*@IgnoreModifications[T]*/ BiConsumer<R, R> biConsumer1) { return null; }

        //frequency 63
        //@Independent(hc=true)[T]
        <R, A> R collect(Collector<? super T, A, R> collector) { return null; }

        //frequency 92
        List<T> toList() { return null; }

        //@Immutable(hc=true)[T] @Independent(hc=true)[T]
        Optional<T> min(
            /*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ Comparator<? super T> comparator) {
            return null;
        }

        //@Immutable(hc=true)[T] @Independent(hc=true)[T]
        Optional<T> max(
            /*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ Comparator<? super T> comparator) {
            return null;
        }
        long count() { return 0L; }
        //frequency 21
        boolean anyMatch(/*@IgnoreModifications[T]*/ Predicate<? super T> predicate) { return false; }
        boolean allMatch(/*@IgnoreModifications[T]*/ Predicate<? super T> predicate) { return false; }
        //frequency 3
        boolean noneMatch(/*@IgnoreModifications[T]*/ Predicate<? super T> predicate) { return false; }

        //frequency 71
        //@Immutable(hc=true)[T] @Independent(hc=true)[T]
        Optional<T> findFirst() { return null; }

        //@Immutable(hc=true)[T] @Independent(hc=true)[T]
        Optional<T> findAny() { return null; }
        static <T> Stream.Builder<T> builder() { return null; }
        static <T> Stream<T> empty() { return null; }
        static <T> Stream<T> of(/*@Independent(hc=true)[T] @NotModified[T]*/ T t) { return null; }
        static <T> Stream<T> ofNullable(/*@Independent(hc=true)[T] @NotModified[T]*/ T t) { return null; }
        //frequency 3
        static <T> Stream<T> of(T ... values) { return null; }

        static <T> Stream<T> iterate(
            /*@Independent(hc=true)[T] @NotModified[T]*/ T seed,
            /*@IgnoreModifications[T]*/ UnaryOperator<T> f) { return null; }

        static <T> Stream<T> iterate(
            /*@Independent(hc=true)[T] @NotModified[T]*/ T seed,
            /*@IgnoreModifications[T]*/ Predicate<? super T> hasNext,
            /*@IgnoreModifications[T]*/ UnaryOperator<T> next) { return null; }
        static <T> Stream<T> generate(/*@IgnoreModifications[T]*/ Supplier<? extends T> s) { return null; }
        static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b) { return null; }
    }
}
