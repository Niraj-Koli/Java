package Stacks;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(7);
        stack.push(21);
        stack.push(2);

        System.out.println(stack);
        System.out.println(stack.size());

        stack.pop();
        stack.pop();

        System.out.println(stack);

        System.out.println(stack.peek());
    }
}
