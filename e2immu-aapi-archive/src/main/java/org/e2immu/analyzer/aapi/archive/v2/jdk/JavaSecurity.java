package org.e2immu.analyzer.aapi.archive.v2.jdk;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomParameters;
import javax.security.auth.Subject;

public class JavaSecurity {
    public static final String PACKAGE_NAME = "java.security";
    //public interface Principal
    class Principal$ {
        //override from java.lang.Object
        //@NotModified[H]
        public boolean equals(/*@Immutable(hc=true)[T] @Independent[M] @NotModified[T]*/ Object object) { return false; }

        //override from java.lang.Object
        //@NotModified[H] @NotNull[H]
        public String toString() { return null; }

        //override from java.lang.Object
        //@NotModified[H]
        public int hashCode() { return 0; }

        //frequency 1
        String getName() { return null; }
        boolean implies(Subject subject) { return false; }
    }

    //public class SecureRandom extends Random
    class SecureRandom$ {
        SecureRandom$() { }
        SecureRandom$(byte [] seed) { }
        static SecureRandom getInstance(String algorithm) { return null; }
        static SecureRandom getInstance(String algorithm, String provider) { return null; }
        static SecureRandom getInstance(String algorithm, Provider provider) { return null; }
        static SecureRandom getInstance(String algorithm, SecureRandomParameters params) { return null; }
        static SecureRandom getInstance(String algorithm, SecureRandomParameters params, String provider) { return null; }

        static SecureRandom getInstance(String algorithm, SecureRandomParameters params, Provider provider) { return null; }
        Provider getProvider() { return null; }
        String getAlgorithm() { return null; }
        //override from java.lang.Object
        //@NotModified[H] @NotNull[H]
        public String toString() { return null; }
        SecureRandomParameters getParameters() { return null; }
        void setSeed(byte [] seed) { }
        //override from java.util.Random
        void setSeed(long seed) { }

        //override from java.util.Random, java.util.random.RandomGenerator
        //frequency 1
        void nextBytes(/*@NotModified[H]*/ byte [] bytes) { }
        void nextBytes(byte [] bytes, SecureRandomParameters params) { }
        //@Independent[T]
        static byte [] getSeed(int numBytes) { return null; }
        byte [] generateSeed(int numBytes) { return null; }
        static SecureRandom getInstanceStrong() { return null; }
        void reseed() { }
        void reseed(SecureRandomParameters params) { }
    }
}
