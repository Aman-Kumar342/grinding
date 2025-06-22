import java.util.*;

public class StackDemo {
    int[] arr = new int[1000];
    int top = -1;

    public void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = x;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackDemo s = new StackDemo();
        s.push(10);
        s.push(20);
        s.push(30);
        s.printStack();
        System.out.println("Top element is: " + s.peek());
        System.out.println("Stack size is: " + s.size());
        System.out.println("Popped element is: " + s.pop());
        s.printStack();
    }
}
