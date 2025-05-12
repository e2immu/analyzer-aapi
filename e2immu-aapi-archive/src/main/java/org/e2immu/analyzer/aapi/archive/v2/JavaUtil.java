package org.e2immu.analyzer.aapi.archive.v2;
import org.e2immu.annotation.*;
import org.e2immu.annotation.type.UtilityClass;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Queue;
import java.util.Random;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;
import java.util.random.RandomGenerator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
public class JavaUtil {
    public static final String PACKAGE_NAME = "java.util";
    //public abstract class AbstractCollection implements Collection<E>
    class AbstractCollection$<E> {
        //overrides in java.lang.Iterable, java.util.Collection
        Iterator<E> iterator() { return null; }

        //overrides in java.util.Collection
        int size() { return 0; }

        //overrides in java.util.Collection
        boolean isEmpty() { return false; }

        //overrides in java.util.Collection
        boolean contains(Object o) { return false; }

        //overrides in java.util.Collection
        Object [] toArray() { return null; }

        //overrides in java.util.Collection
        <T> T [] toArray(T [] a) { return null; }

        //overrides in java.util.Collection
        //override has frequency 16
        boolean add(E e) { return false; }

        //overrides in java.util.Collection
        boolean remove(Object o) { return false; }

        //overrides in java.util.Collection
        boolean containsAll(Collection<?> c) { return false; }

        //overrides in java.util.Collection
        //override has frequency 1
        boolean addAll(Collection<? extends E> c) { return false; }

        //overrides in java.util.Collection
        boolean removeAll(Collection<?> c) { return false; }

        //overrides in java.util.Collection
        boolean retainAll(Collection<?> c) { return false; }

        //overrides in java.util.Collection
        void clear() { }

        //overrides in java.lang.Object
        public String toString() { return null; }
    }

    //public abstract class AbstractList extends AbstractCollection<E> implements List<E>
    class AbstractList$<E> {
        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.List
        //override has frequency 16
        boolean add(E e) { return false; }

        //overrides in java.util.List
        E get(int i) { return null; }

        //overrides in java.util.List
        E set(int index, E element) { return null; }

        //overrides in java.util.List
        void add(int index, E element) { }

        //overrides in java.util.List
        E remove(int index) { return null; }

        //overrides in java.util.List
        int indexOf(Object o) { return 0; }

        //overrides in java.util.List
        int lastIndexOf(Object o) { return 0; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.List
        void clear() { }

        //overrides in java.util.List
        boolean addAll(int index, Collection<? extends E> c) { return false; }

        //overrides in java.lang.Iterable, java.util.AbstractCollection, java.util.Collection, java.util.List
        Iterator<E> iterator() { return null; }

        //overrides in java.util.List
        ListIterator<E> listIterator() { return null; }

        //overrides in java.util.List
        ListIterator<E> listIterator(int index) { return null; }

        //overrides in java.util.List
        List<E> subList(int fromIndex, int toIndex) { return null; }

        //overrides in java.lang.Object, java.util.Collection, java.util.List
        public boolean equals(Object o) { return false; }

        //overrides in java.lang.Object, java.util.Collection, java.util.List
        public int hashCode() { return 0; }
    }

    //public abstract class AbstractMap implements Map<K,V>
    class AbstractMap$<K, V> {
        //overrides in java.util.Map
        int size() { return 0; }

        //overrides in java.util.Map
        boolean isEmpty() { return false; }

        //overrides in java.util.Map
        boolean containsValue(Object value) { return false; }

        //overrides in java.util.Map
        //override has frequency 2
        boolean containsKey(Object key) { return false; }

        //overrides in java.util.Map
        //override has frequency 2
        V get(Object key) { return null; }

        //overrides in java.util.Map
        //override has frequency 1
        V put(K key, V value) { return null; }

        //overrides in java.util.Map
        V remove(Object key) { return null; }

        //overrides in java.util.Map
        void putAll(Map<? extends K, ? extends V> m) { }

        //overrides in java.util.Map
        void clear() { }

        //overrides in java.util.Map
        Set<K> keySet() { return null; }

        //overrides in java.util.Map
        //override has frequency 2
        Collection<V> values() { return null; }

        //overrides in java.util.Map
        Set<Map.Entry<K, V>> entrySet() { return null; }

        //overrides in java.lang.Object, java.util.Map
        public boolean equals(Object o) { return false; }

        //overrides in java.lang.Object, java.util.Map
        public int hashCode() { return 0; }

        //overrides in java.lang.Object
        public String toString() { return null; }
    }

    //public abstract class AbstractSet extends AbstractCollection<E> implements Set<E>
    class AbstractSet$<E> {
        //overrides in java.lang.Object, java.util.Collection, java.util.Set
        public boolean equals(Object o) { return false; }

        //overrides in java.lang.Object, java.util.Collection, java.util.Set
        public int hashCode() { return 0; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.Set
        boolean removeAll(Collection<?> c) { return false; }
    }

    //public class ArrayList extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
    class ArrayList$<E> {
        //frequency 1
        ArrayList$(int initialCapacity) { }

        //frequency 58
        ArrayList$() { }

