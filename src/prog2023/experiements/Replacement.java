package prog2023.experiements;
//Java string, replace ab with bba recursively
//E.g: "aaba" then replace "abbaa" again ab is present so replace it like "bbabaa"

public class Replacement {
    private static Replacement ref = null;

    public static void main(String[] args) {
        System.out.println(replace1("aaba","ab","bba"));
        String s ="123456";
        String t = "98067";
        System.out.println(Integer.parseInt(s)+Integer.parseInt(t));
        Replacement r1 = new Replacement();
        Replacement r2 = new Replacement();
        System.out.println(r1.getInstance());
        System.out.println(r2.getInstance());
    }

    public static String replace1(String in, String target, String replacement) {
        if (target.isEmpty()) {
            return in;
        }
        int pos = in.indexOf(target);
        if (pos < 0) {
            return in;
        }
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
        String updated = in.substring(0, pos) + replacement +
                in.substring(pos + target.length());
        return replace1(updated, target, replacement);
    }

    private Replacement(){

    }

    public static Replacement getInstance(){
        if(ref == null){
            ref = new Replacement();
        }
        return ref;
    }
}
