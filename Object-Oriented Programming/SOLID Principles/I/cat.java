
public class cat implements predator, prey, animal {
    // Animal interface forced methods
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping.");
    }

    // Predator interface forced method
    @Override
    public void hunt() {
        System.out.println("The cat is hunting.");
    }

    // Prey interface forced method
    @Override
    public void flee() {
        System.out.println("The cat is fleeing.");
    }
}