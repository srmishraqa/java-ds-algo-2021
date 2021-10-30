package walmart;

public class FindDuplicateChars {

    public static String duplicateChars(String str) {
        String characters = "";
        String duplicates = "";
        for (int i = 0; i < str.length(); i++) {
            String current = Character.toString(str.charAt(i));
            if (characters.contains(current)) {
                if (!duplicates.contains(current)) {
                    duplicates = duplicates + "," + current;
                }
            }
            characters = characters + current;
        }
        return duplicates;
    }

    public static void main(String[] args) {
        String str = "abcdab";
        System.out.println(duplicateChars(str));
    }
}
