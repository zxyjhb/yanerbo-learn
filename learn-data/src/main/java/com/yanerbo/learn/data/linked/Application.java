package com.yanerbo.learn.data.linked;

import java.util.Arrays;

public class Application {


    public static void main(String[] args) {

        add(new SingleLinked());
        remove(new SingleLinked());

        addRandom(new SingleLinked());
        removeRandom(new SingleLinked());

        add(new DoubleLinked());
        remove(new DoubleLinked());

        addRandom(new DoubleLinked());
        removeRandom(new DoubleLinked());
    }

    private static void remove(Linked linked) {
        System.out.println("############remove#############");
        linked.remove("100");
        System.out.println(Arrays.toString(linked.toArray()));
        add(linked);
        linked.remove("003");
        System.out.println(Arrays.toString(linked.toArray()));
        linked.remove("007");
        System.out.println(Arrays.toString(linked.toArray()));
        linked.remove("000");
        System.out.println(Arrays.toString(linked.toArray()));
        linked.remove("002");
        System.out.println(Arrays.toString(linked.toArray()));
        linked.remove("001");
        System.out.println(Arrays.toString(linked.toArray()));
        linked.remove("005");
        System.out.println(Arrays.toString(linked.toArray()));
    }


    private static void removeRandom(Linked linked) {

        System.out.println("############removeRandom#######");
        linked.remove(0);
        System.out.println(Arrays.toString(linked.toArray()));
        add(linked);
        linked.remove(5);
        System.out.println(Arrays.toString(linked.toArray()));
        linked.remove(3);
        System.out.println(Arrays.toString(linked.toArray()));
        linked.remove(0);
        System.out.println(Arrays.toString(linked.toArray()));
        linked.remove(1);
        System.out.println(Arrays.toString(linked.toArray()));
    }



    private static void add(Linked linked) {

        System.out.println("############add################");
        linked.add("000");
        System.out.println(Arrays.toString(linked.toArray()));
        linked.add("001");
        System.out.println(Arrays.toString(linked.toArray()));
        linked.add("002");
        System.out.println(Arrays.toString(linked.toArray()));
        linked.add("003");
        System.out.println(Arrays.toString(linked.toArray()));
        linked.add("004");
        System.out.println(Arrays.toString(linked.toArray()));
        linked.add("005");
        System.out.println(Arrays.toString(linked.toArray()));
    }

    private static void addRandom(Linked linked) {

        System.out.println("############addRandom##########");
        linked.add("000", 0);
        System.out.println(Arrays.toString(linked.toArray()));
        linked.add("100", 0);
        System.out.println(Arrays.toString(linked.toArray()));
        linked.add("101", 1);
        System.out.println(Arrays.toString(linked.toArray()));
        linked.add("102", 2);
        System.out.println(Arrays.toString(linked.toArray()));
        linked.add("103", 3);
        System.out.println(Arrays.toString(linked.toArray()));
        linked.add("104", 4);
        System.out.println(Arrays.toString(linked.toArray()));
        linked.add("105", 5);
        System.out.println(Arrays.toString(linked.toArray()));
    }
}
