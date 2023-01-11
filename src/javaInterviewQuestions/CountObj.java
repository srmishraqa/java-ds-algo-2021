package javaInterviewQuestions;

public class CountObj {

    static int objCount = 0;

    public CountObj() {
        objCount++;
    }

    public int getCurrentObjCount() {
        return objCount;
    }

    public static void main(String[] args) {
        CountObj ob1 = new CountObj();
        CountObj ob2 = new CountObj();
        System.out.println(ob1.getCurrentObjCount());
        CountObj ob3 = new CountObj();
        System.out.println(ob2.getCurrentObjCount());
        System.out.println(ob3.getCurrentObjCount());
    }
}
