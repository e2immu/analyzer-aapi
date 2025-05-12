package org.e2immu.analyzer.aapi.archive.v2;
import org.e2immu.annotation.*;
import org.e2immu.annotation.rare.StaticSideEffects;
import org.e2immu.annotation.type.UtilityClass;

import java.io.Console;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.constant.ClassDesc;
import java.lang.constant.DynamicConstantDesc;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.AccessFlag;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.RecordComponent;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URL;
import java.nio.channels.Channel;
import java.nio.charset.Charset;
import java.security.ProtectionDomain;
import java.time.Duration;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class JavaLang {
    public static final String PACKAGE_NAME = "java.lang";
    //public interface Appendable
    class Appendable$ {
        Appendable append(CharSequence charSequence) { return null; }
        Appendable append(CharSequence charSequence, int i, int i1) { return null; }
        Appendable append(char c) { return null; }
    }

    //public class AssertionError extends Error
    class AssertionError$ {
        AssertionError$() { }
        AssertionError$(Object detailMessage) { }
        AssertionError$(boolean detailMessage) { }
        AssertionError$(char detailMessage) { }
        AssertionError$(int detailMessage) { }
        AssertionError$(long detailMessage) { }
        AssertionError$(float detailMessage) { }
        AssertionError$(double detailMessage) { }
        AssertionError$(String message, Throwable cause) { }
    }

    //public interface AutoCloseable
    class AutoCloseable$ { void close() { } }

    //public final class Boolean implements Serializable, Comparable<Boolean>, Constable
    @ImmutableContainer
    class Boolean$ {
        static final Boolean TRUE = null;
        static final Boolean FALSE = null;
        static final Class<Boolean> TYPE = null;
        Boolean$(boolean value) { }
        Boolean$(String s) { }
        //frequency 1
        static boolean parseBoolean(String s) { return false; }
        boolean booleanValue() { return false; }
        static Boolean valueOf(boolean b) { return null; }
        static Boolean valueOf(String s) { return null; }
        static String toString(boolean b) { return null; }
        //overrides in java.lang.Object
        public String toString() { return null; }

        //overrides in java.lang.Object
        public int hashCode() { return 0; }
        static int hashCode(boolean value) { return 0; }
        //overrides in java.lang.Object
        //frequency 7
        public boolean equals(Object obj) { return false; }
        static boolean getBoolean(String name) { return false; }
        //overrides in java.lang.Comparable
        int compareTo(Boolean b) { return 0; }
        static int compare(boolean x, boolean y) { return 0; }
        static boolean logicalAnd(boolean a, boolean b) { return false; }
        static boolean logicalOr(boolean a, boolean b) { return false; }
        static boolean logicalXor(boolean a, boolean b) { return false; }
        //overrides in java.lang.constant.Constable
        Optional<DynamicConstantDesc<Boolean>> describeConstable() { return null; }
    }

    //public interface CharSequence
    @ImmutableContainer(hc = true)
    class CharSequence$ {
        //override has frequency 17
        int length() { return 0; }
        char charAt(int i) { return '\0'; }
        //override has frequency 21
        boolean isEmpty() { return false; }

        //override has frequency 1
        CharSequence subSequence(int i, int i1) { return null; }

        //overrides in java.lang.Object
        //override has frequency 3
        public String toString() { return null; }
        IntStream chars() { return null; }
        IntStream codePoints() { return null; }
        static int compare(CharSequence cs1, CharSequence cs2) { return 0; }
    }

    //public final class Class implements Serializable, GenericDeclaration, Type, AnnotatedElement, TypeDescriptor.OfField<Class<?>>, Constable
    @ImmutableContainer
    class Class$<T> {
        //overrides in java.lang.Object
        public String toString() { return null; }
        String toGenericString() { return null; }
        static Class<?> forName(String className) { return null; }
        static Class<?> forName(String name, boolean initialize, ClassLoader loader) { return null; }
        static Class<?> forName(Module module, String name) { return null; }
        static Class<?> forPrimitiveName(String primitiveName) { return null; }
        T newInstance() { return null; }
        boolean isInstance(Object object) { return false; }
        boolean isAssignableFrom(Class<?> class0) { return false; }
        boolean isInterface() { return false; }
        //overrides in java.lang.invoke.TypeDescriptor.OfField
        boolean isArray() { return false; }

        //overrides in java.lang.invoke.TypeDescriptor.OfField
        boolean isPrimitive() { return false; }
        boolean isAnnotation() { return false; }
        boolean isSynthetic() { return false; }
        String getName() { return null; }
        ClassLoader getClassLoader() { return null; }
        Module getModule() { return null; }
        //overrides in java.lang.reflect.GenericDeclaration
        TypeVariable<Class<T>> [] getTypeParameters() { return null; }
        Class<? super T> getSuperclass() { return null; }
        Type getGenericSuperclass() { return null; }
        Package getPackage() { return null; }
        String getPackageName() { return null; }
        Class<?> [] getInterfaces() { return null; }
        Type [] getGenericInterfaces() { return null; }
        Class<?> getComponentType() { return null; }
        int getModifiers() { return 0; }
        Set<AccessFlag> accessFlags() { return null; }
        Object [] getSigners() { return null; }
        Method getEnclosingMethod() { return null; }
        Constructor<?> getEnclosingConstructor() { return null; }
        Class<?> getDeclaringClass() { return null; }
        Class<?> getEnclosingClass() { return null; }
        String getSimpleName() { return null; }
        //overrides in java.lang.reflect.Type
        String getTypeName() { return null; }
        String getCanonicalName() { return null; }
        boolean isAnonymousClass() { return false; }
        boolean isLocalClass() { return false; }
        boolean isMemberClass() { return false; }
        Class<?> [] getClasses() { return null; }
        Field [] getFields() { return null; }
        Method [] getMethods() { return null; }
        Constructor<?> [] getConstructors() { return null; }
        Field getField(String name) { return null; }
        Method getMethod(String name, Class<?> ... parameterTypes) { return null; }
        Constructor<T> getConstructor(Class<?> ... parameterTypes) { return null; }
        Class<?> [] getDeclaredClasses() { return null; }
        Field [] getDeclaredFields() { return null; }
        RecordComponent [] getRecordComponents() { return null; }
        Method [] getDeclaredMethods() { return null; }
        Constructor<?> [] getDeclaredConstructors() { return null; }
        Field getDeclaredField(String name) { return null; }
        Method getDeclaredMethod(String name, Class<?> ... parameterTypes) { return null; }
        Constructor<T> getDeclaredConstructor(Class<?> ... parameterTypes) { return null; }
        InputStream getResourceAsStream(String name) { return null; }
        //frequency 1
        URL getResource(String name) { return null; }
        ProtectionDomain getProtectionDomain() { return null; }
        boolean desiredAssertionStatus() { return false; }
        boolean isEnum() { return false; }
        boolean isRecord() { return false; }
        T [] getEnumConstants() { return null; }
        //frequency 1
        T cast(Object obj) { return null; }
        <U> Class<? extends U> asSubclass(Class<U> clazz) { return null; }
        //overrides in java.lang.reflect.AnnotatedElement
        <A extends Annotation> A getAnnotation(Class<A> annotationClass) { return null; }

        //overrides in java.lang.reflect.AnnotatedElement
        boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) { return false; }

        //overrides in java.lang.reflect.AnnotatedElement
        <A extends Annotation> A [] getAnnotationsByType(Class<A> annotationClass) { return null; }

        //overrides in java.lang.reflect.AnnotatedElement
        Annotation [] getAnnotations() { return null; }

        //overrides in java.lang.reflect.AnnotatedElement
        <A extends Annotation> A getDeclaredAnnotation(Class<A> annotationClass) { return null; }

        //overrides in java.lang.reflect.AnnotatedElement
        <A extends Annotation> A [] getDeclaredAnnotationsByType(Class<A> annotationClass) { return null; }

        //overrides in java.lang.reflect.AnnotatedElement
        Annotation [] getDeclaredAnnotations() { return null; }
        AnnotatedType getAnnotatedSuperclass() { return null; }
        AnnotatedType [] getAnnotatedInterfaces() { return null; }
        Class<?> getNestHost() { return null; }
        boolean isNestmateOf(Class<?> c) { return false; }
        Class<?> [] getNestMembers() { return null; }
        //overrides in java.lang.invoke.TypeDescriptor
        String descriptorString() { return null; }

        //overrides in java.lang.invoke.TypeDescriptor.OfField
        Class<?> componentType() { return null; }

        //overrides in java.lang.invoke.TypeDescriptor.OfField
        Class<?> arrayType() { return null; }

        //overrides in java.lang.constant.Constable
        Optional<ClassDesc> describeConstable() { return null; }
        boolean isHidden() { return false; }
        Class<?> [] getPermittedSubclasses() { return null; }
        boolean isSealed() { return false; }
    }

    //public interface Cloneable
    class Cloneable$ { }

    //public interface Comparable
    @ImmutableContainer(hc = true)
    class Comparable$<T> {
        //override has frequency 1
        int compareTo(T t) { return 0; }
    }

    //public final class Double extends Number implements Comparable<Double>, Constable, ConstantDesc
    @ImmutableContainer
    class Double$ {
        static final double POSITIVE_INFINITY = 0.0;
        static final double NEGATIVE_INFINITY = 0.0;
        static final double NaN = 0.0;
        static final double MAX_VALUE = 0.0;
        static final double MIN_NORMAL = 0.0;
        static final double MIN_VALUE = 0.0;
        static final int SIZE = 0;
        static final int PRECISION = 0;
        static final int MAX_EXPONENT = 0;
        static final int MIN_EXPONENT = 0;
        static final int BYTES = 0;
        static final Class<Double> TYPE = null;
        Double$(double value) { }
        Double$(String s) { }
        static String toString(double d) { return null; }
        static String toHexString(double d) { return null; }
        static Double valueOf(String s) { return null; }
        static Double valueOf(double d) { return null; }
        static double parseDouble(String s) { return 0.0; }
        static boolean isNaN(double v) { return false; }
        static boolean isInfinite(double v) { return false; }
        static boolean isFinite(double d) { return false; }
        boolean isNaN() { return false; }
        boolean isInfinite() { return false; }
        //overrides in java.lang.Object
        public String toString() { return null; }

        //overrides in java.lang.Number
        byte byteValue() { return 0; }

        //overrides in java.lang.Number
        short shortValue() { return 0; }

        //overrides in java.lang.Number
        int intValue() { return 0; }

        //overrides in java.lang.Number
        long longValue() { return 0L; }

        //overrides in java.lang.Number
        float floatValue() { return 0.0F; }

        //overrides in java.lang.Number
        double doubleValue() { return 0.0; }

        //overrides in java.lang.Object
        public int hashCode() { return 0; }
        static int hashCode(double value) { return 0; }
        //overrides in java.lang.Object
        public boolean equals(Object obj) { return false; }
        static long doubleToLongBits(double value) { return 0L; }
        static long doubleToRawLongBits(double d) { return 0L; }
        static double longBitsToDouble(long l) { return 0.0; }
        //overrides in java.lang.Comparable
        //frequency 1
        int compareTo(Double anotherDouble) { return 0; }
        static int compare(double d1, double d) { return 0; }
        static double sum(double a, double d) { return 0.0; }
        static double max(double a, double d) { return 0.0; }
        static double min(double a, double d) { return 0.0; }
        //overrides in java.lang.constant.Constable
        Optional<Double> describeConstable() { return null; }

        //overrides in java.lang.constant.ConstantDesc
        Double resolveConstantDesc(MethodHandles.Lookup lookup) { return null; }
    }

    //public abstract class Enum implements Constable, Comparable<E>, Serializable
    @ImmutableContainer(hc = true)
    class Enum$<E extends Enum<E>> {
        //frequency 2
        String name() { return null; }

        //frequency 1
        int ordinal() { return 0; }

        //overrides in java.lang.Object
        //frequency 22
        public String toString() { return null; }

        //overrides in java.lang.Object
        //frequency 23
        public boolean equals(Object other) { return false; }

        //overrides in java.lang.Object
        public int hashCode() { return 0; }

        //overrides in java.lang.Comparable
        int compareTo(E o) { return 0; }
        Class<E> getDeclaringClass() { return null; }
        //overrides in java.lang.constant.Constable
        Optional<Enum.EnumDesc<E>> describeConstable() { return null; }
        static <T extends Enum<T>> T valueOf(Class<T> enumClass, String name) { return null; }
    }

    //public class Error extends Throwable
    class Error$ {
        Error$() { }
        //override has frequency 7
        Error$(String message) { }
        Error$(String message, Throwable cause) { }
        Error$(Throwable cause) { }
    }

    //public class Exception extends Throwable
    class Exception$ {
        //override has frequency 1
        Exception$() { }

        //override has frequency 8
        Exception$(String message) { }

        //override has frequency 1
        Exception$(String message, Throwable cause) { }

        //override has frequency 4
        Exception$(Throwable cause) { }
    }

    //public final class Float extends Number implements Comparable<Float>, Constable, ConstantDesc
    @ImmutableContainer
    class Float$ {
        static final float POSITIVE_INFINITY = 0.0F;
        static final float NEGATIVE_INFINITY = 0.0F;
        static final float NaN = 0.0F;
        static final float MAX_VALUE = 0.0F;
        static final float MIN_NORMAL = 0.0F;
        static final float MIN_VALUE = 0.0F;
        static final int SIZE = 0;
        static final int PRECISION = 0;
        static final int MAX_EXPONENT = 0;
        static final int MIN_EXPONENT = 0;
        static final int BYTES = 0;
        static final Class<Float> TYPE = null;
        Float$(float value) { }
        Float$(double value) { }
        Float$(String s) { }
        static String toString(float f) { return null; }
        static String toHexString(float f) { return null; }
        static Float valueOf(String s) { return null; }
        static Float valueOf(float f) { return null; }
        //frequency 2
        static float parseFloat(String s) { return 0.0F; }
        static boolean isNaN(float v) { return false; }
        static boolean isInfinite(float v) { return false; }
        static boolean isFinite(float f) { return false; }
        boolean isNaN() { return false; }
        boolean isInfinite() { return false; }
        //overrides in java.lang.Object
        public String toString() { return null; }

        //overrides in java.lang.Number
        byte byteValue() { return 0; }

        //overrides in java.lang.Number
        short shortValue() { return 0; }

        //overrides in java.lang.Number
        int intValue() { return 0; }

        //overrides in java.lang.Number
        long longValue() { return 0L; }

        //overrides in java.lang.Number
        float floatValue() { return 0.0F; }

        //overrides in java.lang.Number
        double doubleValue() { return 0.0; }

        //overrides in java.lang.Object
        public int hashCode() { return 0; }
        static int hashCode(float value) { return 0; }
        //overrides in java.lang.Object
        public boolean equals(Object obj) { return false; }
        static int floatToIntBits(float value) { return 0; }
        static int floatToRawIntBits(float f) { return 0; }
        static float intBitsToFloat(int i) { return 0.0F; }
        static float float16ToFloat(short floatBinary16) { return 0.0F; }
        static short floatToFloat16(float f) { return 0; }
        //overrides in java.lang.Comparable
        int compareTo(Float anotherFloat) { return 0; }
        static int compare(float f1, float f2) { return 0; }
        static float sum(float a, float b) { return 0.0F; }
        static float max(float a, float b) { return 0.0F; }
        static float min(float a, float b) { return 0.0F; }
        //overrides in java.lang.constant.Constable
        Optional<Float> describeConstable() { return null; }

        //overrides in java.lang.constant.ConstantDesc
        Float resolveConstantDesc(MethodHandles.Lookup lookup) { return null; }
    }

    //public class IllegalArgumentException extends RuntimeException
    class IllegalArgumentException$ {
        IllegalArgumentException$() { }
        //frequency 12
        IllegalArgumentException$(String s) { }

        //frequency 2
        IllegalArgumentException$(String message, Throwable cause) { }
        IllegalArgumentException$(Throwable cause) { }
    }

    //public class IllegalStateException extends RuntimeException
    class IllegalStateException$ {
        IllegalStateException$() { }
        //frequency 9
        IllegalStateException$(String s) { }

        //frequency 1
        IllegalStateException$(String message, Throwable cause) { }

        //frequency 4
        IllegalStateException$(Throwable cause) { }
    }

    //public final class Integer extends Number implements Comparable<Integer>, Constable, ConstantDesc
    @ImmutableContainer
    class Integer$ {
        static final int MIN_VALUE = 0;
        static final int MAX_VALUE = 0;
        static final Class<Integer> TYPE = null;
        static final int SIZE = 0;
        static final int BYTES = 0;
        Integer$(int value) { }
        Integer$(String s) { }
        static String toString(int i, int radix) { return null; }
        static String toUnsignedString(int i, int radix) { return null; }
        static String toHexString(int i) { return null; }
        static String toOctalString(int i) { return null; }
        static String toBinaryString(int i) { return null; }
        //frequency 2
        static String toString(int i) { return null; }
        static String toUnsignedString(int i) { return null; }
        static int parseInt(String s, int radix) { return 0; }
        static int parseInt(CharSequence s, int beginIndex, int endIndex, int radix) { return 0; }
        //frequency 13
        static int parseInt(String s) { return 0; }
        static int parseUnsignedInt(String s, int radix) { return 0; }
        static int parseUnsignedInt(CharSequence s, int beginIndex, int endIndex, int radix) { return 0; }
        static int parseUnsignedInt(String s) { return 0; }
        static Integer valueOf(String s, int radix) { return null; }
        static Integer valueOf(String s) { return null; }
        static Integer valueOf(int i) { return null; }
        //overrides in java.lang.Number
        byte byteValue() { return 0; }

        //overrides in java.lang.Number
        short shortValue() { return 0; }

        //overrides in java.lang.Number
        int intValue() { return 0; }

        //overrides in java.lang.Number
        //frequency 1
        long longValue() { return 0L; }

        //overrides in java.lang.Number
        float floatValue() { return 0.0F; }

        //overrides in java.lang.Number
        double doubleValue() { return 0.0; }

        //overrides in java.lang.Object
        //frequency 1
        public String toString() { return null; }

        //overrides in java.lang.Object
        public int hashCode() { return 0; }
        static int hashCode(int value) { return 0; }
        //overrides in java.lang.Object
        //frequency 1
        public boolean equals(Object obj) { return false; }
        static Integer getInteger(String nm) { return null; }
        static Integer getInteger(String nm, int val) { return null; }
        static Integer getInteger(String nm, Integer val) { return null; }
        static Integer decode(String nm) { return null; }
        //overrides in java.lang.Comparable
        int compareTo(Integer anotherInteger) { return 0; }
        static int compare(int x, int y) { return 0; }
        static int compareUnsigned(int x, int y) { return 0; }
        static long toUnsignedLong(int x) { return 0L; }
        static int divideUnsigned(int dividend, int divisor) { return 0; }
        static int remainderUnsigned(int dividend, int divisor) { return 0; }
        static int highestOneBit(int i) { return 0; }
        static int lowestOneBit(int i) { return 0; }
        static int numberOfLeadingZeros(int i) { return 0; }
        static int numberOfTrailingZeros(int i) { return 0; }
        static int bitCount(int i) { return 0; }
        static int rotateLeft(int i, int distance) { return 0; }
        static int rotateRight(int i, int distance) { return 0; }
        static int reverse(int i) { return 0; }
        static int compress(int i, int mask) { return 0; }
        static int expand(int i, int mask) { return 0; }
        static int signum(int i) { return 0; }
        static int reverseBytes(int i) { return 0; }
        static int sum(int a, int b) { return 0; }
        static int max(int a, int b) { return 0; }
        static int min(int a, int b) { return 0; }
        //overrides in java.lang.constant.Constable
        Optional<Integer> describeConstable() { return null; }

        //overrides in java.lang.constant.ConstantDesc
        Integer resolveConstantDesc(MethodHandles.Lookup lookup) { return null; }
    }

    //public interface Iterable
    @Container
    class Iterable$<T> {
        //override has frequency 2
        @NotModified
        Iterator<T> iterator() { return null; }

        //frequency 69
        @NotModified
        @Independent(hc = true)
        void forEach(Consumer<? super T> action) { }
        Spliterator<T> spliterator() { return null; }
    }

    //public final class Long extends Number implements Comparable<Long>, Constable, ConstantDesc
    @ImmutableContainer
    class Long$ {
        static final long MIN_VALUE = 0L;
        static final long MAX_VALUE = 0L;
        static final Class<Long> TYPE = null;
        static final int SIZE = 0;
        static final int BYTES = 0;
        Long$(long value) { }
        Long$(String s) { }
        static String toString(long i, int i1) { return null; }
        static String toUnsignedString(long i, int i1) { return null; }
        static String toHexString(long i) { return null; }
        static String toOctalString(long i) { return null; }
        static String toBinaryString(long i) { return null; }
        //frequency 2
        static String toString(long i) { return null; }
        static String toUnsignedString(long i) { return null; }
        static long parseLong(String s, int radix) { return 0L; }
        static long parseLong(CharSequence s, int beginIndex, int endIndex, int radix) { return 0L; }
        //frequency 7
        static long parseLong(String s) { return 0L; }
        static long parseUnsignedLong(String s, int radix) { return 0L; }
        static long parseUnsignedLong(CharSequence s, int beginIndex, int endIndex, int radix) { return 0L; }
        static long parseUnsignedLong(String s) { return 0L; }
        static Long valueOf(String s, int radix) { return null; }
        //frequency 1
        static Long valueOf(String s) { return null; }
        static Long valueOf(long l) { return null; }
        static Long decode(String nm) { return null; }
        //overrides in java.lang.Number
        byte byteValue() { return 0; }

        //overrides in java.lang.Number
        short shortValue() { return 0; }

        //overrides in java.lang.Number
        //frequency 3
        int intValue() { return 0; }

        //overrides in java.lang.Number
        long longValue() { return 0L; }

        //overrides in java.lang.Number
        float floatValue() { return 0.0F; }

        //overrides in java.lang.Number
        double doubleValue() { return 0.0; }

        //overrides in java.lang.Object
        //frequency 112
        public String toString() { return null; }

        //overrides in java.lang.Object
        public int hashCode() { return 0; }
        static int hashCode(long value) { return 0; }
        //overrides in java.lang.Object
        //frequency 46
        public boolean equals(Object obj) { return false; }
        static Long getLong(String nm) { return null; }
        static Long getLong(String nm, long val) { return null; }
        static Long getLong(String nm, Long val) { return null; }
        //overrides in java.lang.Comparable
        int compareTo(Long anotherLong) { return 0; }

        //frequency 1
        static int compare(long x, long l) { return 0; }
        static int compareUnsigned(long x, long l) { return 0; }
        static long divideUnsigned(long dividend, long l) { return 0L; }
        static long remainderUnsigned(long dividend, long l) { return 0L; }
        static long highestOneBit(long i) { return 0L; }
        static long lowestOneBit(long i) { return 0L; }
        static int numberOfLeadingZeros(long i) { return 0; }
        static int numberOfTrailingZeros(long i) { return 0; }
        static int bitCount(long i) { return 0; }
        static long rotateLeft(long i, int i1) { return 0L; }
        static long rotateRight(long i, int i1) { return 0L; }
        static long reverse(long i) { return 0L; }
        static long compress(long i, long l) { return 0L; }
        static long expand(long i, long l) { return 0L; }
        static int signum(long i) { return 0; }
        static long reverseBytes(long i) { return 0L; }
        static long sum(long a, long l) { return 0L; }
        static long max(long a, long l) { return 0L; }
        static long min(long a, long l) { return 0L; }
        //overrides in java.lang.constant.Constable
        Optional<Long> describeConstable() { return null; }

        //overrides in java.lang.constant.ConstantDesc
        Long resolveConstantDesc(MethodHandles.Lookup lookup) { return null; }
    }

    //public final class Math
    @UtilityClass
    class Math$ {
        static final double E = 0.0;
        static final double PI = 0.0;
        static final double TAU = 0.0;
        static double sin(double a) { return 0.0; }
        static double cos(double a) { return 0.0; }
        static double tan(double a) { return 0.0; }
        static double asin(double a) { return 0.0; }
        static double acos(double a) { return 0.0; }
        static double atan(double a) { return 0.0; }
        static double toRadians(double angdeg) { return 0.0; }
        static double toDegrees(double angrad) { return 0.0; }
        static double exp(double a) { return 0.0; }
        static double log(double a) { return 0.0; }
        static double log10(double a) { return 0.0; }
        static double sqrt(double a) { return 0.0; }
        static double cbrt(double a) { return 0.0; }
        static double IEEEremainder(double f1, double d) { return 0.0; }
        static double ceil(double a) { return 0.0; }
        static double floor(double a) { return 0.0; }
        static double rint(double a) { return 0.0; }
        static double atan2(double y, double d) { return 0.0; }
        static double pow(double a, double d) { return 0.0; }
        static int round(float a) { return 0; }
        static long round(double a) { return 0L; }
        static double random() { return 0.0; }
        static int addExact(int x, int y) { return 0; }
        static long addExact(long x, long l) { return 0L; }
        static int subtractExact(int x, int y) { return 0; }
        static long subtractExact(long x, long l) { return 0L; }
        static int multiplyExact(int x, int y) { return 0; }
        static long multiplyExact(long x, int i) { return 0L; }
        static long multiplyExact(long x, long l) { return 0L; }
        static int divideExact(int x, int y) { return 0; }
        static long divideExact(long x, long l) { return 0L; }
        static int floorDivExact(int x, int y) { return 0; }
        static long floorDivExact(long x, long l) { return 0L; }
        static int ceilDivExact(int x, int y) { return 0; }
        static long ceilDivExact(long x, long l) { return 0L; }
        static int incrementExact(int a) { return 0; }
        static long incrementExact(long a) { return 0L; }
        static int decrementExact(int a) { return 0; }
        static long decrementExact(long a) { return 0L; }
        static int negateExact(int a) { return 0; }
        static long negateExact(long a) { return 0L; }
        static int toIntExact(long value) { return 0; }
        static long multiplyFull(int x, int y) { return 0L; }
        static long multiplyHigh(long x, long l) { return 0L; }
        static long unsignedMultiplyHigh(long x, long l) { return 0L; }
        static int floorDiv(int x, int y) { return 0; }
        static long floorDiv(long x, int i) { return 0L; }
        static long floorDiv(long x, long l) { return 0L; }
        static int floorMod(int x, int y) { return 0; }
        static int floorMod(long x, int i) { return 0; }
        static long floorMod(long x, long l) { return 0L; }
        static int ceilDiv(int x, int y) { return 0; }
        static long ceilDiv(long x, int i) { return 0L; }
        static long ceilDiv(long x, long l) { return 0L; }
        static int ceilMod(int x, int y) { return 0; }
        static int ceilMod(long x, int i) { return 0; }
        static long ceilMod(long x, long l) { return 0L; }
        static int abs(int a) { return 0; }
        static int absExact(int a) { return 0; }
        //frequency 1
        static long abs(long a) { return 0L; }
        static long absExact(long a) { return 0L; }
        static float abs(float a) { return 0.0F; }
        static double abs(double a) { return 0.0; }
        //frequency 2
        static int max(int a, int b) { return 0; }
        static long max(long a, long l) { return 0L; }
        static float max(float a, float b) { return 0.0F; }
        static double max(double a, double d) { return 0.0; }
        //frequency 3
        static int min(int a, int b) { return 0; }
        static long min(long a, long l) { return 0L; }
        static float min(float a, float b) { return 0.0F; }
        static double min(double a, double d) { return 0.0; }
        static int clamp(long value, int i, int min) { return 0; }
        static long clamp(long value, long l, long min) { return 0L; }
        static double clamp(double value, double d, double min) { return 0.0; }
        static float clamp(float value, float min, float max) { return 0.0F; }
        static double fma(double a, double d, double b) { return 0.0; }
        static float fma(float a, float b, float c) { return 0.0F; }
        static double ulp(double d) { return 0.0; }
        static float ulp(float f) { return 0.0F; }
        static double signum(double d) { return 0.0; }
        static float signum(float f) { return 0.0F; }
        static double sinh(double x) { return 0.0; }
        static double cosh(double x) { return 0.0; }
        static double tanh(double x) { return 0.0; }
        static double hypot(double x, double d) { return 0.0; }
        static double expm1(double x) { return 0.0; }
        static double log1p(double x) { return 0.0; }
        static double copySign(double magnitude, double d) { return 0.0; }
        static float copySign(float magnitude, float sign) { return 0.0F; }
        static int getExponent(float f) { return 0; }
        static int getExponent(double d) { return 0; }
        static double nextAfter(double start, double d) { return 0.0; }
        static float nextAfter(float start, double direction) { return 0.0F; }
        static double nextUp(double d) { return 0.0; }
        static float nextUp(float f) { return 0.0F; }
        static double nextDown(double d) { return 0.0; }
        static float nextDown(float f) { return 0.0F; }
        static double scalb(double d, int i) { return 0.0; }
        static float scalb(float f, int scaleFactor) { return 0.0F; }
    }

    //public abstract class Number implements Serializable
    @ImmutableContainer(hc = true)
    class Number$ {
        //override has frequency 2
        Number$() { }

        //override has frequency 3
        int intValue() { return 0; }

        //override has frequency 1
        long longValue() { return 0L; }
        float floatValue() { return 0.0F; }
        double doubleValue() { return 0.0; }
        byte byteValue() { return 0; }
        short shortValue() { return 0; }
    }

    //public class Object
    @ImmutableContainer(hc = true)
    class Object$ {
        //override has frequency 1
        Object$() { }

        //frequency 242
        public Class<?> getClass$() { return null; }

        //frequency 113
        public int hashCode() { return 0; }

        //frequency 1
        public boolean equals(Object obj) { return false; }

        //frequency 10
        public String toString() { return null; }
        public void notify$() { }
        public void notifyAll$() { }
        public void wait$() { }
        public void wait$(long timeoutMillis) { }
        public void wait$(long timeoutMillis, int i) { }
    }

    //public interface Runnable
    class Runnable$ { void run() { } }

    //public class RuntimeException extends Exception
    class RuntimeException$ {
        //frequency 1
        RuntimeException$() { }

        //frequency 8
        RuntimeException$(String message) { }

        //override has frequency 1
        RuntimeException$(String message, Throwable cause) { }

        //frequency 3
        RuntimeException$(Throwable cause) { }
    }

    //public final class String implements Serializable, Comparable<String>, CharSequence, Constable, ConstantDesc
    @ImmutableContainer
    class String$ {
        static final Comparator<String> CASE_INSENSITIVE_ORDER = null;
        String$() { }
        String$(String original) { }
        String$(char [] value) { }
        String$(char [] value, int offset, int count) { }
        String$(int [] codePoints, int offset, int count) { }
        String$(byte [] ascii, int hibyte, int offset, int count) { }
        String$(byte [] ascii, int hibyte) { }
        String$(byte [] bytes, int offset, int length, String charsetName) { }
        String$(byte [] bytes, int offset, int length, Charset charset) { }
        String$(byte [] bytes, String charsetName) { }
        String$(byte [] bytes, Charset charset) { }
        String$(byte [] bytes, int offset, int length) { }
        String$(byte [] bytes) { }
        String$(StringBuffer buffer) { }
        String$(StringBuilder builder) { }
        //overrides in java.lang.CharSequence
        //frequency 17
        int length() { return 0; }

        //overrides in java.lang.CharSequence
        //frequency 21
        boolean isEmpty() { return false; }

        //overrides in java.lang.CharSequence
        char charAt(int index) { return '\0'; }
        int codePointAt(int index) { return 0; }
        int codePointBefore(int index) { return 0; }
        int codePointCount(int beginIndex, int endIndex) { return 0; }
        int offsetByCodePoints(int index, int codePointOffset) { return 0; }
        void getChars(int srcBegin, int srcEnd, char [] dst, int dstBegin) { }
        void getBytes(int srcBegin, int srcEnd, byte [] dst, int dstBegin) { }
        byte [] getBytes(String charsetName) { return null; }
        //frequency 1
        byte [] getBytes(Charset charset) { return null; }

        //frequency 2
        byte [] getBytes() { return null; }

        //overrides in java.lang.Object
        //frequency 40
        public boolean equals(Object anObject) { return false; }
        boolean contentEquals(StringBuffer sb) { return false; }
        boolean contentEquals(CharSequence cs) { return false; }
        //frequency 13
        boolean equalsIgnoreCase(String anotherString) { return false; }

        //overrides in java.lang.Comparable
        int compareTo(String anotherString) { return 0; }
        int compareToIgnoreCase(String str) { return 0; }
        boolean regionMatches(int toffset, String other, int ooffset, int len) { return false; }
        boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) { return false; }
        boolean startsWith(String prefix, int toffset) { return false; }
        //frequency 4
        boolean startsWith(String prefix) { return false; }

        //frequency 2
        boolean endsWith(String suffix) { return false; }

        //overrides in java.lang.Object
        //frequency 3
        public int hashCode() { return 0; }
        int indexOf(int ch) { return 0; }
        int indexOf(int ch, int fromIndex) { return 0; }
        int indexOf(int ch, int beginIndex, int endIndex) { return 0; }
        int lastIndexOf(int ch) { return 0; }
        int lastIndexOf(int ch, int fromIndex) { return 0; }
        //frequency 1
        int indexOf(String str) { return 0; }
        int indexOf(String str, int fromIndex) { return 0; }
        int indexOf(String str, int beginIndex, int endIndex) { return 0; }
        int lastIndexOf(String str) { return 0; }
        int lastIndexOf(String str, int fromIndex) { return 0; }
        //frequency 2
        String substring(int beginIndex) { return null; }

        //frequency 6
        String substring(int beginIndex, int endIndex) { return null; }

        //overrides in java.lang.CharSequence
        //frequency 1
        CharSequence subSequence(int beginIndex, int endIndex) { return null; }

        //frequency 1
        String concat(String str) { return null; }

        //frequency 2
        String replace(char oldChar, char newChar) { return null; }

        //frequency 1
        boolean matches(String regex) { return false; }

        //frequency 6
        boolean contains(CharSequence s) { return false; }
        String replaceFirst(String regex, String replacement) { return null; }
        //frequency 7
        String replaceAll(String regex, String replacement) { return null; }

        //frequency 8
        String replace(CharSequence target, CharSequence replacement) { return null; }
        String [] split(String regex, int limit) { return null; }
        String [] splitWithDelimiters(String regex, int limit) { return null; }
        //frequency 9
        String [] split(String regex) { return null; }
        static String join(CharSequence delimiter, CharSequence ... elements) { return null; }
        static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) { return null; }
        //frequency 3
        String toLowerCase(Locale locale) { return null; }

        //frequency 36
        String toLowerCase() { return null; }
        String toUpperCase(Locale locale) { return null; }
        //frequency 3
        String toUpperCase() { return null; }

        //frequency 14
        String trim() { return null; }
        String strip() { return null; }
        String stripLeading() { return null; }
        String stripTrailing() { return null; }
        //frequency 8
        boolean isBlank() { return false; }
        Stream<String> lines() { return null; }
        String indent(int n) { return null; }
        String stripIndent() { return null; }
        String translateEscapes() { return null; }
        <R> R transform(Function<? super String, ? extends R> f) { return null; }
        //overrides in java.lang.CharSequence, java.lang.Object
        public String toString() { return null; }

        //overrides in java.lang.CharSequence
        IntStream chars() { return null; }

        //overrides in java.lang.CharSequence
        IntStream codePoints() { return null; }
        char [] toCharArray() { return null; }
        static String format(String format, Object ... args) { return null; }
        static String format(Locale l, String format, Object ... args) { return null; }
        //frequency 37
        String formatted(Object ... args) { return null; }

        //frequency 1
        static String valueOf(Object obj) { return null; }
        static String valueOf(char [] data) { return null; }
        static String valueOf(char [] data, int offset, int count) { return null; }
        static String copyValueOf(char [] data, int offset, int count) { return null; }
        static String copyValueOf(char [] data) { return null; }
        //frequency 3
        static String valueOf(boolean b) { return null; }
        static String valueOf(char c) { return null; }
        //frequency 15
        static String valueOf(int i) { return null; }

        //frequency 6
        static String valueOf(long l) { return null; }

        //frequency 7
        static String valueOf(float f) { return null; }
        static String valueOf(double d) { return null; }
        String intern() { return null; }
        String repeat(int count) { return null; }
        //overrides in java.lang.constant.Constable
        Optional<String> describeConstable() { return null; }

        //overrides in java.lang.constant.ConstantDesc
        String resolveConstantDesc(MethodHandles.Lookup lookup) { return null; }
    }

    //public final class StringBuilder extends AbstractStringBuilder implements Appendable, Serializable, Comparable<StringBuilder>, CharSequence
    @Container
    class StringBuilder$ {
        //frequency 3
        StringBuilder$() { }
        StringBuilder$(int capacity) { }
        StringBuilder$(String str) { }
        StringBuilder$(CharSequence seq) { }
        //overrides in java.lang.Comparable
        int compareTo(StringBuilder another) { return 0; }

        //overrides in java.lang.AbstractStringBuilder
        //frequency 3
        StringBuilder append(Object obj) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        //frequency 6
        StringBuilder append(String str) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder append(StringBuffer sb) { return null; }

        //overrides in java.lang.AbstractStringBuilder, java.lang.Appendable
        StringBuilder append(CharSequence s) { return null; }

        //overrides in java.lang.AbstractStringBuilder, java.lang.Appendable
        StringBuilder append(CharSequence s, int start, int end) { return null; }

        //overrides in java.lang.AbstractStringBuilder, java.lang.Appendable
        StringBuilder append(char [] str) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder append(char [] str, int offset, int len) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder append(boolean b) { return null; }

        //overrides in java.lang.AbstractStringBuilder, java.lang.Appendable
        StringBuilder append(char c) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder append(int i) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        //frequency 1
        StringBuilder append(long lng) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder append(float f) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder append(double d) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder appendCodePoint(int codePoint) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder delete(int start, int end) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder deleteCharAt(int index) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder replace(int start, int end, String str) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder insert(int index, char [] str, int offset, int len) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder insert(int offset, Object obj) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder insert(int offset, String str) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder insert(int offset, char [] str) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder insert(int dstOffset, CharSequence s) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder insert(int dstOffset, CharSequence s, int start, int end) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder insert(int offset, boolean b) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder insert(int offset, char c) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder insert(int offset, int i) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder insert(int offset, long l) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder insert(int offset, float f) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder insert(int offset, double d) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        int indexOf(String str) { return 0; }

        //overrides in java.lang.AbstractStringBuilder
        int indexOf(String str, int fromIndex) { return 0; }

        //overrides in java.lang.AbstractStringBuilder
        int lastIndexOf(String str) { return 0; }

        //overrides in java.lang.AbstractStringBuilder
        int lastIndexOf(String str, int fromIndex) { return 0; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder reverse() { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder repeat(int codePoint, int count) { return null; }

        //overrides in java.lang.AbstractStringBuilder
        StringBuilder repeat(CharSequence cs, int count) { return null; }

        //overrides in java.lang.AbstractStringBuilder, java.lang.CharSequence, java.lang.Object
        //frequency 3
        @NotModified
        public String toString() { return null; }
    }

    //public final class System
    @UtilityClass
    class System$ {
        static final InputStream in = null;
        static final PrintStream out = null;
        static final PrintStream err = null;
        static void setIn(InputStream in) { }
        static void setOut(PrintStream out) { }
        static void setErr(PrintStream err) { }
        static Console console() { return null; }
        static Channel inheritedChannel() { return null; }
        //static void setSecurityManager(SecurityManager sm) { }
        //static SecurityManager getSecurityManager() { return null; }
        //frequency 4
        @StaticSideEffects
        static long currentTimeMillis() { return 0L; }
        static long nanoTime() { return 0L; }
        static void arraycopy(Object object, int i, Object object1, int i1, int i2) { }
        static int identityHashCode(Object object) { return 0; }
        static Properties getProperties() { return null; }
        static String lineSeparator() { return null; }
        static void setProperties(Properties props) { }
        //frequency 2
        @NotModified
        static String getProperty(String key) { return null; }
        static String getProperty(String key, String def) { return null; }
        static String setProperty(String key, String value) { return null; }
        static String clearProperty(String key) { return null; }
        //frequency 1
        @NotModified
        static String getenv(String name) { return null; }
        static Map<String, String> getenv() { return null; }
        static System.Logger getLogger(String name) { return null; }
        static System.Logger getLogger(String name, ResourceBundle bundle) { return null; }
        //frequency 1
        @StaticSideEffects
        static void exit(int status) { }
        static void gc() { }
        static void runFinalization() { }
        static void load(String filename) { }
        static void loadLibrary(String libname) { }
        static String mapLibraryName(String string) { return null; }
    }

    //public class Thread implements Runnable
    class Thread$ {
        static final int MIN_PRIORITY = 0;
        static final int NORM_PRIORITY = 0;
        static final int MAX_PRIORITY = 0;
        Thread$() { }
        Thread$(Runnable task) { }
        Thread$(ThreadGroup group, Runnable task) { }
        Thread$(String name) { }
        Thread$(ThreadGroup group, String name) { }
        Thread$(Runnable task, String name) { }
        Thread$(ThreadGroup group, Runnable task, String name) { }
        Thread$(ThreadGroup group, Runnable task, String name, long stackSize) { }
        Thread$(ThreadGroup group, Runnable task, String name, long stackSize, boolean b) { }
        //frequency 3
        @NotModified
        static Thread currentThread() { return null; }
        static void yield() { }
        //frequency 2
        @StaticSideEffects
        static void sleep(long millis) { }
        static void sleep(long millis, int i) { }
        static void sleep(Duration duration) { }
        static void onSpinWait() { }
        static Thread.Builder.OfPlatform ofPlatform() { return null; }
        static Thread.Builder.OfVirtual ofVirtual() { return null; }
        static Thread startVirtualThread(Runnable task) { return null; }
        boolean isVirtual() { return false; }
        void start() { }
        //overrides in java.lang.Runnable
        void run() { }
        void stop() { }
        //frequency 3
        @StaticSideEffects
        void interrupt() { }
        static boolean interrupted() { return false; }
        boolean isInterrupted() { return false; }
        boolean isAlive() { return false; }
        void setPriority(int newPriority) { }
        int getPriority() { return 0; }
        void setName(String name) { }
        String getName() { return null; }
        ThreadGroup getThreadGroup() { return null; }
        static int activeCount() { return 0; }
        static int enumerate(Thread [] tarray) { return 0; }
        void join(long millis) { }
        void join(long millis, int i) { }
        void join() { }
        boolean join(Duration duration) { return false; }
        static void dumpStack() { }
        void setDaemon(boolean on) { }
        boolean isDaemon() { return false; }
        void checkAccess() { }
        //overrides in java.lang.Object
        public String toString() { return null; }
        ClassLoader getContextClassLoader() { return null; }
        void setContextClassLoader(ClassLoader cl) { }
        static boolean holdsLock(Object object) { return false; }
        StackTraceElement [] getStackTrace() { return null; }
        static Map<Thread, StackTraceElement []> getAllStackTraces() { return null; }
        long getId() { return 0L; }
        long threadId() { return 0L; }
        Thread.State getState() { return null; }
        static void setDefaultUncaughtExceptionHandler(Thread.UncaughtExceptionHandler ueh) { }
        static Thread.UncaughtExceptionHandler getDefaultUncaughtExceptionHandler() { return null; }
        Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() { return null; }
        void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler ueh) { }
    }

    //public class Throwable implements Serializable
    class Throwable$ {
        //override has frequency 1
        Throwable$() { }

        //override has frequency 8
        Throwable$(String message) { }

        //override has frequency 1
        Throwable$(String message, Throwable cause) { }

        //override has frequency 4
        Throwable$(Throwable cause) { }

        //frequency 17
        @NotModified
        String getMessage() { return null; }
        String getLocalizedMessage() { return null; }
        //frequency 7
        @NotModified
        Throwable getCause() { return null; }
        Throwable initCause(Throwable cause) { return null; }
        public String toString() { return null; }
        void printStackTrace() { }
        void printStackTrace(PrintStream s) { }
        void printStackTrace(PrintWriter s) { }
        Throwable fillInStackTrace() { return null; }
        StackTraceElement [] getStackTrace() { return null; }
        void setStackTrace(StackTraceElement [] stackTrace) { }
        void addSuppressed(Throwable exception) { }
        Throwable [] getSuppressed() { return null; }
    }
}
