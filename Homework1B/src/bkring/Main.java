package bkring;

import java.util.List;

public class Main {

    private static final Integer MERSENNE_START_POINT = new Integer(2);
    private static final Integer MERSENNE_ARRAY_SIZE = new Integer(8);

    public static void main(String[] args) {
    }

    private static Integer baseTwoMinusOne(Integer exponent) {
        return (new Integer(
                ((int) Math.pow(2.0, exponent.floatValue()) ) - 1);
    }

    private static Boolean checkIfMersennePrime(Integer number) {
        for (int i = 2; i < number; i++) {
            if (number % i != 0)
                return false;
        }
        return true;
    }

    private static void test() {
        assert baseTwoMinusOne(2) == 3;
        assert checkIfMersennePrime(3) == true;

        assert baseTwoMinusOne(3) == 7;
        assert checkIfMersennePrime(7) == true;

        assert baseTwoMinusOne(5) == 31;
        assert checkIfMersennePrime(31) == true;

        assert baseTwoMinusOne(7) == 127;
        assert checkIfMersennePrime(127) == true;
    };
}
