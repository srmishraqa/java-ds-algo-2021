package java21.dsnalg.oops;

public class Human {

    static int count = 0;

    // Properties - these values will come as null or 0 based on datatype if we
    // don't assign any value
    String name;
    int age;
    int heightInInches;
    String eyeColor;

    /**
     * Classes contain instructions for how Objects are created as well as how
     * Objects are going to behave We need a way to actually create a human object
     * Some method like birth method - a special method like constructor, This
     * special method provides a way to construct object with new keyword the object
     * is created of the same class. When we write lines of code it does not create
     * Object, it creates object when program runs line by line
     */

    // Constructor - same name as class and does not have return type
    // we can assign values to the constructor while creating object itself
    // so that we don't need to set values again - flexible constructor

    // this keyword is used to point to current instance
    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
        count++;
    }

    // behavior
    public void speak() {
        System.out.println("Hello ! My name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("I have " + eyeColor + " colored eye");
    }

    public void eat() {
        System.out.println("eating......");
    }

    public void walk() {
        System.out.println("walking.....");
    }

    public void work() {
        System.out.println("working.....");
    }

}
