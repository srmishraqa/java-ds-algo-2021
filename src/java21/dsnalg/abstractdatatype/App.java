package java21.dsnalg.abstractdatatype;

public class App {
    public static void main(String[] args) {
        Counter myCounter = new Counter("myCounter");
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        System.out.println(myCounter.getCurrentCount());
        System.out.println(myCounter.toString());
    }

}
