package javaInterviewQuestions.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinally {

    public static void main(String args[]) {
        // main try-block
        try {

            // try-block2
            try {

                // try-block3
                try {
                    int arr[] = {1, 2, 3, 4};
                    System.out.println(arr[10]);
                }

                // handles ArithmeticException if any
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println(" try-block1");
                } finally {
                    System.out.println("inner most finally");
                }
            }

            // handles ArithmeticException if any
            catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println(" try-block2");
            } finally {
                System.out.println("2nd try block finally");
            }
        }

        // handles ArrayIndexOutOfBoundsException if any
        catch (ArrayIndexOutOfBoundsException e4) {
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" main try-block");
        } catch (Exception e5) {
            System.out.println("Exception");
            System.out.println(" handled in main try-block");
        } finally {
            System.out.println("Main Try block finally");
        }
    }

}
