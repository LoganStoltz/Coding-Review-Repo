// This is a generic class that can hold any type of object.
// The type parameter T is a placeholder for the actual type that will be specified
// when an instance of Box is created. This allows for type safety and code reusability.
// T stands for "Type", but I like to think of it as 'Thing', we can put any 'Thing' in the box!

public class Box<T> {   // Generic class with type parameter T
    T item; // The item of type T that the box will hold (Generic variable)

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}