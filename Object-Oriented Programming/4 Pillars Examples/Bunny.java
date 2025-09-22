public class Bunny extends Animal {   

    public Bunny(String name, int age) {
        super(name, age);
    }

    @Override // Use @Override when we are implementing the abstract method from an abstract class (Considered good practice).
    public void makeSound() {
        System.out.println(this.getName() + " says: Thump!");
    }

    // Bunny-specific method
    public void hop() {
        System.out.println(this.getName() + " is hopping on all fours!");
    }

}