        //frequency 5
        ArrayList$(@NotModified @Independent(hc = true) Collection<? extends E> c) { }
        void trimToSize() { }
        void ensureCapacity(int minCapacity) { }
        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.List
        int size() { return 0; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.List
        boolean isEmpty() { return false; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.List
        boolean contains(Object o) { return false; }

        //overrides in java.util.AbstractList, java.util.List
        int indexOf(Object o) { return 0; }

        //overrides in java.util.AbstractList, java.util.List
        int lastIndexOf(Object o) { return 0; }

        //overrides in java.lang.Object
        protected Object clone() { return null; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.List
        Object [] toArray() { return null; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.List
        <T> T [] toArray(T [] a) { return null; }

        //overrides in java.util.AbstractList, java.util.List
        E get(int index) { return null; }

        //overrides in java.util.List, java.util.SequencedCollection
        E getFirst() { return null; }

        //overrides in java.util.List, java.util.SequencedCollection
        E getLast() { return null; }

        //overrides in java.util.AbstractList, java.util.List
        E set(int index, E element) { return null; }

        //overrides in java.util.AbstractCollection, java.util.AbstractList, java.util.Collection, java.util.List
        //frequency 16
        boolean add(E e) { return false; }

        //overrides in java.util.AbstractList, java.util.List
        void add(int index, E element) { }

        //overrides in java.util.List, java.util.SequencedCollection
        void addFirst(E element) { }

        //overrides in java.util.List, java.util.SequencedCollection
        void addLast(E element) { }

        //overrides in java.util.AbstractList, java.util.List
        E remove(int index) { return null; }

        //overrides in java.util.List, java.util.SequencedCollection
        E removeFirst() { return null; }

        //overrides in java.util.List, java.util.SequencedCollection
        E removeLast() { return null; }

        //overrides in java.lang.Object, java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object o) { return false; }

        //overrides in java.lang.Object, java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() { return 0; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.List
        boolean remove(Object o) { return false; }

        //overrides in java.util.AbstractCollection, java.util.AbstractList, java.util.Collection, java.util.List
        void clear() { }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.List
        //frequency 1
        boolean addAll(Collection<? extends E> c) { return false; }

        //overrides in java.util.AbstractList, java.util.List
        boolean addAll(int index, Collection<? extends E> c) { return false; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.List
        boolean removeAll(Collection<?> c) { return false; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.List
        boolean retainAll(Collection<?> c) { return false; }

        //overrides in java.util.AbstractList, java.util.List
        ListIterator<E> listIterator(int index) { return null; }

        //overrides in java.util.AbstractList, java.util.List
        ListIterator<E> listIterator() { return null; }

        //overrides in java.lang.Iterable, java.util.AbstractCollection, java.util.AbstractList, java.util.Collection, java.util.List
        Iterator<E> iterator() { return null; }

        //overrides in java.util.AbstractList, java.util.List
        List<E> subList(int fromIndex, int toIndex) { return null; }

        //overrides in java.lang.Iterable
        void forEach(Consumer<? super E> action) { }

        //overrides in java.lang.Iterable, java.util.Collection, java.util.List
        Spliterator<E> spliterator() { return null; }

        //overrides in java.util.Collection
        boolean removeIf(Predicate<? super E> filter) { return false; }

        //overrides in java.util.List
        void replaceAll(UnaryOperator<E> operator) { }

        //overrides in java.util.List
        //frequency 1
        void sort(@NotModified @Independent(hc = true) Comparator<? super E> c) { }
    }

    //public final class Arrays
    class Arrays$ {
        static void sort(int [] a) { }
        static void sort(int [] a, int fromIndex, int toIndex) { }
        static void sort(long [] a) { }
        static void sort(long [] a, int fromIndex, int toIndex) { }
        static void sort(short [] a) { }
        static void sort(short [] a, int fromIndex, int toIndex) { }
        static void sort(char [] a) { }
        static void sort(char [] a, int fromIndex, int toIndex) { }
        static void sort(byte [] a) { }
        static void sort(byte [] a, int fromIndex, int toIndex) { }
        static void sort(float [] a) { }
        static void sort(float [] a, int fromIndex, int toIndex) { }
        static void sort(double [] a) { }
        static void sort(double [] a, int fromIndex, int toIndex) { }
        static void parallelSort(byte [] a) { }
        static void parallelSort(byte [] a, int fromIndex, int toIndex) { }
        static void parallelSort(char [] a) { }
        static void parallelSort(char [] a, int fromIndex, int toIndex) { }
        static void parallelSort(short [] a) { }
        static void parallelSort(short [] a, int fromIndex, int toIndex) { }
        static void parallelSort(int [] a) { }
        static void parallelSort(int [] a, int fromIndex, int toIndex) { }
        static void parallelSort(long [] a) { }
        static void parallelSort(long [] a, int fromIndex, int toIndex) { }
        static void parallelSort(float [] a) { }
        static void parallelSort(float [] a, int fromIndex, int toIndex) { }
        static void parallelSort(double [] a) { }
        static void parallelSort(double [] a, int fromIndex, int toIndex) { }
        static <T extends Comparable<? super T>> void parallelSort(T [] a) { }
        static <T extends Comparable<? super T>> void parallelSort(T [] a, int fromIndex, int toIndex) { }
        static <T> void parallelSort(T [] a, Comparator<? super T> cmp) { }
        static <T> void parallelSort(T [] a, int fromIndex, int toIndex, Comparator<? super T> cmp) { }
        static void sort(Object [] a) { }
        static void sort(Object [] a, int fromIndex, int toIndex) { }
        static <T> void sort(T [] a, Comparator<? super T> c) { }
        static <T> void sort(T [] a, int fromIndex, int toIndex, Comparator<? super T> c) { }
        static <T> void parallelPrefix(T [] array, BinaryOperator<T> op) { }
        static <T> void parallelPrefix(T [] array, int fromIndex, int toIndex, BinaryOperator<T> op) { }
        static void parallelPrefix(long [] array, LongBinaryOperator op) { }
        static void parallelPrefix(long [] array, int fromIndex, int toIndex, LongBinaryOperator op) { }
        static void parallelPrefix(double [] array, DoubleBinaryOperator op) { }
        static void parallelPrefix(double [] array, int fromIndex, int toIndex, DoubleBinaryOperator op) { }
        static void parallelPrefix(int [] array, IntBinaryOperator op) { }
        static void parallelPrefix(int [] array, int fromIndex, int toIndex, IntBinaryOperator op) { }
        static int binarySearch(long [] a, long key) { return 0; }
        static int binarySearch(long [] a, int fromIndex, int toIndex, long key) { return 0; }
        static int binarySearch(int [] a, int key) { return 0; }
        static int binarySearch(int [] a, int fromIndex, int toIndex, int key) { return 0; }
        static int binarySearch(short [] a, short key) { return 0; }
        static int binarySearch(short [] a, int fromIndex, int toIndex, short key) { return 0; }
        static int binarySearch(char [] a, char key) { return 0; }
        static int binarySearch(char [] a, int fromIndex, int toIndex, char key) { return 0; }
        static int binarySearch(byte [] a, byte key) { return 0; }
        static int binarySearch(byte [] a, int fromIndex, int toIndex, byte key) { return 0; }
        static int binarySearch(double [] a, double key) { return 0; }
        static int binarySearch(double [] a, int fromIndex, int toIndex, double key) { return 0; }
        static int binarySearch(float [] a, float key) { return 0; }
        static int binarySearch(float [] a, int fromIndex, int toIndex, float key) { return 0; }
        static int binarySearch(Object [] a, Object key) { return 0; }
        static int binarySearch(Object [] a, int fromIndex, int toIndex, Object key) { return 0; }
        static <T> int binarySearch(T [] a, T key, Comparator<? super T> c) { return 0; }
        static <T> int binarySearch(T [] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) { return 0; }
        static boolean equals(long [] a, long [] a2) { return false; }
        static boolean equals(long [] a, int aFromIndex, int aToIndex, long [] b, int bFromIndex, int bToIndex) {
            return false;
        }
        static boolean equals(int [] a, int [] a2) { return false; }
        static boolean equals(int [] a, int aFromIndex, int aToIndex, int [] b, int bFromIndex, int bToIndex) { return false; }
        static boolean equals(short [] a, short [] a2) { return false; }
        static boolean equals(short [] a, int aFromIndex, int aToIndex, short [] b, int bFromIndex, int bToIndex) {
            return false;
        }
        static boolean equals(char [] a, char [] a2) { return false; }
        static boolean equals(char [] a, int aFromIndex, int aToIndex, char [] b, int bFromIndex, int bToIndex) {
            return false;
        }
        static boolean equals(byte [] a, byte [] a2) { return false; }
        static boolean equals(byte [] a, int aFromIndex, int aToIndex, byte [] b, int bFromIndex, int bToIndex) {
            return false;
        }
        static boolean equals(boolean [] a, boolean [] a2) { return false; }
        static boolean equals(boolean [] a, int aFromIndex, int aToIndex, boolean [] b, int bFromIndex, int bToIndex) {
            return false;
        }
        static boolean equals(double [] a, double [] a2) { return false; }
        static boolean equals(double [] a, int aFromIndex, int aToIndex, double [] b, int bFromIndex, int bToIndex) {
            return false;
        }
        static boolean equals(float [] a, float [] a2) { return false; }
        static boolean equals(float [] a, int aFromIndex, int aToIndex, float [] b, int bFromIndex, int bToIndex) {
            return false;
        }

        //frequency 1
        static boolean equals(@NotModified Object [] a, @NotModified Object [] a2) { return false; }

        static boolean equals(Object [] a, int aFromIndex, int aToIndex, Object [] b, int bFromIndex, int bToIndex) {
            return false;
        }
        static <T> boolean equals(T [] a, T [] a2, Comparator<? super T> cmp) { return false; }
        static <T> boolean equals(
            T [] a,
            int aFromIndex,
            int aToIndex,
            T [] b,
            int bFromIndex,
            int bToIndex,
            Comparator<? super T> cmp) { return false; }
        static void fill(long [] a, long val) { }
        static void fill(long [] a, int fromIndex, int toIndex, long val) { }
        static void fill(int [] a, int val) { }
        static void fill(int [] a, int fromIndex, int toIndex, int val) { }
        static void fill(short [] a, short val) { }
        static void fill(short [] a, int fromIndex, int toIndex, short val) { }
        static void fill(char [] a, char val) { }
        static void fill(char [] a, int fromIndex, int toIndex, char val) { }
        static void fill(byte [] a, byte val) { }
        static void fill(byte [] a, int fromIndex, int toIndex, byte val) { }
        static void fill(boolean [] a, boolean val) { }
        static void fill(boolean [] a, int fromIndex, int toIndex, boolean val) { }
        static void fill(double [] a, double val) { }
        static void fill(double [] a, int fromIndex, int toIndex, double val) { }
        static void fill(float [] a, float val) { }
        static void fill(float [] a, int fromIndex, int toIndex, float val) { }
        static void fill(Object [] a, Object val) { }
        static void fill(Object [] a, int fromIndex, int toIndex, Object val) { }
        static <T> T [] copyOf(T [] original, int newLength) { return null; }
        static <T, U> T [] copyOf(U [] original, int newLength, Class<? extends T []> newType) { return null; }
        static byte [] copyOf(byte [] original, int newLength) { return null; }
        static short [] copyOf(short [] original, int newLength) { return null; }
        static int [] copyOf(int [] original, int newLength) { return null; }
        static long [] copyOf(long [] original, int newLength) { return null; }
        static char [] copyOf(char [] original, int newLength) { return null; }
        static float [] copyOf(float [] original, int newLength) { return null; }
        static double [] copyOf(double [] original, int newLength) { return null; }
        static boolean [] copyOf(boolean [] original, int newLength) { return null; }
        static <T> T [] copyOfRange(T [] original, int from, int to) { return null; }
        static <T, U> T [] copyOfRange(U [] original, int from, int to, Class<? extends T []> newType) { return null; }
        static byte [] copyOfRange(byte [] original, int from, int to) { return null; }
        static short [] copyOfRange(short [] original, int from, int to) { return null; }
        static int [] copyOfRange(int [] original, int from, int to) { return null; }
        static long [] copyOfRange(long [] original, int from, int to) { return null; }
        static char [] copyOfRange(char [] original, int from, int to) { return null; }
        static float [] copyOfRange(float [] original, int from, int to) { return null; }
        static double [] copyOfRange(double [] original, int from, int to) { return null; }
        static boolean [] copyOfRange(boolean [] original, int from, int to) { return null; }
        //frequency 21
        @NotModified
        static <T> List<T> asList(@NotModified T ... a) { return null; }

        //frequency 1
        @NotModified
        static int hashCode(@NotModified long [] a) { return 0; }
        static int hashCode(int [] a) { return 0; }
        static int hashCode(short [] a) { return 0; }
        static int hashCode(char [] a) { return 0; }
        static int hashCode(byte [] a) { return 0; }
        static int hashCode(boolean [] a) { return 0; }
        static int hashCode(float [] a) { return 0; }
        static int hashCode(double [] a) { return 0; }
        //frequency 1
        @NotModified
        static int hashCode(@NotModified Object [] a) { return 0; }
        static int deepHashCode(Object [] a) { return 0; }
        static boolean deepEquals(Object [] a1, Object [] a2) { return false; }
        static String toString(long [] a) { return null; }
        static String toString(int [] a) { return null; }
        static String toString(short [] a) { return null; }
        static String toString(char [] a) { return null; }
        static String toString(byte [] a) { return null; }
        static String toString(boolean [] a) { return null; }
        static String toString(float [] a) { return null; }
        static String toString(double [] a) { return null; }
        //frequency 1
        @NotModified
        static String toString(@NotModified Object [] a) { return null; }
        static String deepToString(Object [] a) { return null; }
        static <T> void setAll(T [] array, IntFunction<? extends T> generator) { }
        static <T> void parallelSetAll(T [] array, IntFunction<? extends T> generator) { }
        static void setAll(int [] array, IntUnaryOperator generator) { }
        static void parallelSetAll(int [] array, IntUnaryOperator generator) { }
        static void setAll(long [] array, IntToLongFunction generator) { }
        static void parallelSetAll(long [] array, IntToLongFunction generator) { }
        static void setAll(double [] array, IntToDoubleFunction generator) { }
        static void parallelSetAll(double [] array, IntToDoubleFunction generator) { }
        static <T> Spliterator<T> spliterator(T [] array) { return null; }
        static <T> Spliterator<T> spliterator(T [] array, int startInclusive, int endExclusive) { return null; }
        static Spliterator.OfInt spliterator(int [] array) { return null; }
        static Spliterator.OfInt spliterator(int [] array, int startInclusive, int endExclusive) { return null; }
        static Spliterator.OfLong spliterator(long [] array) { return null; }
        static Spliterator.OfLong spliterator(long [] array, int startInclusive, int endExclusive) { return null; }
        static Spliterator.OfDouble spliterator(double [] array) { return null; }
        static Spliterator.OfDouble spliterator(double [] array, int startInclusive, int endExclusive) { return null; }
        //frequency 15
        @NotModified
        static <T> Stream<T> stream(@NotModified @Independent(hc = true) T [] array) { return null; }
        static <T> Stream<T> stream(T [] array, int startInclusive, int endExclusive) { return null; }
        static IntStream stream(int [] array) { return null; }
        static IntStream stream(int [] array, int startInclusive, int endExclusive) { return null; }
        //frequency 1
        @NotModified
        static LongStream stream(@NotModified @Independent long [] array) { return null; }
        static LongStream stream(long [] array, int startInclusive, int endExclusive) { return null; }
        static DoubleStream stream(double [] array) { return null; }
        static DoubleStream stream(double [] array, int startInclusive, int endExclusive) { return null; }
        static int compare(boolean [] a, boolean [] b) { return 0; }
        static int compare(boolean [] a, int aFromIndex, int aToIndex, boolean [] b, int bFromIndex, int bToIndex) {
            return 0;
        }
        static int compare(byte [] a, byte [] b) { return 0; }
        static int compare(byte [] a, int aFromIndex, int aToIndex, byte [] b, int bFromIndex, int bToIndex) { return 0; }
        static int compareUnsigned(byte [] a, byte [] b) { return 0; }
        static int compareUnsigned(byte [] a, int aFromIndex, int aToIndex, byte [] b, int bFromIndex, int bToIndex) {
            return 0;
        }
        static int compare(short [] a, short [] b) { return 0; }
        static int compare(short [] a, int aFromIndex, int aToIndex, short [] b, int bFromIndex, int bToIndex) { return 0; }
        static int compareUnsigned(short [] a, short [] b) { return 0; }
        static int compareUnsigned(short [] a, int aFromIndex, int aToIndex, short [] b, int bFromIndex, int bToIndex) {
            return 0;
        }
        static int compare(char [] a, char [] b) { return 0; }
        static int compare(char [] a, int aFromIndex, int aToIndex, char [] b, int bFromIndex, int bToIndex) { return 0; }
        static int compare(int [] a, int [] b) { return 0; }
        static int compare(int [] a, int aFromIndex, int aToIndex, int [] b, int bFromIndex, int bToIndex) { return 0; }
        static int compareUnsigned(int [] a, int [] b) { return 0; }
        static int compareUnsigned(int [] a, int aFromIndex, int aToIndex, int [] b, int bFromIndex, int bToIndex) {
            return 0;
        }
        static int compare(long [] a, long [] b) { return 0; }
        static int compare(long [] a, int aFromIndex, int aToIndex, long [] b, int bFromIndex, int bToIndex) { return 0; }
        static int compareUnsigned(long [] a, long [] b) { return 0; }
        static int compareUnsigned(long [] a, int aFromIndex, int aToIndex, long [] b, int bFromIndex, int bToIndex) {
            return 0;
        }
        static int compare(float [] a, float [] b) { return 0; }
        static int compare(float [] a, int aFromIndex, int aToIndex, float [] b, int bFromIndex, int bToIndex) { return 0; }
        static int compare(double [] a, double [] b) { return 0; }
        static int compare(double [] a, int aFromIndex, int aToIndex, double [] b, int bFromIndex, int bToIndex) { return 0; }
        static <T extends Comparable<? super T>> int compare(T [] a, T [] b) { return 0; }
        static <T extends Comparable<? super T>> int compare(
            T [] a,
            int aFromIndex,
            int aToIndex,
            T [] b,
            int bFromIndex,
            int bToIndex) { return 0; }
        static <T> int compare(T [] a, T [] b, Comparator<? super T> cmp) { return 0; }
        static <T> int compare(
            T [] a,
            int aFromIndex,
            int aToIndex,
            T [] b,
            int bFromIndex,
            int bToIndex,
            Comparator<? super T> cmp) { return 0; }
        static int mismatch(boolean [] a, boolean [] b) { return 0; }
        static int mismatch(boolean [] a, int aFromIndex, int aToIndex, boolean [] b, int bFromIndex, int bToIndex) {
            return 0;
        }
        static int mismatch(byte [] a, byte [] b) { return 0; }
        static int mismatch(byte [] a, int aFromIndex, int aToIndex, byte [] b, int bFromIndex, int bToIndex) { return 0; }
        static int mismatch(char [] a, char [] b) { return 0; }
        static int mismatch(char [] a, int aFromIndex, int aToIndex, char [] b, int bFromIndex, int bToIndex) { return 0; }
        static int mismatch(short [] a, short [] b) { return 0; }
        static int mismatch(short [] a, int aFromIndex, int aToIndex, short [] b, int bFromIndex, int bToIndex) { return 0; }
        static int mismatch(int [] a, int [] b) { return 0; }
        static int mismatch(int [] a, int aFromIndex, int aToIndex, int [] b, int bFromIndex, int bToIndex) { return 0; }
        static int mismatch(long [] a, long [] b) { return 0; }
        static int mismatch(long [] a, int aFromIndex, int aToIndex, long [] b, int bFromIndex, int bToIndex) { return 0; }
        static int mismatch(float [] a, float [] b) { return 0; }
        static int mismatch(float [] a, int aFromIndex, int aToIndex, float [] b, int bFromIndex, int bToIndex) { return 0; }
        static int mismatch(double [] a, double [] b) { return 0; }
        static int mismatch(double [] a, int aFromIndex, int aToIndex, double [] b, int bFromIndex, int bToIndex) { return 0; }
        static int mismatch(Object [] a, Object [] b) { return 0; }
        static int mismatch(Object [] a, int aFromIndex, int aToIndex, Object [] b, int bFromIndex, int bToIndex) { return 0; }
        static <T> int mismatch(T [] a, T [] b, Comparator<? super T> cmp) { return 0; }
        static <T> int mismatch(
            T [] a,
            int aFromIndex,
            int aToIndex,
            T [] b,
            int bFromIndex,
            int bToIndex,
            Comparator<? super T> cmp) { return 0; }
    }

    //public class Base64
    @UtilityClass
    class Base64$ {
        //public static class Decoder
        @UtilityClass
        class Decoder {
            byte [] decode(byte [] src) { return null; }
            //frequency 2
            byte [] decode(String src) { return null; }
            int decode(@NotModified byte [] src, byte [] dst) { return 0; }
            ByteBuffer decode(ByteBuffer buffer) { return null; }
            InputStream wrap(InputStream is) { return null; }
        }

        //public static class Encoder
        @UtilityClass
        class Encoder {
            byte [] encode(byte [] src) { return null; }
            int encode(byte [] src, byte [] dst) { return 0; }
            //frequency 2
            String encodeToString(byte [] src) { return null; }
            ByteBuffer encode(ByteBuffer buffer) { return null; }
            OutputStream wrap(OutputStream os) { return null; }
            Base64.Encoder withoutPadding() { return null; }
        }

        //frequency 1
        static Base64.Encoder getEncoder() { return null; }

        //frequency 1
        static Base64.Encoder getUrlEncoder() { return null; }
        static Base64.Encoder getMimeEncoder() { return null; }
        static Base64.Encoder getMimeEncoder(int lineLength, byte [] lineSeparator) { return null; }
        //frequency 1
        static Base64.Decoder getDecoder() { return null; }

        //frequency 1
        static Base64.Decoder getUrlDecoder() { return null; }
        static Base64.Decoder getMimeDecoder() { return null; }
    }

    //public interface Collection implements Iterable<E>
    @Container
    class Collection$<E> {
        //override has frequency 12
        @NotModified
        int size() { return 0; }

        //override has frequency 18
        @NotModified
        boolean isEmpty() { return false; }

        //frequency 4
        @NotModified
        boolean contains(Object object) { return false; }

        //overrides in java.lang.Iterable
        //override has frequency 2
        @NotModified
        Iterator<E> iterator() { return null; }

        //override has frequency 3
        @NotModified
        Object [] toArray() { return null; }

        //override has frequency 3
        <T> T [] toArray(@Modified @Deprecated T [] t) { return null; }
        <T> T [] toArray(IntFunction<T []> generator) { return null; }
        //frequency 2
        boolean add(@Independent(hc = true) E e) { return false; }

        //override has frequency 3
        boolean remove(@Independent(hc = true) Object object) { return false; }
        @NotModified
        boolean containsAll(@Independent(hc = true) Collection<?> collection) { return false; }
        //override has frequency 5
        boolean addAll(@Independent(hc = true) Collection<? extends E> collection) { return false; }
        boolean removeAll(@Independent(hc = true) Collection<?> collection) { return false; }
        //frequency 3
        boolean removeIf(@Independent(hc = true) Predicate<? super E> filter) { return false; }

        //override has frequency 1
        boolean retainAll(@Independent(hc = true) Collection<?> collection) { return false; }
        void clear() { }
        //overrides in java.lang.Object
        //override has frequency 1
        public boolean equals(Object object) { return false; }

        //overrides in java.lang.Object
        //override has frequency 4
        public int hashCode() { return 0; }

        //overrides in java.lang.Iterable
        Spliterator<E> spliterator() { return null; }

        //frequency 238
        @NotModified @Independent(hc = true)
        Stream<E> stream() { return null; }
        @NotModified @Independent(hc = true)
        Stream<E> parallelStream() { return null; }
    }

    //public class Collections
    @UtilityClass
    class Collections$ {
        static final Set EMPTY_SET = null;
        static final List EMPTY_LIST = null;
        static final Map EMPTY_MAP = null;
        static <T extends Comparable<? super T>> void sort(List<T> list) { }
        static <T> void sort(List<T> list, Comparator<? super T> c) { }
        static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) { return 0; }
        static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) { return 0; }
        //frequency 1
        static void reverse(List<?> list) { }

        //frequency 2
        static void shuffle(List<?> list) { }
        static void shuffle(List<?> list, Random rnd) { }
        static void shuffle(List<?> list, RandomGenerator rnd) { }
        static void swap(List<?> list, int i, int j) { }
        static <T> void fill(List<? super T> list, T obj) { }
        static <T> void copy(List<? super T> dest, List<? extends T> src) { }
        static <T extends Comparable<? super T>> T min(Collection<? extends T> coll) { return null; }
        static <T> T min(Collection<? extends T> coll, Comparator<? super T> comp) { return null; }
        static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) { return null; }
        static <T> T max(Collection<? extends T> coll, Comparator<? super T> comp) { return null; }
        static void rotate(List<?> list, int distance) { }
        static <T> boolean replaceAll(List<T> list, T oldVal, T newVal) { return false; }
        static int indexOfSubList(List<?> source, List<?> target) { return 0; }
        static int lastIndexOfSubList(List<?> source, List<?> target) { return 0; }
        static <T> Collection<T> unmodifiableCollection(Collection<? extends T> c) { return null; }
        static <T> SequencedCollection<T> unmodifiableSequencedCollection(SequencedCollection<? extends T> c) {
            return null;
        }
        static <T> Set<T> unmodifiableSet(Set<? extends T> s) { return null; }
        static <T> SequencedSet<T> unmodifiableSequencedSet(SequencedSet<? extends T> s) { return null; }
        static <T> SortedSet<T> unmodifiableSortedSet(SortedSet<T> s) { return null; }
        static <T> NavigableSet<T> unmodifiableNavigableSet(NavigableSet<T> s) { return null; }
        static <T> List<T> unmodifiableList(List<? extends T> list) { return null; }
        static <K, V> Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> m) { return null; }
        static <K, V> SequencedMap<K, V> unmodifiableSequencedMap(SequencedMap<? extends K, ? extends V> m) {
            return null;
        }
        static <K, V> SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> m) { return null; }
        static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> m) { return null; }
        static <T> Collection<T> synchronizedCollection(Collection<T> c) { return null; }
        static <T> Set<T> synchronizedSet(Set<T> s) { return null; }
        static <T> SortedSet<T> synchronizedSortedSet(SortedSet<T> s) { return null; }
        static <T> NavigableSet<T> synchronizedNavigableSet(NavigableSet<T> s) { return null; }
        static <T> List<T> synchronizedList(List<T> list) { return null; }
        static <K, V> Map<K, V> synchronizedMap(Map<K, V> m) { return null; }
        static <K, V> SortedMap<K, V> synchronizedSortedMap(SortedMap<K, V> m) { return null; }
        static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> m) { return null; }
        static <E> Collection<E> checkedCollection(Collection<E> c, Class<E> type) { return null; }
        static <E> Queue<E> checkedQueue(Queue<E> queue, Class<E> type) { return null; }
        static <E> Set<E> checkedSet(Set<E> s, Class<E> type) { return null; }
        static <E> SortedSet<E> checkedSortedSet(SortedSet<E> s, Class<E> type) { return null; }
        static <E> NavigableSet<E> checkedNavigableSet(NavigableSet<E> s, Class<E> type) { return null; }
        static <E> List<E> checkedList(List<E> list, Class<E> type) { return null; }
        static <K, V> Map<K, V> checkedMap(Map<K, V> m, Class<K> keyType, Class<V> valueType) { return null; }
        static <K, V> SortedMap<K, V> checkedSortedMap(SortedMap<K, V> m, Class<K> keyType, Class<V> valueType) {
            return null;
        }

