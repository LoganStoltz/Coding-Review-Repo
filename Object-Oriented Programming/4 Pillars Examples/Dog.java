public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override // Use @Override when we are implementing the abstract method from an abstract class (Considered good practice).
    public void makeSound() {
        System.out.println(this.getName() + " says: Woof!");
    }

    // Dog-specific method
    public void fetch() {
        System.out.println(this.getName() + " is fetching the ball!");
    }
}