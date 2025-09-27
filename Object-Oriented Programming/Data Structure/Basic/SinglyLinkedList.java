public class SinglyLinkedList {
    // Main method to test the SinglyLinkedList class
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.display(); // Output: 10 -> 20 -> 30 -> null
    }
    
    // A Linked List is a linear data structure that is made up of nodes that represent elements in the list.
    // Each node only know what its contents are and what the next node is.
    // The first node is called the head, and the last node points to null, indicating the end of the list.
    // Linked lists are dynamic, meaning they can grow and shrink in size as needed, unlike arrays which have a fixed size.
    // Node class to represent each element in the linked list
    private static class Node {
        int data;       // Data part of the node
        Node next;      // Pointer to the next node

        Node(int data) {    // Constructor to initialize the node
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Creating the Head of the list

    // Method to add a new node at the end of the list
    // In this method, we traverse to the end of the list and add the new node there, which takes O(n) time.
    // with a little more effort we can add nodes inbetween other nodes in the list.
    // Its important to note that when we add a node inbetween other nodes, we need to update the next pointer of the previous node to point to the new node.
    // and then point the new node to the next node in the list. The method would need to know the before and after nodes to do this

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the linked list
    // This is an easy way to visualize the contents of the list, just traverse the list and print each node's data until you reach the end (null)
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}