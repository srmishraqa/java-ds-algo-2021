package java21.dsnalg.object;

public class Animal {

    String type;
    String name;
    int weightInPounds;
    int age;

    public Animal(String type, String name, int weightInPounds, int age) {
        this.type = type;
        this.name = name;
        this.weightInPounds = weightInPounds;
        this.age = age;
    }

    public void speak() {
        System.out.println("type: " + type);
        System.out.println("name: " + name);
        System.out.println("weight in pounds: " + weightInPounds);
        System.out.println("age: " + age);
    }

    public void run() {
        System.out.println("running .......");
    }
}
