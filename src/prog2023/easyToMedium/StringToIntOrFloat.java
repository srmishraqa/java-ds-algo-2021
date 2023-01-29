package prog2023.easyToMedium;

//"12345" -> return 12345
//"12345.56" -> return 12345.56
public class StringToIntOrFloat {
    public static void getOp(String str) {
        if (str.contains(".")) {
            try {
                System.out.println("The Output is type float and o/p is : " + Float.parseFloat(str));
            }
            catch (NumberFormatException e){
                e.printStackTrace();
            }
        } else {
            try {
                System.out.println("The Output is type int and o/p is : " + Integer.parseInt(str));
            }
            catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        getOp("12345");
        getOp("23456");
    }
}
