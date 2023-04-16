package com.yanerbo.learn.data.stack;


public class ArrayStack implements Stack {

    private String[] stack;

    private int size;

    public boolean init(int capacity) {
        this.stack = new String[capacity];
        this.size = 0;
        return true;
    }

    public boolean pop(String data) {
        if (size == stack.length) {
            System.out.println("pop fail, stack is full");
            return false;
        }
        stack[size] = data;
        size++;
        return true;
    }

    public String push() {
        if (size == 0) {
            System.out.println("pop fail, stack is empty");
            return null;
        }
        String data = stack[size - 1];
        stack[size - 1] = null;
        size--;
        return data;
    }

    public String[] toArray() {
        return stack;
    }
}
