package java21.concepts;

public abstract class TestAbstract {

    public void doDuty(){
        System.out.println("Do Duty in abstract class");
    }

    public void doDuty(String str){
        System.out.println("Do Duty in abstract class" + "concatenated with "+str);
    }

    //public abstract void tellMe();

    public void doDutySec(){
        System.out.println("Do Duty Sec in abstract class");
    }
}
