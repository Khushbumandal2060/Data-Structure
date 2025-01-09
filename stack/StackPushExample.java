import java.util.Stack;
public class StackPushExample {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack elements after push operations:");
        System.out.println(stack);
    }
}