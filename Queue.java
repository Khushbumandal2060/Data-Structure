package queue;

public class Queue {
    int maxSize = 5; // Maximum size of the queue
    int rear = -1;   // Rear pointer
    int front = 0;   // Front pointer
    int a[] = new int[maxSize]; // Array to store queue elements

    // Enqueue operation (Add element to the queue)
    public void enqueue(int x) {
        if ((rear + 1) % maxSize == front) {
            System.out.println("Overflow: The queue is full");
        } else {
            rear = (rear + 1) % maxSize;  // Circular increment for rear pointer
            a[rear] = x;
            System.out.println(x + " enqueued to the queue");
        }
    }

    // Dequeue operation (Remove element from the queue)
    public void dequeue() {
        if (rear == front - 1 || (front == 0 && rear == maxSize - 1)) {
            System.out.println("Underflow: The queue is empty");
        } else {
            int element = a[front]; // Element being removed
            front = (front + 1) % maxSize;  // Circular increment for front pointer
            System.out.println(element + " dequeued from the queue");
        }
    }

    // Display operation (Print elements of the queue)
    public void display() {
        if (front == rear + 1 || (front == 0 && rear == maxSize - 1)) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            int i = front;
            while (i != rear) {
                System.out.print(a[i] + " ");
                i = (i + 1) % maxSize;  // Circular traversal
            }
            System.out.println();
        }
    }

    // Main method to test the queue
    public static void main(String[] args) {
        Queue obj = new Queue();
        System.out.println("Let's enqueue");
        obj.enqueue(2);
        obj.enqueue(4);
        obj.enqueue(6);
        obj.display();

        System.out.println();
        System.out.println("Let's dequeue");
        obj.dequeue();
        obj.display();

        System.out.println();
        System.out.println("Let's enqueue more elements");
        obj.enqueue(8);
        obj.enqueue(10);
        obj.display();
    }
}
