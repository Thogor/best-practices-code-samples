package com.realdolmen.samples.lennertVandenHerrewegen.streams_lambdas;

import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;

public class Primes {

    static Stream<BigInteger> primes() {
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }

}

class PrimesMain {
    public static void main(String[] args) {
        Primes.primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))

                .filter(mersenne -> mersenne.isProbablePrime(50))

                .limit(20)

                .forEach(System.out::println);
    }
}
