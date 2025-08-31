package java_DSA.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InbuildExample {
public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(21);
    stack.push(2);
    stack.push(1);
    stack.push(221);
    Queue<Integer> queue = new LinkedList<>();
    queue.add(3);
    queue.add(655);
    queue.add(38);
    queue.add(35);
    queue.add(5);
    System.out.println(queue.peek());
    Deque<Integer>  deque=new ArrayDeque<>();
    deque.addAll(stack);
}
}
