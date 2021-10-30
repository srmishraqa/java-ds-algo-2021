package progs21;

public class CountNoOfVowels {

    public static int calculateNumberOfVowels(String input) {
        int vowelCount = 0;
        if (input.matches(".*[aeiou].*")) {

            for (char element : input.toLowerCase().toCharArray()) {
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