        static <K, V> NavigableMap<K, V> checkedNavigableMap(NavigableMap<K, V> m, Class<K> keyType, Class<V> valueType) {
            return null;
        }
        static <T> Iterator<T> emptyIterator() { return null; }
        static <T> ListIterator<T> emptyListIterator() { return null; }
        static <T> Enumeration<T> emptyEnumeration() { return null; }
        //frequency 15
        static <T> Set<T> emptySet() { return null; }
        static <E> SortedSet<E> emptySortedSet() { return null; }
        static <E> NavigableSet<E> emptyNavigableSet() { return null; }
        //frequency 13
        static <T> List<T> emptyList() { return null; }

        //frequency 1
        static <K, V> Map<K, V> emptyMap() { return null; }
        static <K, V> SortedMap<K, V> emptySortedMap() { return null; }
        static <K, V> NavigableMap<K, V> emptyNavigableMap() { return null; }
        //frequency 83
        static <T> Set<T> singleton(T o) { return null; }

        //frequency 27
        static <T> List<T> singletonList(T o) { return null; }
        static <K, V> Map<K, V> singletonMap(K key, V value) { return null; }
        static <T> List<T> nCopies(int n, T o) { return null; }
        static <T> Comparator<T> reverseOrder() { return null; }
        static <T> Comparator<T> reverseOrder(Comparator<T> cmp) { return null; }
        static <T> Enumeration<T> enumeration(Collection<T> c) { return null; }
        static <T> ArrayList<T> list(Enumeration<T> e) { return null; }
        static int frequency(Collection<?> c, Object o) { return 0; }
        static boolean disjoint(Collection<?> c1, Collection<?> c2) { return false; }
        static <T> boolean addAll(Collection<? super T> c, T ... elements) { return false; }
        static <E> Set<E> newSetFromMap(Map<E, Boolean> map) { return null; }
        static <E> SequencedSet<E> newSequencedSetFromMap(SequencedMap<E, Boolean> map) { return null; }
        static <T> Queue<T> asLifoQueue(Deque<T> deque) { return null; }
    }

