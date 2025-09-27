public class DoublyLinkedList {
    // Main method to test the DoublyLinkedList class
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.displayForward();  // Output: Forward: 10 <-> 20 <-> 30 <-> null
        list.displayBackward(); // Output: Backward: 30 <-> 20 <-> 10 <-> null
    }
    
    // A Doubly Linked List is a linear data structure that consists of nodes where each node contains three parts:
    // 1. Data: The value or information stored in the node.
    // 2. Next Pointer: A reference to the next node in the sequence.
    // 3. Previous Pointer: A reference to the previous node in the sequence.
    // The first node is called the head, and the last node points to null, indicating the end of the list.
    // Doubly linked lists allow traversal in both directions (forward and backward) and make certain operations, like deletion and insertion, more efficient compared to singly linked lists.

    // Node class to represent each element in the doubly linked list
    private static class Node {
        int data;       // Data part of the node
        Node next;      // Pointer to the next node
        Node prev;      // Pointer to the previous node

        Node(int data) {    // Constructor to initialize the node
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head; // Creating the Head of the list

    // Method to add a new node at the end of the list
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
            newNode.prev = current; // Set the previous pointer of the new node
        }
    }

    // Method to display the linked list from head to tail
    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to display the linked list from tail to head
    public void displayBackward() {
        if (head == null) return; // If list is empty, return

        Node current = head;
        while (current.next != null) { // Traverse to the end of the list
            current = current.next;
        }

        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev; // Move to the previous node
        }
        System.out.println("null");
    }
}