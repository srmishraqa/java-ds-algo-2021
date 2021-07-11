package progs21;

public class StringPatternMatchingWithRegEx {

    public static boolean isMatchingAny(String input,String toBeMatched){
        return  input.matches("(.*)"+toBeMatched+"(.*)");
    }

    public static boolean isMatchingFromBeginning(String input,String toBeMatched){
        return  input.matches(toBeMatched+"(.*)");
    }

    public static boolean isMatchingFromEnd(String input,String toBeMatched){
        return  input.matches("(.*)"+toBeMatched);
    }

    public static boolean isMatchingFull(String input,String toBeMatched){
        return  input.matches(toBeMatched);
    }

    public static void main(String[] args) {
        String input = "Welcome to Tutorialspoint.com";
        System.out.println("isMatchingAny() --> "+isMatchingAny(input,"Tutorials"));
        System.out.println("isMatchingFromBeginning() --> "+isMatchingFromBeginning(input,"Welcome"));
        System.out.println("isMatchingFromEnd() --> "+isMatchingFromEnd(input,".com"));
        System.out.println("isMatchingFull() --> "+isMatchingFull(input,"Tutorialspoint"));

        input = "Ohio";
        System.out.println("isVowelPresent() --> "+isVowelPresent(input));

        input = "STRRRR";
        System.out.println("isVowelPresent() --> "+isVowelPresent(input));

    }

    //For Vowel Recognition
    public static boolean isVowelPresent(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }


}

