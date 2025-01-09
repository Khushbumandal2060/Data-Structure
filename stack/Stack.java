public class Stack {
    int maxSize = 5; // Maximum size of the stack
    int[] a = new int[maxSize]; // Array to store stack elements
    int top = -1; // Index of the top element

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top < 0;
    }

    // Push an element onto the stack
    public void push(int i) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + i);
        } else {
            top++;
            a[top] = i;
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Returning a default value when stack is empty
        } else {
            int poppedElement = a[top];
            top--;
            return poppedElement;
        }
    }

    // Display all elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = 0; i <= top; i++) {
                System.out.println(a[i]);
            }
        }
    }

    // Main method to test the Stack class
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        
        System.out.println("Pushed data:");
        mystack1.push(1);
        mystack1.push(2);
        mystack1.push(3);
        mystack1.display();
        
        System.out.println();
        System.out.println("Popped data:");
        mystack1.pop();
        mystack1.display();
    }
}
