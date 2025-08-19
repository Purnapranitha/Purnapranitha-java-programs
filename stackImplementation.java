import java.util.Stack;
public class stackImplementation{
    public static void main(String []args){
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(13);
        stack.push(9);
        stack.push(100);
        System.out.println("top elements"+stack.peek());
        System.out.println("popped element is"+stack.pop());
        System.out.println("top elements"+stack.peek());
    }
}
