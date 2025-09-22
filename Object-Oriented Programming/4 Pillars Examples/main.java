
public class main {
    public static void main(String[] args) {

        // POLYMORPHISM: Creating objects using both superclass and subclass references.
        // Animal references (dog1, bunny1) demonstrate polymorphism - the same reference type
        // can hold different object types, allowing for flexible and extensible code.
        Animal dog1 = new Dog("Buddy", 3);
        Dog dog2 = new Dog("Boof", 6);
        Animal bunny1 = new Bunny("Whiskers", 2);
        Bunny bunny2 = new Bunny("Fluffy", 4);

        dog1.makeSound();   // Outputs: Woof!
        dog2.fetch();       // Outputs: Boof is fetching the ball!
        bunny1.makeSound(); // Outputs: Thump!
        bunny2.hop();       // Outputs: Fluffy is hopping on all fours! 

        System.out.println();
        System.out.println(dog1.getName() + " is " + dog1.getAge() + " years old.");
        System.out.println(dog2.getName() + " is " + dog2.getAge() + " years old.");
        System.out.println(bunny1.getName() + " is " + bunny1.getAge() + " years old.");
        System.out.println(bunny2.getName() + " is " + bunny2.getAge() + " years old.");
    }
}