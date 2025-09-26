public class Main {
    public static void main(String[] args) {
        // GENERIC CLASS EXAMPLE
        // Creating a Box to hold Integer values
        Box<Integer> intBox = new Box<>();
        intBox.setItem(123);
        System.out.println("Integer Value: " + intBox.getItem());

        // Creating a Box to hold String values
        Box<String> strBox = new Box<>();
        strBox.setItem("Hello, Generics!");
        System.out.println("String Value: " + strBox.getItem());

        // Creating a Box to hold Double values
        Box<Double> dblBox = new Box<>();
        dblBox.setItem(45.67);
        System.out.println("Double Value: " + dblBox.getItem());

        // GENERIC METHOD EXAMPLE
        // Using the generic method to print arrays of different types
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C", "D"};
        Utils.printArray(intArray);
        Utils.printArray(strArray);
    }
}