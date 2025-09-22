/**
 * This class demonstrates Inheritance, Abstraction, and Encapsulation in Java.
 * 
 * Animal is an abstract class that defines a common structure for all animals.
 * It contains an abstract method makeSound() that enforces a contract requiring
 * all child classes to provide their own specific implementation.
 * 
 * This class cannot be instantiated directly. Child classes like Dog and Bunny
 * inherit from Animal and must implement the makeSound() method with their
 * own specific behavior.
 * 
 * ENCAPSULATION: The fields are private, hiding internal data from external classes.
 * Access to these fields is controlled through public getter and setter methods,
 * allowing for data validation and controlled access.
 */

public abstract class Animal {
    // Private fields demonstrate ENCAPSULATION - hiding internal data
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to be implemented by child classes
    public abstract void makeSound();

    // Getter methods 
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}