package org.e2immu.analyzer.aapi.archive.v2.jdk;
import java.io.*;
import java.net.URI;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Path;
import java.util.Locale;

import org.e2immu.annotation.ImmutableContainer;
import org.e2immu.annotation.Independent;
import org.e2immu.annotation.NotModified;
import org.e2immu.annotation.NotNull;

public class JavaIo {
    public static final String PACKAGE_NAME = "java.io";
    //public class BufferedWriter extends Writer
    @Independent
    class BufferedWriter$ {
        //frequency 3
        BufferedWriter$(Writer out) { }
        BufferedWriter$(Writer out, int sz) { }
        //override from java.io.Writer
        void write(int c) { }

        //override from java.io.Writer
        void write(char [] cbuf, int off, int len) { }

        //override from java.io.Writer
        void write(String s, int off, int len) { }
        void newLine() { }
        //override from java.io.Flushable, java.io.Writer
        void flush() { }

        //override from java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        void close() { }
    }

    //public class ByteArrayInputStream extends InputStream
    @Independent
    class ByteArrayInputStream$ {
        //frequency 1
        ByteArrayInputStream$(@NotModified @NotNull byte [] buf) { }
        ByteArrayInputStream$(@NotModified @NotNull byte [] buf, int offset, int length) { }
        //override from java.io.InputStream
        int read() { return 0; }

        //override from java.io.InputStream
        int read(byte [] b, int off, int len) { return 0; }

        //override from java.io.InputStream
        @NotNull
        byte [] readAllBytes() { return null; }

        //override from java.io.InputStream
        int readNBytes(@NotNull byte [] b, int off, int len) { return 0; }

        //override from java.io.InputStream
        long transferTo(@NotNull OutputStream out) { return 0L; }

        //override from java.io.InputStream
        long skip(long n) { return 0L; }

        //override from java.io.InputStream
        @NotModified
        int available() { return 0; }

        //override from java.io.InputStream
        @NotModified
        boolean markSupported() { return false; }

        //override from java.io.InputStream
        void mark(int readAheadLimit) { }

        //override from java.io.InputStream
        void reset() { }

        //override from java.io.Closeable, java.io.InputStream, java.lang.AutoCloseable
        void close() { }
    }

    //public class ByteArrayOutputStream extends OutputStream
    @Independent
    class ByteArrayOutputStream$ {
        //frequency 1
        ByteArrayOutputStream$() { }
        ByteArrayOutputStream$(int size) { }
        //override from java.io.OutputStream
        void write(int b) { }

        //override from java.io.OutputStream
        void write(@NotNull byte [] b, int off, int len) { }
        void writeBytes(@NotNull byte [] b) { }
        void writeTo(@NotNull OutputStream out) { }
        void reset() { }
        //frequency 1
        @NotNull
        @NotModified
        byte [] toByteArray() { return null; }
        int size() { return 0; }
        //override from java.lang.Object
        //@NotModified[H] @NotNull[H]
        public String toString() { return null; }
        String toString(String charsetName) { return null; }
        String toString(Charset charset) { return null; }
        String toString(int hibyte) { return null; }
        //override from java.io.Closeable, java.io.OutputStream, java.lang.AutoCloseable
        void close() { }
    }

    //public interface Closeable implements AutoCloseable
    //@Container[M]
    @Independent
    class Closeable$ {
        //override from java.lang.AutoCloseable
        void close() { }
    }

    //public class File implements Serializable, Comparable<File>
    @Independent
    class File$ {
        static final char separatorChar = '\0';
        static final String separator = null;
        static final char pathSeparatorChar = '\0';
        static final String pathSeparator = null;
        //frequency 8
        File$(String pathname) { }
        File$(String parent, String child) { }
        //frequency 3
        File$(File parent, String child) { }
        File$(URI uri) { }
        //frequency 1
        @NotModified
        String getName() { return null; }
        @NotModified
        String getParent() { return null; }
        @NotModified
        File getParentFile() { return null; }
        @NotModified
        String getPath() { return null; }
        @NotModified
        boolean isAbsolute() { return false; }
        //frequency 1
        @NotModified
        String getAbsolutePath() { return null; }

