class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    // Constructor
    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full, cannot enqueue");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = item;
        currentSize++;
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot dequeue");
            return -1; // or throw an exception
        }
        int dequeuedItem = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return dequeuedItem;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return (currentSize == maxSize);
    }

    // Method to get the size of the queue
    public int size() {
        return currentSize;
    }

    // Method to peek at the front element of the queue
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot peek");
            return -1; // or throw an exception
        }
        return queueArray[front];
    }
}

public class Queue2 {
    public static void main(String[] args) {
        // Create a queue with a max size of 5
        Queue queue = new Queue(5);

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        // Try to enqueue an element to a full queue
        queue.enqueue(60);  // This should print "Queue is full, cannot enqueue"

        // Dequeue elements
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Dequeued item: " + queue.dequeue());

        // Peek at the front element
        System.out.println("Front element: " + queue.peek());

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Check the size of the queue
        System.out.println("Size of queue: " + queue.size());
    }
}
