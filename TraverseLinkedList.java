class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class TraverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(15);
        head.next.next = new Node(25);

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}