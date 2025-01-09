class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Node class to represent each element in the linked list
    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // Create a singly linked list with an initial node value
    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node(nodeValue);
        tail = head;
        size = 1;
        return head;
    }

    // Insert a new node at a specific location
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node(nodeValue);

        // If the list is empty, create a new list
        if (head == null) {
            createSinglyLinkedList(nodeValue);
        }
        // Insert at the beginning (location 0)
        else if (location == 0) {
            node.next = head;
            head = node;
        }
        // Insert at the end
        else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        }
        // Insert at any other location
        else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Traverse and print the elements of the singly linked list
    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("SLL does not exist!");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // Search for a node with a specific value
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    // Main method to test the singly linked list operations
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.createSinglyLinkedList(10);
        list.insertInLinkedList(20, 1);
        list.insertInLinkedList(30, 2);
        list.insertInLinkedList(5, 0);
        list.traverseSinglyLinkedList();

        list.searchNode(20); // Search for a node
        list.searchNode(40); // Search for a non-existent node
    }
}