        //frequency 3
        @NotModified
        File getAbsoluteFile() { return null; }
        @NotModified
        String getCanonicalPath() { return null; }
        @NotModified
        File getCanonicalFile() { return null; }
        URL toURL() { return null; }
        @NotModified
        URI toURI() { return null; }
        @NotModified
        boolean canRead() { return false; }
        @NotModified
        boolean canWrite() { return false; }
        //frequency 6
        @NotModified
        boolean exists() { return false; }

        //frequency 2
        @NotModified
        boolean isDirectory() { return false; }

        //frequency 1
        @NotModified
        boolean isFile() { return false; }
        @NotModified
        boolean isHidden() { return false; }
        @NotModified
        long lastModified() { return 0L; }
        @NotModified
        long length() { return 0L; }
        boolean createNewFile() { return false; }
        //frequency 3
        boolean delete() { return false; }
        void deleteOnExit() { }
        @NotModified
        String [] list() { return null; }
        @NotModified
        String [] list(FilenameFilter filter) { return null; }
        @NotModified
        File [] listFiles() { return null; }
        @NotModified
        File [] listFiles(FilenameFilter filter) { return null; }
        @NotModified
        File [] listFiles(FileFilter filter) { return null; }
        boolean mkdir() { return false; }
        boolean mkdirs() { return false; }
        //frequency 1
        boolean renameTo(File dest) { return false; }
        boolean setLastModified(long time) { return false; }
        boolean setReadOnly() { return false; }
        boolean setWritable(boolean writable, boolean ownerOnly) { return false; }
        boolean setWritable(boolean writable) { return false; }
        boolean setReadable(boolean readable, boolean ownerOnly) { return false; }
        boolean setReadable(boolean readable) { return false; }
        boolean setExecutable(boolean executable, boolean ownerOnly) { return false; }
        boolean setExecutable(boolean executable) { return false; }
        @NotModified
        boolean canExecute() { return false; }
        @NotModified
        static File [] listRoots() { return null; }
        @NotModified
        long getTotalSpace() { return 0L; }
        @NotModified
        long getFreeSpace() { return 0L; }
        @NotModified
        long getUsableSpace() { return 0L; }
        static File createTempFile(String prefix, String suffix, File directory) { return null; }
        static File createTempFile(String prefix, String suffix) { return null; }
        //override from java.lang.Comparable
        //@NotModified[H]
        int compareTo(/*@Independent[M] @NotModified[H] @NotNull[H]*/ File pathname) { return 0; }

        //override from java.lang.Object
        //@NotModified[H]
        public boolean equals(/*@Immutable(hc=true)[T] @Independent[M] @NotModified[T]*/ Object obj) { return false; }

        //override from java.lang.Object
        //@NotModified[H]
        public int hashCode() { return 0; }

        //override from java.lang.Object
        //@NotModified[H] @NotNull[H]
        public String toString() { return null; }

        //frequency 1
        @NotModified
        Path toPath() { return null; }
    }

    //public class FileInputStream extends InputStream
    @Independent
    class FileInputStream$ {
        //frequency 1
        FileInputStream$(String name) { }
        FileInputStream$(File file) { }
        FileInputStream$(FileDescriptor fdObj) { }
        //override from java.io.InputStream
        int read() { return 0; }

        //override from java.io.InputStream
        int read(byte [] b) { return 0; }

        //override from java.io.InputStream
        int read(byte [] b, int off, int len) { return 0; }

        //override from java.io.InputStream
        byte [] readAllBytes() { return null; }

        //override from java.io.InputStream
        byte [] readNBytes(int len) { return null; }

        //override from java.io.InputStream
        long transferTo(OutputStream out) { return 0L; }

        //override from java.io.InputStream
        long skip(long n) { return 0L; }

