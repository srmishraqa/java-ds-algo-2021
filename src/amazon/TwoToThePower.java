package amazon;

import java.util.ArrayList;

/*
* Every number can be described in powers of 2.
Example : 29 = 2^0 + 2^2 + 2^3 + 2^4.
2^0 ( exponent of 2 is ‘0’) 0
2^2 ( exponent of 2 is ‘2’) 1
2^3 ( exponent of 2 is ‘3’) 3
2^4 ( exponent of 2 is ‘4’) 4
Convert each number into its binary equivalent by pushing remainder of given number,
* when divided by 2 till it is greater than 0, to vector. Now,
* Iterate through its binary equivalent and whenever there is set bit,
* just print the i-th value(iteration number).
* */
public class TwoToThePower {
    static void block(int x) {
        ArrayList<Integer> v = new ArrayList<Integer>();
        // Convert decimal number to
        // its binary equivalent
        System.out.println ("Blocks for " + x + " : ");
        while (x > 0) {
            v.add( x % 2);
            x = x / 2;
        }

        // Displaying the output when
        // the bit is '1' in binary
        // equivalent of number.
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) == 1) {
                System.out.println("2 to the power "+i);
            }
        }
        System.out.println();
    }

    // Driver Code
    public static void main(String args[]) {

        block(36);

    }
}
