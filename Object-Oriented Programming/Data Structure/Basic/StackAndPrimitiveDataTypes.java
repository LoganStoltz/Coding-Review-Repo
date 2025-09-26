import java.util.Stack;

public class StackAndPrimitiveDataTypes {
    public static void main(String[] args) {
        // Primitive data types
        int myInt = 10;                     // An integer (whole number)
        float myFloat = 20.5f;              // A float requires an 'f' suffix and offers 7-8 digits of precision
        double myDouble = 5.5;              // A double offers about 15 digits of precision
        char myChar = 'A';                  // A character (single 16-bit Unicode character)
        String myString = "Hello, World!";  // A string (sequence of characters)
        boolean myBoolean = true;           // A boolean (true/false value)

        System.out.println("Primitive Data Types:");
        System.out.println("Integer: " + myInt);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("String: " + myString);
        System.out.println("Boolean: " + myBoolean);


        //FIRST REAL DATA STRUCTURE EXAMPLE (STACK)
        /* 
            A stack is a linear data structure that follows the Last In First Out (LIFO) principle.
            This means that the last element added to the stack will be the first one to be removed
            from it. You can think of a stack like a collection of plates; you add and remove plates
            from the top of the stack only.

            Stack Methods: push, pop, peek, size and isEmpty
            - push: Adds an element to the top of the stack.
            - pop: Removes and returns the top element of the stack.
            - peek: Returns the top element without removing it.
            - size: Returns the number of elements in the stack.
            - isEmpty: Checks if the stack is empty.

        */
        System.out.println("\nUsing Stack Data Structure:");
        // Creating a stack of integers
        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        System.out.println("Integer Stack:");
        while (!intStack.isEmpty()) {
            System.out.println(intStack.pop());
        }

        // Creating a stack of strings
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("!");
        stringStack.peek(); // Peek at the top element
        System.out.println("\nString Stack:");
        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
    }
}