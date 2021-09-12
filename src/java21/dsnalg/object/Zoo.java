package java21.dsnalg.object;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal("mammals", "Lion", 400, 17);
        Animal animal2 = new Animal("insects", "Snake", 70, 2);

        animal1.speak();
        animal2.speak();

        animal2.type = "mammals";
        animal2.name = "bear";
        animal2.weightInPounds = 375;
        animal2.age = 11;

        animal2.speak();
    }
}
