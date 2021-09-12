package java21.dsnalg.object;

public class Earth {
    public static void main(String[] args) {
        // Human tom;
        // tom = new Human();
        // tom.speak(); // calling without assigning values to variables

        // tom.age = 5;
        // tom.eyeColor = "blue";
        // tom.heightInInches = 48;
        // tom.name = "Thomas";

        // tom.speak();

        // Human jo = new Human();
        // jo.age = 10;
        // jo.eyeColor = "green";
        // jo.heightInInches = 60;
        // jo.name = "Joseph";

        // jo.speak();

        Human human1 = new Human("Thomas", 18, 72, "blue");
        Human human2 = new Human("Joseph", 21, 68, "green");

        human1.speak();
        human2.speak();

        human1.age = 20;
        human1.speak();

        System.out.println(Human.count);
    }

}
