package com.yanerbo.learn.data.linked;

public class Application {


    public static void main(String[] args) {

        Linked linked = new SingletonLinked();
        linked.add("001");
        linked.add("002");
        linked.add("003");
        linked.add("004");
        linked.add("005");
    }
}
