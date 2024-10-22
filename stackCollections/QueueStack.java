package stackCollections;

import java.util.Scanner;
import java.util.Stack;

public class QueueStack {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int data) {
        stack1.push(data);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueStack queue = new QueueStack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements to enqueue:");
        int n = scanner.nextInt();
        
        System.out.println("Enqueueing elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            queue.enqueue(data);
            System.out.println(data + " enqueued");
        }
        System.out.println("Peek:"+queue.peek()); 
        System.out.println("Dequeueing elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue() + " dequeued");
        }

        scanner.close();
    }
}
