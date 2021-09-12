package java21.dsnalg.abstractdatatype;

public class Counter {

    // declared private for abstraction
    /**
     * methods to do operations without exposing the implementation
     */
    private String name = null;
    private int value = 0;

    public Counter(String str) {
        this.name = str;
    }

    public void increment() {
        value++;
    }

    public int getCurrentCount() {
        return value;
    }

    public String toString(){
        return name + " : "+ value;
    }
}
