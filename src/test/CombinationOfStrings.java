package test;

public class CombinationOfStrings {
    public static void main(String[] args) {
        String str = "maim";
        printAllSubStrings(str);
        System.out.println("Passed");
    }

    public static void printAllSubStrings(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));

            }
        }
    }
}

