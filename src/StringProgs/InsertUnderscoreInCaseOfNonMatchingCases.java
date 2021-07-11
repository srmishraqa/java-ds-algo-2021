package StringProgs;

// if input is 'ABCdeFmLAi' -> ABC_de_F_m_LA_i

public class InsertUnderscoreInCaseOfNonMatchingCases {
    public static String driverMethod(String str) {
        String Output = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if ((Character.isLowerCase(str.charAt(i)) && Character.isUpperCase(str.charAt(i + 1))) || (Character.isUpperCase(str.charAt(i)) && Character.isLowerCase(str.charAt(i + 1)))
            ) {
                Output = Output + str.charAt(i) + "_";
            } else {
                Output = Output + str.charAt(i);
            }
        }
        Output = Output + str.charAt(str.length() - 1);
        return Output;
    }

    public static void main(String[] args) {
        System.out.println(driverMethod("ABCdeFmLAi"));
        //System.out.println(driverMethod2(new StringBuffer("ABCdeFmLAi")));
    }

//    public static StringBuffer driverMethod2(StringBuffer str) {
//
//        for (int i = 0; i < str.length() - 1; i++) {
//            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') &&
//                    (str.charAt(i + 1) >= 'A' && str.charAt(i + 1) <= 'Z' || str.charAt(i + 1) >= 'a' && str.charAt(i + 1) <= 'z')
//            )
//                if ((Character.isLowerCase(str.charAt(i)) && Character.isUpperCase(str.charAt(i + 1))) || (Character.isUpperCase(str.charAt(i)) && Character.isLowerCase(str.charAt(i + 1)))
//                ) {
//                    str.replace(i, 1 + 2, str.charAt(i) + "_");
//
//                }
//
//        }
//
//        return str;
//    }
}
