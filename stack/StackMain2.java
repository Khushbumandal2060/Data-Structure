public class StackMain2 {
    public static void main(String[] args) {
        // Provide a size for the stack
        Stack2 newStack = new Stack2(5); // Create a stack with size 5
        
        // Push elements into the stack
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);

        // Display the stack
        System.out.println("Top element is: " + newStack.peek());
    }
}
