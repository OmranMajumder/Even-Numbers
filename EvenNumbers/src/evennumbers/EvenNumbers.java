/* Author: Omran (Omi) Majumder
 * Last Modified: 02/11/2021
 * Assignment 01
 * Returns all even numbers between 0 and 100 (inclusive) separated by a newline
 */
package evennumbers;

public class EvenNumbers {

    public static void main(String[] args) {
        // for loop indexing between the range 0 and 100 (inclusive)
        for (int i = 0; i <= 100; i++) {
            // condition to execute print statement
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        /* Alternative methods:
        // for loop to index range and increments index by 2
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
        
        int i = 0; // declare and initialize index
        while (i <= 100) {
            System.out.println(i);
            i += 2; // increment index by 2
        }
        */
    }    
}
