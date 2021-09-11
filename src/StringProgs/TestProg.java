package StringProgs;

/**
 * Input = "abccreeggmmabc"
 * output = "ab+r+++abc"
 */

public class TestProg {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abccreeggmmabc");
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                str.replace(i,i+2,"+");
            }
        }
        System.out.println(str);
    }
}
