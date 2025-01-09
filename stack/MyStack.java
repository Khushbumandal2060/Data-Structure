
class MyStack {
  private int maxSize;
  private int[] stackArray;
  private int top;

  public MyStack(int size) {
      maxSize = size;
      stackArray = new int[maxSize];
      top = -1; // Initialize top to -1 (empty stack)
  }

  public void push(int value) {
      if (isFull()) {
          System.out.println("Stack is full " + value);
      } else {
          stackArray[++top] = value;
          System.out.println("The stack is inserted successfully"+ value);
      }
  }

  public boolean isFull() {
      return top == maxSize - 1;
  }

  

  public void   Pop(){
    if(isEmpty()) {
        System.out.println("the stack is empty" );
    
    }else {
        int poppedvalue= stackArray[top--];
        System.out.println("the stack is removed successfully: "+poppedvalue);
        

    }
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public static void main(String[] args) {
      MyStack stack = new MyStack(5); // Create a stack of size 5

      stack.push(10);
      stack.push(20);
      stack.push(30);
      stack.push(40);
      stack.push(53);

      stack.Pop();
      stack.Pop();
      stack.Pop();
      stack.Pop();
      stack.Pop();

      
  }
}
