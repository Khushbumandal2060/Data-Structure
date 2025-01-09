public class Stack2 {
  private int[] arr;       // Array to store stack elements
  private int topOfStack;  // Index of the top element in the stack

  // Constructor to initialize the stack
  public Stack2(int size) {
      this.arr = new int[size];
      this.topOfStack = -1;
      System.out.println("The stack is created with a size of: " + size);
  }

  // Check if the stack is empty
  public boolean isEmpty() {
      return topOfStack == -1;
  }

  // Check if the stack is full
  public boolean isFull() {
      return topOfStack == arr.length - 1;
  }

  // Push an element onto the stack
  public void push(int value) {
      if (isFull()) {
          System.out.println("The stack is full. Cannot push " + value);
      } else {
          arr[++topOfStack] = value;
          System.out.println("The value " + value + " is successfully inserted.");
      }
  }

  // Pop an element from the stack
  public int pop() {
      if (isEmpty()) {
          System.out.println("The stack is empty. Cannot pop.");
          return -1; // Return a default value when the stack is empty
      } else {
          int poppedValue = arr[topOfStack--];
          System.out.println("The value " + poppedValue + " is successfully popped.");
          return poppedValue;
      }
  }

  // Peek at the top element of the stack
  public int peek() {
      if (isEmpty()) {
          System.out.println("The stack is empty!");
          return -1; // Return a default value when the stack is empty
      } else {
          return arr[topOfStack];
      }
  }

  // Delete the stack
  public void deleteStack() {
      arr = null;
      System.out.println("The stack is successfully deleted.");
  }

  // Main method for testing
  public static void main(String[] args) {
      Stack2 stack = new Stack2(5); // Create a stack with size 5

      stack.push(10);
      stack.push(20);
      stack.push(30);

      System.out.println("Top element is: " + stack.peek());

      stack.pop();
      stack.pop();
      stack.pop();

      stack.pop(); // Attempt to pop from an empty stack

      stack.deleteStack(); // Delete the stack
  }
}
