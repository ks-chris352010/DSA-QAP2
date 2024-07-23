package Stacks;

public class Main {
    public static void main(String[] args) {
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        stackArrays.isEmpty();
        stackArrays.isFull();
        stackArrays.pop();
        stackArrays.peek();
        stackArrays.deleteStack();

        // Check palindrome
        String word = "racecar";
        System.out.println("Is " + word + " a palindrome? " + StackArrays.isPalindrome(word));
    }
}
