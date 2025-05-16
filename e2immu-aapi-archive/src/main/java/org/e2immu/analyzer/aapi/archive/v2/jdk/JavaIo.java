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
import org.e2immu.annotation.rare.AllowsInterrupt;

public class JavaIo {
    public static final String PACKAGE_NAME = "java.io";
    //public class BufferedWriter extends Writer
    class BufferedWriter$ {
        //frequency 3
        BufferedWriter$(@NotNull Writer out) { }
        BufferedWriter$(@NotNull Writer out, int sz) { }
        //override from java.io.Writer
        void write(int c) { }

        //override from java.io.Writer
        void write(char [] cbuf, int off, int len) { }

        //override from java.io.Writer
        void write(String s, int off, int len) { }

        @AllowsInterrupt
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
        @AllowsInterrupt
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
    class FilterOutputStream$ {
        FilterOutputStream$(@NotNull OutputStream out) { }
        //override from java.io.OutputStream
        @AllowsInterrupt
        void write(int b) { }

        //override from java.io.OutputStream
        @AllowsInterrupt
        void write(byte [] b) { }

        //override from java.io.OutputStream
        @AllowsInterrupt
        void write(byte [] b, int off, int len) { }

        //override from java.io.Flushable, java.io.OutputStream
        void flush() { }

        //override from java.io.Closeable, java.io.OutputStream, java.lang.AutoCloseable
        void close() { }
    }

    //public interface Flushable
    //@Container[M]
    @Independent class Flushable$ {
        @AllowsInterrupt
        void flush() { }
    }

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
        @AllowsInterrupt
        int read() { return 0; }
        @AllowsInterrupt
        int read(byte [] b) { return 0; }
        @AllowsInterrupt
        int read(byte [] b, int off, int len) { return 0; }
        @AllowsInterrupt
        byte [] readAllBytes() { return null; }
        @AllowsInterrupt
        byte [] readNBytes(int len) { return null; }
        @AllowsInterrupt
        int readNBytes(byte [] b, int off, int len) { return 0; }
        @AllowsInterrupt
        long skip(long n) { return 0L; }
        @AllowsInterrupt
        void skipNBytes(long n) { }
        @NotModified
        int available() { return 0; }
        //override from java.io.Closeable, java.lang.AutoCloseable
        void close() { }
        @AllowsInterrupt
        void mark(int readlimit) { }
        @AllowsInterrupt
        void reset() { }
        @NotModified
        boolean markSupported() { return false; }
        @AllowsInterrupt
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
        @NotModified
        boolean checkError() { return false; }
        //override from java.io.FilterOutputStream, java.io.OutputStream
        void write(int b) { }

        //override from java.io.FilterOutputStream, java.io.OutputStream
        void write(@Independent byte [] buf, int off, int len) { }

        //override from java.io.FilterOutputStream, java.io.OutputStream
        void write(@Independent byte [] buf) { }
        @AllowsInterrupt
        void writeBytes(@Independent byte [] buf) { }
        @AllowsInterrupt
        void print(boolean b) { }
        @AllowsInterrupt
        void print(char c) { }
        @AllowsInterrupt
        void print(int i) { }
        @AllowsInterrupt
        void print(long l) { }
        @AllowsInterrupt
        void print(float f) { }
        @AllowsInterrupt
        void print(double d) { }
        @AllowsInterrupt
        void print(@NotNull @Independent char [] s) { }
        @AllowsInterrupt
        void print(String s) { }
        @AllowsInterrupt
        void print(/*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ Object obj) { }
        @AllowsInterrupt
        void println() { }
        @AllowsInterrupt
        void println(boolean x) { }
        @AllowsInterrupt
        void println(char x) { }
        @AllowsInterrupt
        void println(int x) { }
        @AllowsInterrupt
        void println(long x) { }
        @AllowsInterrupt
        void println(float x) { }
        @AllowsInterrupt
        void println(double x) { }
        @AllowsInterrupt
        void println(@NotNull @Independent char [] x) { }
        //frequency 8
        @AllowsInterrupt
        void println(String x) { }
        @AllowsInterrupt
        void println(/*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ Object x) { }
        @AllowsInterrupt
        PrintStream printf(String format, @Independent Object ... args) { return null; }
        @AllowsInterrupt
        PrintStream printf(Locale l, String format, @Independent Object ... args) { return null; }
        @AllowsInterrupt
        PrintStream format(String format, @Independent Object ... args) { return null; }
        @AllowsInterrupt
        PrintStream format(Locale l, String format, @Independent Object ... args) { return null; }
        //override from java.lang.Appendable
        //@Independent[H]
        @AllowsInterrupt
        PrintStream append(/*@Immutable(hc=true)[T] @Independent[H] @NotModified[T]*/ @Independent CharSequence csq) { return null; }

        //override from java.lang.Appendable
        //@Independent[H]
        @AllowsInterrupt
        PrintStream append(
            /*@Immutable(hc=true)[T] @Independent[H] @NotModified[T]*/ @Independent CharSequence csq,
            int start,
            int end) { return null; }

        //override from java.lang.Appendable
        //@Independent[H]
        @AllowsInterrupt
        PrintStream append(char c) { return null; }
        @NotModified
        Charset charset() { return null; }
    }

    //public interface Serializable
    //@Container[M]
    @ImmutableContainer
    class Serializable$ { }

    //public abstract class Writer implements Appendable, Closeable, Flushable
    @Independent
    class Writer$ {
        @NotModified @NotNull
        static Writer nullWriter() { return null; }
        @AllowsInterrupt
        void write(int c) { }
        @AllowsInterrupt
        void write(@NotNull char [] cbuf) { }
        @AllowsInterrupt
        void write(@NotNull char [] c, int i, int i1) { }
        //frequency 4
        @AllowsInterrupt
        void write(String str) { }
        @AllowsInterrupt
        void write(String str, int off, int len) { }
        //override from java.lang.Appendable
        //@Independent[H]
        @AllowsInterrupt
        Writer append(/*@Immutable(hc=true)[T] @Independent[H] @NotModified[T]*/ @NotNull CharSequence csq) { return null; }

        //override from java.lang.Appendable
        //@Independent[H]
        @AllowsInterrupt
        Writer append(/*@Immutable(hc=true)[T] @Independent[H] @NotModified[T]*/ @NotNull CharSequence csq, int start, int end) {
            return null;
        }

        //override from java.lang.Appendable
        //@Independent[H]
        @AllowsInterrupt
        Writer append(char c) { return null; }

        //override from java.io.Flushable
        void flush() { }

        //override from java.io.Closeable, java.lang.AutoCloseable
        void close() { }
    }
}
