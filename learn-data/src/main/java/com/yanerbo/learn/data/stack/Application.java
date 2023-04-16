package com.yanerbo.learn.data.stack;


import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        pop(new ArrayStack());
        push(new ArrayStack());
    }

    private static void push(Stack stack) {
        System.out.println("############push#############");
        pop(stack);
        for (int i = 0; i < 10; i++) {
            stack.push();
            System.out.println(Arrays.toString(stack.toArray()));
        }
    }

    private static void pop(Stack stack) {
        System.out.println("############pop###############");
        stack.init(6);
        System.out.println(Arrays.toString(stack.toArray()));
        stack.pop("001");
        System.out.println(Arrays.toString(stack.toArray()));
        stack.pop("002");
        System.out.println(Arrays.toString(stack.toArray()));
        stack.pop("003");
        System.out.println(Arrays.toString(stack.toArray()));
        stack.pop("004");
        System.out.println(Arrays.toString(stack.toArray()));
        stack.pop("005");
        System.out.println(Arrays.toString(stack.toArray()));
        stack.pop("006");
        System.out.println(Arrays.toString(stack.toArray()));
        stack.pop("007");
        System.out.println(Arrays.toString(stack.toArray()));

    }

}
