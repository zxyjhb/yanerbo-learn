package com.yanerbo.learn.data.search;

/**
 * @author yanerbo
 */
public class Application {

    final static int[] ARRAY = new int[]{1, 2, 7, 8, 9, 10, 22, 22, 22, 22, 22, 40, 60, 73, 81, 82, 86, 90, 93, 95};

    public static void main(String[] args) {
        find(new BinarySearch());
        findFirst(new BinarySearch());
        findLast(new BinarySearch());
        findGeFirst(new BinarySearch());
        findLeLast(new BinarySearch());
    }

    private static void find(Search search) {
        System.out.println("#########find############");
        System.out.println(search.find(ARRAY, 0));
        System.out.println(search.find(ARRAY, 2));
        System.out.println(search.find(ARRAY, 10));
        System.out.println(search.find(ARRAY, 22));
        System.out.println(search.find(ARRAY, 73));
        System.out.println(search.find(ARRAY, 90));
    }

    private static void findFirst(Search search) {
        System.out.println("#########findFirst########");
        System.out.println(search.findFirst(ARRAY, 0));
        System.out.println(search.findFirst(ARRAY, 2));
        System.out.println(search.findFirst(ARRAY, 10));
        System.out.println(search.findFirst(ARRAY, 22));
        System.out.println(search.findFirst(ARRAY, 73));
        System.out.println(search.findFirst(ARRAY, 90));
    }

    private static void findLast(Search search) {
        System.out.println("#########findLast#########");
        System.out.println(search.findLast(ARRAY, 0));
        System.out.println(search.findLast(ARRAY, 2));
        System.out.println(search.findLast(ARRAY, 10));
        System.out.println(search.findLast(ARRAY, 22));
        System.out.println(search.findLast(ARRAY, 73));
        System.out.println(search.findLast(ARRAY, 90));
    }


    private static void findGeFirst(Search search) {
        System.out.println("#########findGeFirst#########");
        System.out.println(search.findGeFirst(ARRAY, 0));
        System.out.println(search.findGeFirst(ARRAY, 2));
        System.out.println(search.findGeFirst(ARRAY, 10));
        System.out.println(search.findGeFirst(ARRAY, 22));
        System.out.println(search.findGeFirst(ARRAY, 73));
        System.out.println(search.findGeFirst(ARRAY, 90));
    }

    private static void findLeLast(Search search) {
        System.out.println("#########findLeLast#########");
        System.out.println(search.findLeLast(ARRAY, 0));
        System.out.println(search.findLeLast(ARRAY, 2));
        System.out.println(search.findLeLast(ARRAY, 10));
        System.out.println(search.findLeLast(ARRAY, 22));
        System.out.println(search.findLeLast(ARRAY, 73));
        System.out.println(search.findLeLast(ARRAY, 90));
    }
}
