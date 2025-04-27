package dsaAssg;

public class CircularLinkedList {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public CircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Add node at the end
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head; // Points to itself
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        size++;
    }

    // Add node at the beginning
    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    // Delete node with given data
    public void delete(int data) {
        if (head == null) return;

        Node current = head;
        Node prev = tail;

        do {
            if (current.data == data) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    prev.next = head;
                    tail = prev;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Print the list
    public void print() {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public int size() {
        return size;
    }
    
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.append(10);
        cll.append(20);
        cll.prepend(5);
        
        cll.print(); // Output: 5 10 20
        
        cll.delete(10);
        cll.print(); // Output: 5 20
    }
}