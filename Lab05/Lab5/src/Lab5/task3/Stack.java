package Lab5.task3;

public class Stack {
    private int[] stack;
    private int stackPointer;

    public Stack(int size) {
        this.stack = new int[size];
        this.stackPointer = -1;
    }

    public void push(int value) {
        if (this.stackPointer + 1 < this.stack.length) {
            this.stack[++this.stackPointer] = value;
        }
    }

    public int pop() {
        if (this.stackPointer < 0) {
            return -1;
        } else {
            return this.stack[this.stackPointer--];
        }
    }
}