package amazon;

public class CFG {
    private CFG(Object o) {
        System.out.println("Object");
    }
    private CFG(double[] d) {
        System.out.println("double array");
    }
    public static void main(String[] args) {
        new CFG(null);
    }
}
