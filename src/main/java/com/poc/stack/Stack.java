package com.poc.stack;

public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
    }

    //push the elements to the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow !");
            return;
        } else
            stackArray[top++] = value;
        System.out.println(value + " push into the stack");
    }

    //pop the elements from the stack
    public int pop() {
        int poppedElements;
        if (top == -1) {
            System.out.println("Stack Underflow !");
            return -1;
        } else
            poppedElements = stackArray[top--];
        System.out.println(poppedElements + " Popped from the stack");
        return poppedElements;
    }

    //peek the top element of the stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    //check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }


    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.top);
        stack.pop();
    }
}
