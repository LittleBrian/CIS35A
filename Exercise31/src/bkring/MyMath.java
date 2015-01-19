package bkring;

/*
    Brian Kring
    CIS35A
    Prof. Cynthia Lee-Klawender
 */

public class MyMath {
    public static double roundToNearestHundreth(double initialValue) {
       return java.lang.Math.round( initialValue * 100.00) / 100.00;
    }
}
