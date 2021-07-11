package StringProgs;

public class DistanceBetweenTwoCharctersOfAstring {
    public static void main(String[] args) {
        String str = "VVS LAXMAN";
        System.out.println(distanceBetweenTwoStrings(str,'V','N'));
        System.out.println(distanceBetweenTwoStrings(str,'L','V'));

    }
    public static int distanceBetweenTwoStrings(String str,char c,char d){
        if(str.equals("")){
            return -1;
        }
        if(str.contains(c+"") && str.contains(d+"")){
            if(str.indexOf(c)<=str.indexOf(d)){
                return str.indexOf(d) - str.indexOf(c);
            }
            else{
                return -1;
            }
        }
        else{
            return -1;
        }
    }
}
