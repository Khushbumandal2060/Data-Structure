package linkedlist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist {
    Node head;

    // Insert a new node at the end
    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    // Display the list
    public void show() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    // Insert a new node at the start
    public void insertAtStart(int data) {
        Node node = new Node(data);
        node.next = head; // linking new node to the start node
        head = node; // shifting head to new node
    }

    // Insert a new node at a specific index
    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtStart(data);
            return;
        }

        Node node = new Node(data);
        Node n = head;
        int i = 0;

        // Traverse the list to find the node before the specified index
        while (n != null && i < index - 1) {
            n = n.next;
            i++;
        }

        // If we reached the end of the list or the index is out of bounds
        if (n == null) {
            System.out.println("Index out of bounds");
            return;
        }

        // Insert the node
        node.next = n.next;
        n.next = node;
    }

    // Delete the first node
    public void delete() {
        if (head != null) {
            head = head.next; // Pointing head pointer to second node
        } else {
            System.out.println("The list is empty!");
        }
    }

    // Delete a node at a specific index
    public void deleteAt(int index) {
        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }

        if (index == 0) {
            head = head.next; // Removing the first node
            return;
        }

        Node tempNode = head;
        int i = 0;

        // Traverse to the node before the specified index
        while (tempNode != null && i < index - 1) {
            tempNode = tempNode.next;
            i++;
        }

        if (tempNode == null || tempNode.next == null) {
            System.out.println("Index out of bounds");
            return;
        }

        // Delete the node at the given index
        tempNode.next = tempNode.next.next;
    }

    // Delete the last node
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }

        if (head.next == null) {
            head = null; // If there's only one node, set head to null
            return;
        }

        Node tempNode = head;
        while (tempNode.next != null && tempNode.next.next != null) {
            tempNode = tempNode.next;
        }

        tempNode.next = null; // Remove the last node
    }

    public static void main(String[] args) {
        Linkedlist l = new Linkedlist();

        // Insert nodes
        l.insert(50);
        l.insert(60);
        l.insertAtStart(80);
        l.insertAt(1, 100);

        // Display the list
        System.out.println("Linked List after insertions:");
        l.show();

        // Delete first node
        l.delete();
        System.out.println("Linked List after deleting the first node:");
        l.show();

        // Delete node at a specific index
        l.deleteAt(1);
        System.out.println("Linked List after deleting node at index 1:");
        l.show();

        // Delete the last node
        l.deleteAtEnd();
        System.out.println("Linked List after deleting the last node:");
        l.show();
    }
}
