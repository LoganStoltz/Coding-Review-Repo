public class coyote implements animal, predator {
    // Animal interface forced methods
    @Override
    public void makeSound() {
        System.out.println("Howl");
    }

    @Override
    public void eat() {
        System.out.println("The coyote is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("The coyote is sleeping.");
    }

    // Predator interface forced method
    @Override
    public void hunt() {
        System.out.println("The coyote is hunting.");
    }
}