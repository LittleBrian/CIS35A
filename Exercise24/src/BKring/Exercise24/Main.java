package BKring.Exercise24;

/*
    Brian Kring
    CIS35A
    Prof. Cynthia Lee-Klawender
 */
public class Main {

    public static void main(String[] args)
    {
        /* Iterate from 2 to 20 */
        for( int i = 2; i <= 20; i++)
            /* print i, square of i, cube of i */
            System.out.printf("%12d%12f%12f\n", i, Math.pow((double)i, 2.0), Math.pow((double)i, 3.0));
    }
}
