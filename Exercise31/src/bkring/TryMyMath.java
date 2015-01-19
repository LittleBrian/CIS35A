package bkring;

/*
    Brian Kring
    CIS35A
    Prof. Cynthia Lee-Klawender
 */

public class TryMyMath {

    /* Utility Properties */
    private static double roundedValue = 0;

    public static void print(double value) {

        /* Round value to nearest hundreth */
        roundedValue = MyMath.roundToNearestHundreth(value);

        /* Print roundedValue, square of roundedValue, and cube of roundedValue. Code copied from exercise 2.4 */
        System.out.printf("%20f%20f%20f\n", roundedValue, Math.pow(roundedValue, 2.0), Math.pow(roundedValue, 3.0));
    }

    public static void main(String[] args) {
        print(Math.E);
    }

}