    //public interface Comparator
    @ImmutableContainer(hc = true)
    class Comparator$<T> {
        int compare(T t, T t1) { return 0; }
        //overrides in java.lang.Object
        public boolean equals(Object object) { return false; }

        //frequency 3
        Comparator<T> reversed() { return null; }
        Comparator<T> thenComparing(Comparator<? super T> other) { return null; }
        <U> Comparator<T> thenComparing(
            Function<? super T, ? extends U> keyExtractor,
            Comparator<? super U> keyComparator) { return null; }

        <U extends Comparable<? super U>> Comparator<T> thenComparing(Function<? super T, ? extends U> keyExtractor) {
            return null;
        }
        Comparator<T> thenComparingInt(ToIntFunction<? super T> keyExtractor) { return null; }
        Comparator<T> thenComparingLong(ToLongFunction<? super T> keyExtractor) { return null; }
        Comparator<T> thenComparingDouble(ToDoubleFunction<? super T> keyExtractor) { return null; }
        static <T extends Comparable<? super T>> Comparator<T> reverseOrder() { return null; }
        static <T extends Comparable<? super T>> Comparator<T> naturalOrder() { return null; }
        static <T> Comparator<T> nullsFirst(Comparator<? super T> comparator) { return null; }
        static <T> Comparator<T> nullsLast(Comparator<? super T> comparator) { return null; }
        static <T, U> Comparator<T> comparing(
            Function<? super T, ? extends U> keyExtractor,
            Comparator<? super U> keyComparator) { return null; }

