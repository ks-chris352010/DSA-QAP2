package LinkedListStacks;

public class StackLinkedList {
    Node top;

    public StackLinkedList() {
        this.top = null;
        System.out.println("The stack is created");
    }

    // Check if it is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Implement push method
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("The value is successfully inserted");
    }

    // Implement pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty, cannot pop");
            return -1;
        } else {
            int value = top.value;
            top = top.next;
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
            return top.value;
        }
    }

    // Implement deleteStack method
    public void deleteStack() {
        top = null;
        System.out.println("Stack is successfully deleted");
    }
}
