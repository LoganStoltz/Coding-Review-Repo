public class mouse implements animal, prey {
    // Animal interface forced methods
    @Override
    public void makeSound() {
        System.out.println("Squeak");
    }

    @Override
    public void eat() {
        System.out.println("The mouse is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("The mouse is sleeping.");
    }

    // Prey interface forced method
    @Override
    public void flee() {
        System.out.println("The mouse is fleeing.");
    }
}