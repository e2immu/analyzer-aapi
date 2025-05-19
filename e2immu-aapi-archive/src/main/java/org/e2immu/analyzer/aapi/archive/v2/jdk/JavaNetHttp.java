package org.e2immu.analyzer.aapi.archive.v2.jdk;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.Flow;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class JavaNetHttp {
    public static final String PACKAGE_NAME = "java.net.http";
    //public abstract class HttpRequest
    class HttpRequest$ {
        //public interface BodyPublisher implements Flow.Publisher<ByteBuffer>
        //@Container[M]
        class BodyPublisher {long contentLength() { return 0L; } }

        //public static class BodyPublishers
        class BodyPublishers {
            //@Independent[T]
            static HttpRequest.BodyPublisher fromPublisher(Flow.Publisher<? extends ByteBuffer> publisher) {
                return null;
            }

            //@Independent[T]
            static HttpRequest.BodyPublisher fromPublisher(
                Flow.Publisher<? extends ByteBuffer> publisher,
                long contentLength) { return null; }

            //@Independent[T]
            static HttpRequest.BodyPublisher ofString(String body) { return null; }

            //@Independent[T]
            static HttpRequest.BodyPublisher ofString(String s, Charset charset) { return null; }

            //@Independent[T]
            static HttpRequest.BodyPublisher ofInputStream(
                /*@IgnoreModifications[T]*/ Supplier<? extends InputStream> streamSupplier) { return null; }

            //@Independent[T]
            static HttpRequest.BodyPublisher ofByteArray(byte [] buf) { return null; }

            //@Independent[T]
            static HttpRequest.BodyPublisher ofByteArray(byte [] buf, int offset, int length) { return null; }

            //@Independent[T]
            static HttpRequest.BodyPublisher ofFile(
                /*@Immutable(hc=true)[T] @Independent(hc=true)[T] @NotModified[T]*/ Path path) { return null; }

            //@Independent[T]
            static HttpRequest.BodyPublisher ofByteArrays(Iterable<byte []> iter) { return null; }

            //@Independent[T]
            static HttpRequest.BodyPublisher noBody() { return null; }

            //@Independent[T]
            static HttpRequest.BodyPublisher concat(HttpRequest.BodyPublisher ... publishers) { return null; }
        }

        //public interface Builder
        class Builder {
            HttpRequest.Builder uri(URI uRI) { return null; }
            HttpRequest.Builder expectContinue(boolean b) { return null; }
            HttpRequest.Builder version(HttpClient.Version version) { return null; }
            HttpRequest.Builder header(String string, String string1) { return null; }
            HttpRequest.Builder headers(String ... string) { return null; }
            HttpRequest.Builder timeout(Duration duration) { return null; }
            HttpRequest.Builder setHeader(String string, String string1) { return null; }
            HttpRequest.Builder GET() { return null; }
            HttpRequest.Builder POST(HttpRequest.BodyPublisher bodyPublisher) { return null; }
            HttpRequest.Builder PUT(HttpRequest.BodyPublisher bodyPublisher) { return null; }
            HttpRequest.Builder DELETE() { return null; }
            HttpRequest.Builder HEAD() { return null; }
            HttpRequest.Builder method(String string, HttpRequest.BodyPublisher bodyPublisher) { return null; }
            HttpRequest build() { return null; }
            HttpRequest.Builder copy() { return null; }
        }
        static HttpRequest.Builder newBuilder(URI uri) { return null; }
        static HttpRequest.Builder newBuilder(
            HttpRequest request,
            /*@IgnoreModifications[T]*/ BiPredicate<String, String> filter) { return null; }
        static HttpRequest.Builder newBuilder() { return null; }
        //@Immutable(hc=true)[T] @Independent(hc=true)[T]
        Optional<HttpRequest.BodyPublisher> bodyPublisher() { return null; }
        String method() { return null; }
        //@Immutable(hc=true)[T] @Independent(hc=true)[T]
        Optional<Duration> timeout() { return null; }
        boolean expectContinue() { return false; }
        URI uri() { return null; }
        //@Immutable(hc=true)[T] @Independent(hc=true)[T]
        Optional<HttpClient.Version> version() { return null; }
        HttpHeaders headers() { return null; }
        //override from java.lang.Object
        //@NotModified[H]
        public boolean equals(/*@Immutable(hc=true)[T] @Independent[M] @NotModified[T]*/ Object obj) { return false; }

        //override from java.lang.Object
        //@NotModified[H]
        public int hashCode() { return 0; }
    }
}
