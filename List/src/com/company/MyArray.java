package com.company;

public class MyArray {
    public static int[] bubbleSort(int[] list) {

        for (int j = 0; j < list.length; j++) {
            for (int i = 0; i < list.length - 1; i++) {
//                int temp;
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
        return list;
    }

    public static void bubbleSortVoid(int[] list) {

        for (int j = 0; j < list.length; j++) {
            for (int i = 0; i < list.length - 1; i++) {
//                int temp;
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }


    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j;
            for (j = i; j > 0 && list[j - 1] > temp; j--) {
                list[j] = list[j - 1];
            }
            list[j]=temp;
        }
        return list;
    }


    public void bubbleSortX(int[] list){

        for (int j=0;j<list.length;j++){
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i+1]) {
                    int temp = list[i];
                    list[i]=list[i+1];
                    list[i+1] = temp;
                }
            }
        }
    }

}
