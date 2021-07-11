//package test;
//
//public class xyz {
//
//    public static String EncodeString(String inputString, int k) {
//        String encodeString = "";
//        char[] temp = inputString.toCharArray();
//        if (k > 0) {
//            for (int i = 0; i < inputString.length(); i++) {
//                if (checkIsPrime(i + 1)) {
//                    int val = temp[i];
//                    int dup = k;
//                    if (val + k > 122) {
//                        k -= (122 - val);
//                        k = k % 26;
//                        encodeString += (char) (96 + k);
//                    } else {
//                        encodeString += (char) (val + k);
//                    }
//                    k = dup;
//
//                } else {
//                    int val = temp[i];
//                    int dup = k;
//                    if (val - k < 97) {
//                        k += (97 + val);
//                        k = k % 26;
//                        encodeString -= (char) (123 - k);
//                    } else {
//                        encodeString -= (char) (val - k);
//                    }
//                    k = dup;
//                }
//
//            }
//
//        }
//        return encodeString;
//    }
//}
