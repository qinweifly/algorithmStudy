package com.joying.algorithm.tenclassicalsort;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        if (array.length <= 1) return;

//        for (int i = array.length - 1; i > 0; i--) {
//            for (int j = i; j < array.length - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    swap(array, j, j + 1);
//                }
//            }
//        }

        for (int i = array.length - 1; i > 0 ; i--) {
            for (int j = 0; j < i ; j++){
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }

//        for (int i = 1; i <array.length - 1; i++) {
//            for (int j = i; j < array.length - 1; j++) {
//                if (array[i] > array[j + 1]) {
//                    swap(array, i, j+1);
//                }
//            }
//        }
    }

    private static int[] swap(int[] arr, int i, int j) {
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
