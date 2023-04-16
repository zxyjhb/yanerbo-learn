package com.yanerbo.learn.data.sorted;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        sort(new BubbleSort());
    }

    private static void sort(Sort sort) {
        int[] data = {10, 3, 5, 2, 8, 7, 4, 1, 6, 9};
        System.out.println(Arrays.toString(sort.sort(data)));
    }
}
