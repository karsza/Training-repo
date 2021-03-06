package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    void equals(){
        List list1 = new List();
        list1.head = new Node(1);
        list1.head.next = new Node(2);
        list1.head.next.next = new Node(3);

        List list2 = new List();
        list2.head = new Node(1);
        list2.head.next = new Node(2);
        list2.head.next.next = new Node(3);

        assertTrue(list1.equals(list2));
        assertTrue(list2.equals(list1));

        assertEquals(list1,list2);
        assertEquals(list2,list1);

        list1.head.value = 2;

        assertNotEquals(list1,list2);
        assertNotEquals(list2,list1);
    }
    @Test
    void equalsOfTwoEmptyLists(){
        List list1 = new List();
        List list2 = new List();

        assertEquals(list1,list2);
    }
    @Test
    void add_simple() {
        List list1 = new List();
        list1.add(new Node(1));
        List list2 = new List();
        list2.add(new Node(2));

        //assertFalse((list1.equals(list2)),"are equal");
        assertNotEquals(list1,list2);
    }
    @Test
    void prepend(){
        List list1 = new List();
        list1.add(new Node(5));
        list1.prepend(new Node(1));

        List expected = new List();
        expected.add(new Node(1));
        expected.add(new Node(5));

        assertEquals(expected,list1);
    }
    @Test
    void prependToEmptyList(){
        List list1 = new List();
        list1.prepend(new Node(3));

        List expected = new List();
        expected.add(new Node(3));

        assertEquals(expected,list1);
    }
    @Test
    void append(){
        List list = new List();
        list.add(new Node(4)).add(new Node(5));
        List expected = new List();
        list.append(new Node(6));
        expected.add(new Node(4)).add(new Node(5)).add(new Node(6));

        assertEquals(expected,list);
    }
    @Test
    void delete(){
        List list1 = new List();
        list1.add(new Node(3));
        list1.add(new Node (33));
        list1.add(new Node (333));
        list1.delete(33);
        List expected = new List();
        expected.add(new Node(3));
        expected.add(new Node(333));

        assertEquals(expected,list1);
    }
    @Test
    void deleteFrom1elementList() {
        List list1 = new List();
        list1.add(new Node(11));
        List expected = new List();

        assertEquals(list1,expected);
    }
    @Test
    void deleteFirst(){
        List list1 = new List();
        list1.add(new Node(33)).add(new Node (33)).add(new Node (333));
        list1.delete(33);
        List expected = new List();
        expected.add(new Node(333));

        assertEquals(list1,expected);
    }
    @Test
    void deleteAll(){
        List list1 = new List();
        list1.add(new Node(2)).add(new Node(2)).add(new Node (2));
        list1.delete(2);
        List expected = new List();

        assertEquals(expected,list1);
    }

    @Test
    void deleteLast(){
        List list1 = new List();
        list1.add(new Node(2)).add(new Node(2)).add(new Node (21));
        list1.delete(21);
        List expected = new List();
        expected.add(new Node(2)).add(new Node(2));

        assertEquals(expected,list1);
    }
    @Test
    void bubbleSort(){
        List list = new List();
        list.add(new Node(3)).add(new Node(2)).add(new Node(1));

        List expected = new List();
        expected.add(new Node(1)).add(new Node(2)).add(new Node(3));

        list.bubbleSort(list);
        assertEquals(expected,list);
    }
    @Test
    void bubbleSortWithReferences(){
        List list = new List();
        list.add(new Node(3)).add(new Node(2)).add(new Node(1));

        List expected = new List();
        expected.add(new Node(1)).add(new Node(2)).add(new Node(3));

        list.bubbleSortWithReferences(list);
        assertEquals(expected,list);
    }
    @Test
    void bubbleSortWhen2elementList(){
        List list = new List();
        list.add(new Node(5)).add(new Node(1));

        List expected = new List();
        expected.add(new Node(1)).add(new Node(5));

        list.bubbleSort(list);
        assertEquals(expected,list);

    }
    @Test
    void bubbleSortWhenNotSwappingFirst() {
        List list = new List();
        list.add(new Node(1)).add(new Node(3)).add(new Node(2));

        List expected = new List();
        expected.add(new Node(1)).add(new Node(2)).add(new Node(3));

        list.bubbleSort(list);
        assertEquals(expected, list);
    }
//    @Test
//    void bubbleSortWhenEmptyList(){
//        List list = new List();
//        list.bubbleSort(list);
//        List expected = new List();
//        assertEquals(expected,list);
//    }
//

}