package collectionFramework;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {

        Stack<String > stack = new Stack<>();

        stack.push("tony ");
        stack.push("peter ");
        stack.push("thor ");
        stack.push("hulk ");

        System.out.println(stack.peek());
       stack.pop();
        System.out.println(stack.peek());
    }
}
