package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MyArrayTest {
    @Test
    public void bubbleSortX(){
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8}, MyArray.bubbleSort(new int[]{4,2,3,1,5,8,6,7}));
    }
    @Test
    public void bubbleSortX1(){
        assertArrayEquals(new int[]{1,1,1,4,4,32}, MyArray.bubbleSort(new int[]{1,32,4,1,1,4}));
    }
    @Test
    public void bubbleSortX2(){
        assertArrayEquals(new int[]{1,2}, MyArray.bubbleSort(new int[]{1,2}));
    }

    @Test
    public void insertionSort(){
        assertArrayEquals(new int[]{1,2,3,4}, MyArray.insertionSort(new int[]{4,2,3,1}));
    }

    @Test
    void bubbleSortArray(){
        int[] lista=new int[]{3,2,1,6,5,4};
        MyArray array = new MyArray();
        array.bubbleSortX(lista);

        assertArrayEquals((new int[]{1,2,3,4,5,6}),lista);
    }

    @Test
    void bubbleSortArrayVoid(){
        int[]lista=new int[]{3,2,1,6,5,4};
        MyArray.bubbleSortVoid(lista);

        assertArrayEquals(new int[]{1,2,3,4,5,6} ,lista);
    }

    @Test
    void bubbleSortArraySameNo(){
        assertArrayEquals((new int[]{1,1,2,5,12,33}),MyArray.bubbleSort(new int[]{1,2,1,33,12,5}));
    }

    @Test
    void bubbleSortArrayShort(){
        assertArrayEquals((new int[]{1,2}),MyArray.bubbleSort(new int[]{2,1}));
    }

}