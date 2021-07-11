package progs21;

public class CountNoOfVowels {

    public static int calculateNumberOfVowels(String input) {
        int vowelCount = 0;
        if (input.matches(".*[aeiou].*")) {
            char[] charArray = input.toLowerCase().toCharArray();
            for (char element : charArray) {
                if (element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u') {
                    vowelCount++;
                }
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        System.out.println("calculateNumberOfVowels(TutorialsPOINT) ------> "+calculateNumberOfVowels("TutorialsPOINT"));
        System.out.println("calculateNumberOfVowels(SRTMSD) ------> "+calculateNumberOfVowels("SRTMSD"));
    }
}