        //frequency 11
        static <T, U extends Comparable<? super U>> Comparator<T> comparing(
            Function<? super T, ? extends U> keyExtractor) { return null; }
        static <T> Comparator<T> comparingInt(ToIntFunction<? super T> keyExtractor) { return null; }
        static <T> Comparator<T> comparingLong(ToLongFunction<? super T> keyExtractor) { return null; }
        static <T> Comparator<T> comparingDouble(ToDoubleFunction<? super T> keyExtractor) { return null; }
    }

    //public class Date implements Serializable, Cloneable, Comparable<Date>
    class Date$ {
        //frequency 7
        Date$() { }

        //frequency 1
        Date$(long date) { }
        Date$(int year, int month, int date) { }
        Date$(int year, int month, int date, int hrs, int min) { }
        Date$(int year, int month, int date, int hrs, int min, int sec) { }
        Date$(String s) { }
        //overrides in java.lang.Object
        protected Object clone() { return null; }
        static long UTC(int year, int month, int date, int hrs, int min, int sec) { return 0L; }
        static long parse(String s) { return 0L; }
        int getYear() { return 0; }
        void setYear(int year) { }
        int getMonth() { return 0; }
        void setMonth(int month) { }
        int getDate() { return 0; }
        void setDate(int date) { }
        int getDay() { return 0; }
        int getHours() { return 0; }
        void setHours(int hours) { }
        int getMinutes() { return 0; }
        void setMinutes(int minutes) { }
        int getSeconds() { return 0; }
        void setSeconds(int seconds) { }
        //frequency 1
        @NotModified
        long getTime() { return 0L; }
        void setTime(long time) { }
        boolean before(Date when) { return false; }
        boolean after(Date when) { return false; }
        //overrides in java.lang.Object
        public boolean equals(Object obj) { return false; }

        //overrides in java.lang.Comparable
        int compareTo(Date anotherDate) { return 0; }

        //overrides in java.lang.Object
        public int hashCode() { return 0; }

        //overrides in java.lang.Object
        public String toString() { return null; }
        String toLocaleString() { return null; }
        String toGMTString() { return null; }
        int getTimezoneOffset() { return 0; }
        static Date from(Instant instant) { return null; }
        Instant toInstant() { return null; }
    }

    //public interface EventListener
    class EventListener$ { }

    //public class HashMap extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
    @Container
    class HashMap$<K, V> {
        HashMap$(int initialCapacity, float loadFactor) { }
        HashMap$(int initialCapacity) { }
        //frequency 15
        HashMap$() { }
        HashMap$(@Independent(hc = true) Map<? extends K, ? extends V> m) { }
        //overrides in java.util.AbstractMap, java.util.Map
        int size() { return 0; }

        //overrides in java.util.AbstractMap, java.util.Map
        boolean isEmpty() { return false; }

        //overrides in java.util.AbstractMap, java.util.Map
        //frequency 2
        V get(Object key) { return null; }

        //overrides in java.util.AbstractMap, java.util.Map
        //frequency 2
        boolean containsKey(Object key) { return false; }

        //overrides in java.util.AbstractMap, java.util.Map
        //frequency 4
        V put(K key, V value) { return null; }

        //overrides in java.util.AbstractMap, java.util.Map
        void putAll(Map<? extends K, ? extends V> m) { }

        //overrides in java.util.AbstractMap, java.util.Map
        V remove(Object key) { return null; }

        //overrides in java.util.AbstractMap, java.util.Map
        void clear() { }

        //overrides in java.util.AbstractMap, java.util.Map
        boolean containsValue(Object value) { return false; }

        //overrides in java.util.AbstractMap, java.util.Map
        Set<K> keySet() { return null; }

        //overrides in java.util.AbstractMap, java.util.Map
        //frequency 2
        Collection<V> values() { return null; }

        //overrides in java.util.AbstractMap, java.util.Map
        Set<Map.Entry<K, V>> entrySet() { return null; }

        //overrides in java.util.Map
        V getOrDefault(Object key, V defaultValue) { return null; }

        //overrides in java.util.Map
        V putIfAbsent(K key, V value) { return null; }

        //overrides in java.util.Map
        boolean remove(Object key, Object value) { return false; }

        //overrides in java.util.Map
        boolean replace(K key, V oldValue, V newValue) { return false; }

        //overrides in java.util.Map
        V replace(K key, V value) { return null; }

        //overrides in java.util.Map
        V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) { return null; }

        //overrides in java.util.Map
        V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { return null; }

        //overrides in java.util.Map
        V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { return null; }

        //overrides in java.util.Map
        V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) { return null; }

        //overrides in java.util.Map
        void forEach(BiConsumer<? super K, ? super V> action) { }

