package Stacks;

public class StackArrays {
    int[] arr;
    int topOfStack;

    public StackArrays(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }

    // Check if it is empty
    public boolean isEmpty() {
        if (topOfStack == -1) {
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    // Check if stack is full
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }

    // Implement a push method
    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else {
            arr[++topOfStack] = value;
            System.out.println("The value is successfully inserted");
        }
    }

    // Implement pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty, cannot pop");
            return -1;
        } else {
            int value = arr[topOfStack--];
            System.out.println("The value " + value + " is successfully popped");
            return value;
        }
    }

    // Implement peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty, cannot peek");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    // Implement deleteStack method
    public void deleteStack() {
        arr = null;
        topOfStack = -1;
        System.out.println("Stack is successfully deleted");
    }

    // Check if a word is a palindrome using stack
    public static boolean isPalindrome(String word) {
        StackArrays stack = new StackArrays(word.length());
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

}
