package java21.concepts;

import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }
        catch (ArithmeticException | NumberFormatException | NullPointerException e){
            e.printStackTrace();
        }
    }
}
