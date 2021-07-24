package javaInterviewQuestions;

import java.io.OutputStream;

public class StringVsStringBuffer {
    public static void main(String[] args) {
        // String is a class and it is immutable
        // Once the string object is created , we can't perform any change on the same object again
        // Trying to perform anything on existing object will create a new object and the existing object will remain intact
        String str = new String("Soumya");
        System.out.println("Before changing String Object : " + str);
        str.concat("Ranjan"); // Ready for GC
        System.out.println("After changing String Object : " + str);

        // String Buffer is mutable
        // We can change the existing object and perform something and it will get changed in the same object
        // Will not create any new object as such what happened in string object

        StringBuffer sb = new StringBuffer("Soumya");
        System.out.println("Before changing String Buffer Object : " + sb);
        sb.append(" Ranjan");
        System.out.println("After changing String Buffer Object : " + sb);

        // equals() vs ==
        // equals() used for content comparison and == used for address comparison
        String str1 = new String("Soumya");
        String str2 = new String("Soumya");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        // String buffer(synchronized / single threading /thread safe / inefficient) Vs
        // String builder(non-synchronized / multi threading /thread unsafe / efficient)

        long startTime = System.currentTimeMillis();
        StringBuffer sb1 = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            sb1.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sb2.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }


}
