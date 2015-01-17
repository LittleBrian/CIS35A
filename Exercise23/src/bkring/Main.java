package BKring.Exercise23;

/*
    Brian Kring
    CIS35A
    Prof. Cynthia Lee-Klawender
 */

public class Main {

    public static void main(String[] args) {
        /* Variable Init */
        int inum1 = 10;
        int inum2 = inum1;

        /* Business Logic */
            /* Loop until iterator is equal to inum2, print iterator, decrement inum2 */
        for ( int i=0; i < inum2; ++i, --inum2 ) {
            System.out.println("i = " + i);
        }
            /* Print inum2 */
        System.out.println("The last value of inum2 = " + inum2);
    }
}

/* Original Code */

/*
int inum1=10, inum2;

for(int i=0, inum2=inum1; i < inum2; ++i, --inum2){

System.out.println("i = " + i);

} // end for

System.out.println("The last value of inum2 = "+inum2);
 */
