package bkring;

/*
    Brian Kring
    CIS35A
    Prof. Cynthia Klawender
 */


public class Main {

    public static void main(String[] args) {

        /* Local Variable Declaration */
        int inum1 = 5;
        //UNUSED int inum2 = 8;

        /*
        Business Logic
            While inum1 is positive:
            1. Decrement inum1
            2. Print inum1
         */
        while( inum1 > 0) {
            inum1 -= 1;
            System.out.printf("%d ", inum1);
        }

    }
}

/* Original C code */

/*
int inum1=5, inum2=8;

while( inum1-- ){ // OK in C, NOT in Java

        printf("%d ", inum1); // cout << inum1 << " "; // in C++

        } // end while
*/