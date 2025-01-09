public class StackMain {
    public static void main(String[] args) {
        Stack2 newStack = new Stack2(4); // Create a stack with size 4
        
        // Check if the stack is empty
        System.out.println("Is the stack empty? " + newStack.isEmpty());

        // Push elements into the stack
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);

        // Try to push another element into a full stack
        newStack.push(5);

        // Peek at the top element
        System.out.println("Top element is: " + newStack.peek());

        // Pop an element and display the updated top element
        newStack.pop();
        System.out.println("After popping, top element is: " + newStack.peek());

        // Check if the stack is full
        System.out.println("Is the stack full? " + newStack.isFull());

        // Delete the stack
        newStack.deleteStack();
    }
}