        //override from java.io.InputStream
        int available() { return 0; }

        //override from java.io.Closeable, java.io.InputStream, java.lang.AutoCloseable
        void close() { }
        FileDescriptor getFD() { return null; }
        FileChannel getChannel() { return null; }
    }

    //public class FileWriter extends OutputStreamWriter
    @Independent
    class FileWriter$ {
        FileWriter$(String fileName) { }
        FileWriter$(String fileName, boolean append) { }
        //frequency 3
        FileWriter$(File file) { }
        FileWriter$(File file, boolean append) { }
        FileWriter$(FileDescriptor fd) { }
        FileWriter$(String fileName, Charset charset) { }
        FileWriter$(String fileName, Charset charset, boolean append) { }
        FileWriter$(File file, Charset charset) { }
        FileWriter$(File file, Charset charset, boolean append) { }
    }

    //public class FilterOutputStream extends OutputStream
    @Independent
    class FilterOutputStream$ {
        FilterOutputStream$(OutputStream out) { }
        //override from java.io.OutputStream
        void write(int b) { }

        //override from java.io.OutputStream
        void write(byte [] b) { }

        //override from java.io.OutputStream
        void write(byte [] b, int off, int len) { }

        //override from java.io.Flushable, java.io.OutputStream
        void flush() { }

        //override from java.io.Closeable, java.io.OutputStream, java.lang.AutoCloseable
        void close() { }
    }

    //public interface Flushable
    //@Container[M]
    @Independent class Flushable$ {void flush() { } }

    //public class IOException extends Exception
    class IOException$ {
        IOException$() { }
        //frequency 5
        IOException$(String message) { }
        IOException$(String message, Throwable cause) { }
        IOException$(Throwable cause) { }
    }

    //public abstract class InputStream implements Closeable
    @Independent
    class InputStream$ {
        InputStream$() { }
        static InputStream nullInputStream() { return null; }
        int read() { return 0; }
        int read(byte [] b) { return 0; }
        int read(byte [] b, int off, int len) { return 0; }
        byte [] readAllBytes() { return null; }
        byte [] readNBytes(int len) { return null; }
        int readNBytes(byte [] b, int off, int len) { return 0; }
        long skip(long n) { return 0L; }
        void skipNBytes(long n) { }
        int available() { return 0; }
        //override from java.io.Closeable, java.lang.AutoCloseable
        void close() { }
        void mark(int readlimit) { }
        void reset() { }
        boolean markSupported() { return false; }
        long transferTo(OutputStream out) { return 0L; }
    }

    //public abstract class OutputStream implements Closeable, Flushable
    @Independent
    class OutputStream$ {
        //override has frequency 1
        OutputStream$() { }
        static OutputStream nullOutputStream() { return null; }
        void write(int i) { }
        void write(byte [] b) { }
        void write(byte [] b, int off, int len) { }
        //override from java.io.Flushable
        void flush() { }

        //override from java.io.Closeable, java.lang.AutoCloseable
        void close() { }
    }

    //public class OutputStreamWriter extends Writer
    class OutputStreamWriter$ {
        OutputStreamWriter$(OutputStream out, String charsetName) { }
        OutputStreamWriter$(OutputStream out) { }
        OutputStreamWriter$(OutputStream out, Charset cs) { }
        OutputStreamWriter$(OutputStream out, CharsetEncoder enc) { }
        String getEncoding() { return null; }
        //override from java.io.Writer
        void write(int c) { }

        //override from java.io.Writer
        void write(char [] cbuf, int off, int len) { }

        //override from java.io.Writer
        void write(String str, int off, int len) { }

        //override from java.io.Writer, java.lang.Appendable
        //@Independent[H]

        Writer append(/*@Immutable(hc=true)[T] @Independent[H] @NotModified[T]*/ CharSequence csq, int start, int end) {
            return null;
        }

        //override from java.io.Writer, java.lang.Appendable
        //@Independent[H]
        Writer append(/*@Immutable(hc=true)[T] @Independent[H] @NotModified[T]*/ CharSequence csq) { return null; }

