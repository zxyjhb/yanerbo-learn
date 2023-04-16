package com.yanerbo.learn.data.queue;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        enqueue(new ArrayQueue());
        dequeue(new ArrayQueue());

        enqueue(new PriorityArrayQueue());
        dequeue(new PriorityArrayQueue());

        enqueue(new LinkedQueue());
        dequeue(new LinkedQueue());
    }

    private static void enqueue(Queue queue) {
        System.out.println("############enqueue###########");
        queue.enqueue("001");
        System.out.println(Arrays.toString(queue.toArray()));
        queue.enqueue("002");
        System.out.println(Arrays.toString(queue.toArray()));
        queue.enqueue("003");
        System.out.println(Arrays.toString(queue.toArray()));
        queue.enqueue("004");
        System.out.println(Arrays.toString(queue.toArray()));
        queue.enqueue("005");
        System.out.println(Arrays.toString(queue.toArray()));
        queue.enqueue("006");
        System.out.println(Arrays.toString(queue.toArray()));
        queue.enqueue("007");
        System.out.println(Arrays.toString(queue.toArray()));
        queue.enqueue("008");
        System.out.println(Arrays.toString(queue.toArray()));
    }

    private static void dequeue(Queue queue) {
        System.out.println("############dequeue###########");
        queue.dequeue();
        System.out.println(Arrays.toString(queue.toArray()));
        queue.enqueue("001");
        queue.enqueue("002");
        System.out.println(Arrays.toString(queue.toArray()));
        queue.dequeue();
        System.out.println(Arrays.toString(queue.toArray()));
        queue.enqueue("003");
        queue.enqueue("004");
        System.out.println(Arrays.toString(queue.toArray()));
        queue.dequeue();
        System.out.println(Arrays.toString(queue.toArray()));
        queue.enqueue("001");
        System.out.println(Arrays.toString(queue.toArray()));
        queue.dequeue();
        System.out.println(Arrays.toString(queue.toArray()));
        queue.dequeue();
        System.out.println(Arrays.toString(queue.toArray()));
        queue.dequeue();
        System.out.println(Arrays.toString(queue.toArray()));
        queue.dequeue();
        System.out.println(Arrays.toString(queue.toArray()));
    }
}
