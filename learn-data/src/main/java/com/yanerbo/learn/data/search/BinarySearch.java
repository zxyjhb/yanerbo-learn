package com.yanerbo.learn.data.search;


/**
 * @author yanerbo
 */
public class BinarySearch implements Search {

    public int find(int[] array, int data) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (array[mid] == data) {
                return mid;
            } else if (array[mid] < data) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int findFirst(int[] array, int data) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            //算法优化版，可以减少次数
            if (array[mid] == data) {
                if (mid == 0 || array[mid - 1] != data) {
                    return mid;
                } else {
                    high = mid - 1;
                }
//                if (low == mid) {
//                    return mid;
//                }
//                high = mid;
            } else if (array[mid] < data) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int findLast(int[] array, int data) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (array[mid] == data) {
                //算法优化版，可以减少次数
                if (mid == array.length - 1 || array[mid + 1] != data) {
                    return mid;
                } else {
                    low = mid + 1;
                }
//                if (low == mid) {
//                    return mid;
//                }
//                low = mid;
            } else if (array[mid] < data) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int findGeFirst(int[] array, int data) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (array[mid] >= data) {
                if (mid == 0 || array[mid - 1] < data) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
            if (array[mid] < data) {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int findLeLast(int[] array, int data) {

        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (array[mid] <= data) {
                if (mid == 0 || array[mid + 1] > data) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
            if (array[mid] > data) {
                high = mid - 1;
            }
        }
        return -1;
    }
}