        //override from java.io.Flushable, java.io.Writer
        void flush() { }

        //override from java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        void close() { }
    }

    //public class PrintStream extends FilterOutputStream implements Appendable, Closeable
    class PrintStream$ {
        PrintStream$(OutputStream out) { }
        PrintStream$(OutputStream out, boolean autoFlush) { }
        PrintStream$(OutputStream out, boolean autoFlush, String encoding) { }
        PrintStream$(OutputStream out, boolean autoFlush, Charset charset) { }
        PrintStream$(String fileName) { }
        PrintStream$(String fileName, String csn) { }
        PrintStream$(String fileName, Charset charset) { }
        PrintStream$(File file) { }
        PrintStream$(File file, String csn) { }
        PrintStream$(File file, Charset charset) { }
        //override from java.io.FilterOutputStream, java.io.Flushable, java.io.OutputStream
        void flush() { }

        //override from java.io.Closeable, java.io.FilterOutputStream, java.io.OutputStream, java.lang.AutoCloseable
        void close() { }
        boolean checkError() { return false; }
        //override from java.io.FilterOutputStream, java.io.OutputStream
        void write(int b) { }

        //override from java.io.FilterOutputStream, java.io.OutputStream
        void write(byte [] buf, int off, int len) { }

        //override from java.io.FilterOutputStream, java.io.OutputStream
        void write(byte [] buf) { }
        void writeBytes(byte [] buf) { }
        void print(boolean b) { }
        void print(char c) { }
        void print(int i) { }
        void print(long l) { }
        void print(float f) { }
        void print(double d) { }
        void print(char [] s) { }
        void print(String s) { }
        void print(/*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ Object obj) { }
        void println() { }
        void println(boolean x) { }
        void println(char x) { }
        void println(int x) { }
        void println(long x) { }
        void println(float x) { }
        void println(double x) { }
        void println(char [] x) { }
        //frequency 8
        void println(String x) { }
        void println(/*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ Object x) { }
        PrintStream printf(String format, Object ... args) { return null; }
        PrintStream printf(Locale l, String format, Object ... args) { return null; }
        PrintStream format(String format, Object ... args) { return null; }
        PrintStream format(Locale l, String format, Object ... args) { return null; }
        //override from java.lang.Appendable
        //@Independent[H]
        PrintStream append(/*@Immutable(hc=true)[T] @Independent[H] @NotModified[T]*/ CharSequence csq) { return null; }

        //override from java.lang.Appendable
        //@Independent[H]

        PrintStream append(
            /*@Immutable(hc=true)[T] @Independent[H] @NotModified[T]*/ CharSequence csq,
            int start,
            int end) { return null; }

        //override from java.lang.Appendable
        //@Independent[H]
        PrintStream append(char c) { return null; }
        Charset charset() { return null; }
    }

    //public interface Serializable
    //@Container[M]
    @ImmutableContainer
    class Serializable$ { }

    //public abstract class Writer implements Appendable, Closeable, Flushable
    @Independent
    class Writer$ {
        static Writer nullWriter() { return null; }
        void write(int c) { }
        void write(char [] cbuf) { }
        void write(char [] c, int i, int i1) { }
        //frequency 4
        void write(String str) { }
        void write(String str, int off, int len) { }
        //override from java.lang.Appendable
        //@Independent[H]
        Writer append(/*@Immutable(hc=true)[T] @Independent[H] @NotModified[T]*/ CharSequence csq) { return null; }

        //override from java.lang.Appendable
        //@Independent[H]

        Writer append(/*@Immutable(hc=true)[T] @Independent[H] @NotModified[T]*/ CharSequence csq, int start, int end) {
            return null;
        }

        //override from java.lang.Appendable
        //@Independent[H]
        Writer append(char c) { return null; }

        //override from java.io.Flushable
        void flush() { }

        //override from java.io.Closeable, java.lang.AutoCloseable
        void close() { }
    }
}