        //overrides in java.util.Map
        void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) { }

        //overrides in java.lang.Object, java.util.AbstractMap
        protected Object clone() { return null; }
        static <K, V> HashMap<K, V> newHashMap(int numMappings) { return null; }
    }

    //public class HashSet extends AbstractSet<E> implements Set<E>, Cloneable, Serializable
    @Container
    class HashSet$<E> {
        //frequency 41
        HashSet$() { }

        //frequency 25
        HashSet$(@Independent(hc = true) Collection<? extends E> c) { }
        HashSet$(int initialCapacity, float loadFactor) { }
        HashSet$(int initialCapacity) { }
        //overrides in java.lang.Iterable, java.util.AbstractCollection, java.util.Collection, java.util.Set
        Iterator<E> iterator() { return null; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.Set
        int size() { return 0; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.Set
        boolean isEmpty() { return false; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.Set
        boolean contains(Object o) { return false; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.Set
        boolean add(E e) { return false; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.Set
        boolean remove(Object o) { return false; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.Set
        void clear() { }

        //overrides in java.lang.Object
        protected Object clone() { return null; }

        //overrides in java.lang.Iterable, java.util.Collection, java.util.Set
        Spliterator<E> spliterator() { return null; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.Set
        Object [] toArray() { return null; }

        //overrides in java.util.AbstractCollection, java.util.Collection, java.util.Set
        <T> T [] toArray(T [] a) { return null; }
        static <T> HashSet<T> newHashSet(int numElements) { return null; }
    }

    //public interface Iterator
    class Iterator$<E> {
        boolean hasNext() { return false; }
        //frequency 2
        @Independent(hc = true)
        E next() { return null; }
        void remove() { }
        void forEachRemaining(Consumer<? super E> action) { }
    }

    //public interface List implements SequencedCollection<E>
    class List$<E> {
        //overrides in java.util.Collection
        //frequency 68
        int size() { return 0; }

        //overrides in java.util.Collection
        //frequency 51
        boolean isEmpty() { return false; }

        //overrides in java.util.Collection
        //frequency 6
        boolean contains(Object object) { return false; }

        //overrides in java.lang.Iterable, java.util.Collection
        Iterator<E> iterator() { return null; }

        //overrides in java.util.Collection
        Object [] toArray() { return null; }

        //overrides in java.util.Collection
        //frequency 3
        <T> T [] toArray(T [] t) { return null; }

        //overrides in java.util.Collection
        //frequency 52
        boolean add(E e) { return false; }

        //overrides in java.util.Collection
        boolean remove(Object object) { return false; }

        //overrides in java.util.Collection
        boolean containsAll(Collection<?> collection) { return false; }

        //overrides in java.util.Collection
        //frequency 8
        boolean addAll(Collection<? extends E> collection) { return false; }
        boolean addAll(int i, Collection<? extends E> collection) { return false; }
        //overrides in java.util.Collection
        boolean removeAll(Collection<?> collection) { return false; }

        //overrides in java.util.Collection
        boolean retainAll(Collection<?> collection) { return false; }
        void replaceAll(UnaryOperator<E> operator) { }
        //frequency 4
        void sort(@Independent(hc = true) Comparator<? super E> c) { }

        //overrides in java.util.Collection
        void clear() { }

        //overrides in java.lang.Object, java.util.Collection
        public boolean equals(Object object) { return false; }

        //overrides in java.lang.Object, java.util.Collection
        //frequency 4
        public int hashCode() { return 0; }

        //frequency 5
        @NotModified @Independent(hc = true)
        E get(int i) { return null; }
        E set(int i, E e) { return null; }
        void add(int i, E e) { }
        E remove(int i) { return null; }
        int indexOf(Object object) { return 0; }
        int lastIndexOf(Object object) { return 0; }
        ListIterator<E> listIterator() { return null; }
        ListIterator<E> listIterator(int i) { return null; }
        //frequency 3
        @NotModified
        List<E> subList(int i, int i1) { return null; }

        //overrides in java.lang.Iterable, java.util.Collection
        Spliterator<E> spliterator() { return null; }

        //overrides in java.util.SequencedCollection
        void addFirst(E e) { }

        //overrides in java.util.SequencedCollection
        void addLast(E e) { }

        //overrides in java.util.SequencedCollection
        //frequency 351
        @NotModified @Independent(hc = true)
        E getFirst() { return null; }

        //overrides in java.util.SequencedCollection
        //frequency 7
        @NotModified @Independent(hc = true)
        E getLast() { return null; }

        //overrides in java.util.SequencedCollection
        E removeFirst() { return null; }

        //overrides in java.util.SequencedCollection
        E removeLast() { return null; }

        //overrides in java.util.SequencedCollection
        List<E> reversed() { return null; }

        //frequency 10
        @NotModified
        static <E> List<E> of() { return null; }

        //frequency 25
        @NotModified
        static <E> List<E> of(E e1) { return null; }

        //frequency 4
        @NotModified
        static <E> List<E> of(E e1, E e2) { return null; }
        static <E> List<E> of(E e1, E e2, E e3) { return null; }
        static <E> List<E> of(E e1, E e2, E e3, E e4) { return null; }
        static <E> List<E> of(E e1, E e2, E e3, E e4, E e5) { return null; }
        static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6) { return null; }
        static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7) { return null; }
        static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) { return null; }
        static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) { return null; }
        static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) { return null; }
        //frequency 1
        @NotModified
        static <E> List<E> of(E ... elements) { return null; }

        //frequency 6
        @NotModified
        static <E> List<E> copyOf(@Independent(hc = true) Collection<? extends E> coll) { return null; }
    }

    //public final class Locale implements Cloneable, Serializable
    class Locale$ {
        static final Locale ENGLISH = null;
        static final Locale FRENCH = null;
        static final Locale GERMAN = null;
        static final Locale ITALIAN = null;
        static final Locale JAPANESE = null;
        static final Locale KOREAN = null;
        static final Locale CHINESE = null;
        static final Locale SIMPLIFIED_CHINESE = null;
        static final Locale TRADITIONAL_CHINESE = null;
        static final Locale FRANCE = null;
        static final Locale GERMANY = null;
        static final Locale ITALY = null;
        static final Locale JAPAN = null;
        static final Locale KOREA = null;
        static final Locale UK = null;
        static final Locale US = null;
        static final Locale CANADA = null;
        static final Locale CANADA_FRENCH = null;
        static final Locale ROOT = null;
        static final Locale CHINA = null;
        static final Locale PRC = null;
        static final Locale TAIWAN = null;
        static final char PRIVATE_USE_EXTENSION = '\0';
        static final char UNICODE_LOCALE_EXTENSION = '\0';
        Locale$(String language, String country, String variant) { }
        Locale$(String language, String country) { }
        Locale$(String language) { }
        static Locale of(String language, String country, String variant) { return null; }
        static Locale of(String language, String country) { return null; }
        static Locale of(String language) { return null; }
        static Locale getDefault() { return null; }
        static Locale getDefault(Locale.Category category) { return null; }
        static void setDefault(Locale newLocale) { }
        static void setDefault(Locale.Category category, Locale newLocale) { }
        static Locale [] getAvailableLocales() { return null; }
        static Stream<Locale> availableLocales() { return null; }
        static String [] getISOCountries() { return null; }
        static Set<String> getISOCountries(Locale.IsoCountryCode type) { return null; }
        static String [] getISOLanguages() { return null; }
        //frequency 2
        @NotModified
        String getLanguage() { return null; }
        String getScript() { return null; }
        String getCountry() { return null; }
        String getVariant() { return null; }
        boolean hasExtensions() { return false; }
        Locale stripExtensions() { return null; }
        String getExtension(char key) { return null; }
        Set<Character> getExtensionKeys() { return null; }
        Set<String> getUnicodeLocaleAttributes() { return null; }
        String getUnicodeLocaleType(String key) { return null; }
        Set<String> getUnicodeLocaleKeys() { return null; }
        //overrides in java.lang.Object
        public String toString() { return null; }
        String toLanguageTag() { return null; }
        static String caseFoldLanguageTag(String languageTag) { return null; }
        //frequency 1
        @NotModified @Independent
        static Locale forLanguageTag(String languageTag) { return null; }
        String getISO3Language() { return null; }
        String getISO3Country() { return null; }
        String getDisplayLanguage() { return null; }
        String getDisplayLanguage(Locale inLocale) { return null; }
        String getDisplayScript() { return null; }
        String getDisplayScript(Locale inLocale) { return null; }
        String getDisplayCountry() { return null; }
        String getDisplayCountry(Locale inLocale) { return null; }
        String getDisplayVariant() { return null; }
        String getDisplayVariant(Locale inLocale) { return null; }
        String getDisplayName() { return null; }
        String getDisplayName(Locale inLocale) { return null; }
        //overrides in java.lang.Object
        protected Object clone() { return null; }

        //overrides in java.lang.Object
        public int hashCode() { return 0; }

        //overrides in java.lang.Object
        public boolean equals(Object obj) { return false; }

        static List<Locale> filter(
            List<Locale.LanguageRange> priorityList,
            Collection<Locale> locales,
            Locale.FilteringMode mode) { return null; }
        static List<Locale> filter(List<Locale.LanguageRange> priorityList, Collection<Locale> locales) { return null; }
        static List<String> filterTags(
            List<Locale.LanguageRange> priorityList,
            Collection<String> tags,
            Locale.FilteringMode mode) { return null; }
        static List<String> filterTags(List<Locale.LanguageRange> priorityList, Collection<String> tags) { return null; }
        static Locale lookup(List<Locale.LanguageRange> priorityList, Collection<Locale> locales) { return null; }
        static String lookupTag(List<Locale.LanguageRange> priorityList, Collection<String> tags) { return null; }
    }

    //public interface Map
    @Container
    class Map$<K, V> {
        //public interface Entry
        @Container
        class Entry<K, V> {
            //frequency 1
            @NotModified @Independent(hc = true)
            K getKey() { return null; }

            //frequency 1
            @NotModified @Independent(hc = true)
            V getValue() { return null; }
            V setValue(V v) { return null; }
            //overrides in java.lang.Object
            public boolean equals(Object object) { return false; }

            //overrides in java.lang.Object
            public int hashCode() { return 0; }
            static <K extends Comparable<? super K>, V> Comparator<Map.Entry<K, V>> comparingByKey() { return null; }
            static <K, V extends Comparable<? super V>> Comparator<Map.Entry<K, V>> comparingByValue() { return null; }
            static <K, V> Comparator<Map.Entry<K, V>> comparingByKey(Comparator<? super K> cmp) { return null; }
            static <K, V> Comparator<Map.Entry<K, V>> comparingByValue(Comparator<? super V> cmp) { return null; }
            static <K, V> Map.Entry<K, V> copyOf(Map.Entry<? extends K, ? extends V> e) { return null; }
        }
        int size() { return 0; }
        boolean isEmpty() { return false; }
        //frequency 5
        @NotModified
        boolean containsKey(Object object) { return false; }
        boolean containsValue(Object object) { return false; }
        //frequency 57
        @NotModified @Independent(hc = true)
        V get(Object object) { return null; }

        //frequency 17
        V put(K k, V v) { return null; }
        V remove(Object object) { return null; }
        void putAll(Map<? extends K, ? extends V> map) { }
        void clear() { }
        Set<K> keySet() { return null; }
        //frequency 2
        @NotModified
        Collection<V> values() { return null; }

        //frequency 1
        @NotModified
        Set<Map.Entry<K, V>> entrySet() { return null; }

        //overrides in java.lang.Object
        public boolean equals(Object object) { return false; }

        //overrides in java.lang.Object
        public int hashCode() { return 0; }
        V getOrDefault(Object key, V defaultValue) { return null; }
        //frequency 1
        @NotModified
        void forEach(@Independent(hc = true) BiConsumer<? super K, ? super V> action) { }
        void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) { }
        //frequency 1
        V putIfAbsent(K key, V value) { return null; }
        boolean remove(Object key, Object value) { return false; }
        boolean replace(K key, V oldValue, V newValue) { return false; }
        V replace(K key, V value) { return null; }
        V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) { return null; }
        V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { return null; }
        V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) { return null; }
        //frequency 2
        V merge(K key, V value, @NotModified @Independent(hc = true) BiFunction<? super V, ? super V, ? extends V> remappingFunction) { return null; }

        //frequency 2
        static <K, V> Map<K, V> of() { return null; }

        //frequency 21
        static <K, V> Map<K, V> of(K k1, V v1) { return null; }

        //frequency 6
        static <K, V> Map<K, V> of(K k1, V v1, K k2, V v2) { return null; }
        static <K, V> Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3) { return null; }
        static <K, V> Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4) { return null; }
        static <K, V> Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) { return null; }
        static <K, V> Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) { return null; }
        static <K, V> Map<K, V> of(K k1, V v1, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) { return null; }
        static <K, V> Map<K, V> of(
            K k1,
            V v1,
            K k2,
            V v2,
            K k3,
            V v3,
            K k4,
            V v4,
            K k5,
            V v5,
            K k6,
            V v6,
            K k7,
            V v7,
            K k8,
            V v8) { return null; }

        static <K, V> Map<K, V> of(
            K k1,
            V v1,
            K k2,
            V v2,
            K k3,
            V v3,
            K k4,
            V v4,
            K k5,
            V v5,
            K k6,
            V v6,
            K k7,
            V v7,
            K k8,
            V v8,
            K k9,
            V v9) { return null; }

        static <K, V> Map<K, V> of(
            K k1,
            V v1,
            K k2,
            V v2,
            K k3,
            V v3,
            K k4,
            V v4,
            K k5,
            V v5,
            K k6,
            V v6,
            K k7,
            V v7,
            K k8,
            V v8,
            K k9,
            V v9,
            K k10,
            V v10) { return null; }
        static <K, V> Map<K, V> ofEntries(Map.Entry<? extends K, ? extends V> ... entries) { return null; }
        static <K, V> Map.Entry<K, V> entry(K k, V v) { return null; }
        static <K, V> Map<K, V> copyOf(Map<? extends K, ? extends V> map) { return null; }
    }

    //public class NoSuchElementException extends RuntimeException
    class NoSuchElementException$ {
        NoSuchElementException$() { }
        NoSuchElementException$(String s, Throwable cause) { }
        NoSuchElementException$(Throwable cause) { }
        //frequency 12
        NoSuchElementException$(String s) { }
    }

    //public final class Objects
    @UtilityClass
    @Container
    class Objects$ {
        //frequency 128
        static boolean equals(Object a, Object b) { return false; }

        //frequency 1
        static boolean deepEquals(Object a, Object b) { return false; }

        //frequency 26
        static int hashCode(Object o) { return 0; }

        //frequency 20
        static int hash(Object ... values) { return 0; }
        static String toString(Object o) { return null; }
        //frequency 5
        static String toString(Object o, String nullDefault) { return null; }
        static String toIdentityString(Object o) { return null; }
        static <T> int compare(T a, T b, Comparator<? super T> c) { return 0; }
        //frequency 9
        static <T> T requireNonNull(T obj) { return null; }

        //frequency 2
        static <T> T requireNonNull(T obj, String message) { return null; }
        static boolean isNull(Object obj) { return false; }
        //frequency 1
        static boolean nonNull(Object obj) { return false; }

        //frequency 1
        static <T> T requireNonNullElse(T obj, T defaultObj) { return null; }
        static <T> T requireNonNullElseGet(T obj, Supplier<? extends T> supplier) { return null; }
        static <T> T requireNonNull(T obj, Supplier<String> messageSupplier) { return null; }
        static int checkIndex(int index, int length) { return 0; }
        static int checkFromToIndex(int fromIndex, int toIndex, int length) { return 0; }
        static int checkFromIndexSize(int fromIndex, int size, int length) { return 0; }
        static long checkIndex(long index, long l) { return 0L; }
        static long checkFromToIndex(long fromIndex, long l, long toIndex) { return 0L; }
        static long checkFromIndexSize(long fromIndex, long l, long size) { return 0L; }
    }

    //public final class Optional
    @ImmutableContainer(hc = true)
    class Optional$<T> {
        //frequency 31
        static <T> Optional<T> empty() { return null; }

        //frequency 56
        static <T> Optional<T> of(T value) { return null; }

        //frequency 11
        static <T> Optional<T> ofNullable(T value) { return null; }

        //frequency 88
        T get() { return null; }

        //frequency 31
        boolean isPresent() { return false; }

        //frequency 27
        boolean isEmpty() { return false; }

        //frequency 99
        void ifPresent(Consumer<? super T> action) { }

        //frequency 39
        void ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction) { }

        //frequency 20
        Optional<T> filter(Predicate<? super T> predicate) { return null; }

        //frequency 211
        <U> Optional<U> map(Function<? super T, ? extends U> mapper) { return null; }

        //frequency 18
        <U> Optional<U> flatMap(Function<? super T, ? extends Optional<? extends U>> mapper) { return null; }
        Optional<T> or(Supplier<? extends Optional<? extends T>> supplier) { return null; }
        //frequency 3
        Stream<T> stream() { return null; }

        //frequency 131
        T orElse(T other) { return null; }

        //frequency 16
        T orElseGet(Supplier<? extends T> supplier) { return null; }

        //frequency 54
        T orElseThrow() { return null; }

        //frequency 39
        <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) { return null; }

        //overrides in java.lang.Object
        public boolean equals(Object obj) { return false; }

        //overrides in java.lang.Object
        public int hashCode() { return 0; }

        //overrides in java.lang.Object
        public String toString() { return null; }
    }

    //public final class OptionalDouble
    @ImmutableContainer
    class OptionalDouble$ {
        static OptionalDouble empty() { return null; }
        static OptionalDouble of(double value) { return null; }
        double getAsDouble() { return 0.0; }
        boolean isPresent() { return false; }
        boolean isEmpty() { return false; }
        void ifPresent(DoubleConsumer action) { }
        void ifPresentOrElse(DoubleConsumer action, Runnable emptyAction) { }
        DoubleStream stream() { return null; }
        //frequency 1
        double orElse(double other) { return 0.0; }
        double orElseGet(DoubleSupplier supplier) { return 0.0; }
        double orElseThrow() { return 0.0; }
        <X extends Throwable> double orElseThrow(Supplier<? extends X> exceptionSupplier) { return 0.0; }
        //overrides in java.lang.Object
        public boolean equals(Object obj) { return false; }

        //overrides in java.lang.Object
        public int hashCode() { return 0; }

        //overrides in java.lang.Object
        public String toString() { return null; }
    }

    //public final class OptionalInt
    @ImmutableContainer
    class OptionalInt$ {
        static OptionalInt empty() { return null; }
        static OptionalInt of(int value) { return null; }
        int getAsInt() { return 0; }
        boolean isPresent() { return false; }
        boolean isEmpty() { return false; }
        void ifPresent(IntConsumer action) { }
        void ifPresentOrElse(IntConsumer action, Runnable emptyAction) { }
        IntStream stream() { return null; }
        //frequency 1
        int orElse(int other) { return 0; }
        int orElseGet(IntSupplier supplier) { return 0; }
        int orElseThrow() { return 0; }
        <X extends Throwable> int orElseThrow(Supplier<? extends X> exceptionSupplier) { return 0; }
        //overrides in java.lang.Object
        public boolean equals(Object obj) { return false; }

        //overrides in java.lang.Object
        public int hashCode() { return 0; }

        //overrides in java.lang.Object
        public String toString() { return null; }
    }

    //public class Random implements RandomGenerator, Serializable
    @Container
    class Random$ {
        //frequency 3
        Random$() { }
        Random$(long seed) { }
        static Random from(RandomGenerator generator) { return null; }
        void setSeed(long seed) { }
        //overrides in java.util.random.RandomGenerator
        //override has frequency 1
        void nextBytes(byte [] bytes) { }

        //overrides in java.util.random.RandomGenerator
        int nextInt() { return 0; }

        //overrides in java.util.random.RandomGenerator
        //frequency 3
        int nextInt(int bound) { return 0; }

        //overrides in java.util.random.RandomGenerator
        long nextLong() { return 0L; }

        //overrides in java.util.random.RandomGenerator
        boolean nextBoolean() { return false; }

        //overrides in java.util.random.RandomGenerator
        float nextFloat() { return 0.0F; }

        //overrides in java.util.random.RandomGenerator
        //override has frequency 1
        double nextDouble() { return 0.0; }

        //overrides in java.util.random.RandomGenerator
        double nextGaussian() { return 0.0; }

        //overrides in java.util.random.RandomGenerator
        IntStream ints(long streamSize) { return null; }

        //overrides in java.util.random.RandomGenerator
        IntStream ints() { return null; }

        //overrides in java.util.random.RandomGenerator
        IntStream ints(long streamSize, int i, int randomNumberOrigin) { return null; }

        //overrides in java.util.random.RandomGenerator
        IntStream ints(int randomNumberOrigin, int randomNumberBound) { return null; }

        //overrides in java.util.random.RandomGenerator
        LongStream longs(long streamSize) { return null; }

        //overrides in java.util.random.RandomGenerator
        LongStream longs() { return null; }

        //overrides in java.util.random.RandomGenerator
        LongStream longs(long streamSize, long l, long randomNumberOrigin) { return null; }

        //overrides in java.util.random.RandomGenerator
        LongStream longs(long randomNumberOrigin, long l) { return null; }

        //overrides in java.util.random.RandomGenerator
        DoubleStream doubles(long streamSize) { return null; }

        //overrides in java.util.random.RandomGenerator
        DoubleStream doubles() { return null; }

        //overrides in java.util.random.RandomGenerator
        DoubleStream doubles(long streamSize, double d, double randomNumberOrigin) { return null; }

        //overrides in java.util.random.RandomGenerator
        DoubleStream doubles(double randomNumberOrigin, double d) { return null; }
    }

    //public interface RandomAccess
    class RandomAccess$ { }

    //public interface SequencedCollection implements Collection<E>
    class SequencedCollection$<E> {
        SequencedCollection<E> reversed() { return null; }
        void addFirst(E e) { }
        void addLast(E e) { }
        //override has frequency 351
        E getFirst() { return null; }

        //override has frequency 7
        E getLast() { return null; }
        E removeFirst() { return null; }
        E removeLast() { return null; }
    }

    //public interface Set implements Collection<E>
    class Set$<E> {
        //overrides in java.util.Collection
        //frequency 12
        int size() { return 0; }

        //overrides in java.util.Collection
        //frequency 18
        boolean isEmpty() { return false; }

        //overrides in java.util.Collection
        //frequency 23
        boolean contains(Object object) { return false; }

        //overrides in java.lang.Iterable, java.util.Collection
        //frequency 2
        Iterator<E> iterator() { return null; }

        //overrides in java.util.Collection
        //frequency 3
        Object [] toArray() { return null; }

        //overrides in java.util.Collection
        <T> T [] toArray(T [] t) { return null; }

        //overrides in java.util.Collection
        //frequency 27
        boolean add(E e) { return false; }

        //overrides in java.util.Collection
        //frequency 3
        boolean remove(Object object) { return false; }

        //overrides in java.util.Collection
        boolean containsAll(Collection<?> collection) { return false; }

        //overrides in java.util.Collection
        //frequency 5
        boolean addAll(Collection<? extends E> collection) { return false; }

        //overrides in java.util.Collection
        //frequency 1
        boolean retainAll(Collection<?> collection) { return false; }

        //overrides in java.util.Collection
        boolean removeAll(Collection<?> collection) { return false; }

        //overrides in java.util.Collection
        void clear() { }

        //overrides in java.lang.Object, java.util.Collection
        //frequency 1
        public boolean equals(Object object) { return false; }

        //overrides in java.lang.Object, java.util.Collection
        public int hashCode() { return 0; }

        //overrides in java.lang.Iterable, java.util.Collection
        Spliterator<E> spliterator() { return null; }

        //frequency 1
        @NotModified
        static <E> Set<E> of() { return null; }

        //frequency 55
        @NotModified
        static <E> Set<E> of(E e1) { return null; }

        //frequency 14
        @NotModified
        static <E> Set<E> of(E e1, E e2) { return null; }

        //frequency 1
        @NotModified
        static <E> Set<E> of(E e1, E e2, E e3) { return null; }
        static <E> Set<E> of(E e1, E e2, E e3, E e4) { return null; }
        static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5) { return null; }
        static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6) { return null; }
        static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7) { return null; }
        static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) { return null; }
        static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) { return null; }
        static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) { return null; }
        //frequency 5
        @NotModified
        static <E> Set<E> of(E ... elements) { return null; }
        static <E> Set<E> copyOf(Collection<? extends E> coll) { return null; }
    }

    //public final class UUID implements Serializable, Comparable<UUID>
    @ImmutableContainer
    class UUID$ {
        UUID$(long mostSigBits, long l) { }
        //frequency 3
        static UUID randomUUID() { return null; }
        static UUID nameUUIDFromBytes(byte [] name) { return null; }
        static UUID fromString(String name) { return null; }
        long getLeastSignificantBits() { return 0L; }
        long getMostSignificantBits() { return 0L; }
        int version() { return 0; }
        int variant() { return 0; }
        long timestamp() { return 0L; }
        int clockSequence() { return 0; }
        long node() { return 0L; }
        //overrides in java.lang.Object
        public String toString() { return null; }

        //overrides in java.lang.Object
        public int hashCode() { return 0; }

        //overrides in java.lang.Object
        public boolean equals(Object obj) { return false; }

        //overrides in java.lang.Comparable
        int compareTo(UUID val) { return 0; }
    }
}
