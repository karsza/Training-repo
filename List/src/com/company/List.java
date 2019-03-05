package com.company;

import java.util.Objects;

public class List {
    Node head;
    Node last;

    public boolean add (Node newNode){
        if (head==null) {
            head = newNode;
            last = head;
        }
        else {
            last.next = newNode;
            last = newNode;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof List)) return false;
        List list = (List) o;
        Node list1;
        list1 = this.head;
        Node list2;
        list2 = this.head;
        while(true) {
            if (list1.next == null && list2.next != null)
                return false;
            if (list1.next != null && list2.next == null)
                return false;
            if (list1.next == null && list2.next == null)
                return true;
            if (list1.value!=list2.value)
                return false;
            else {
                list1=list1.next;
                list2=list2.next;
            }
        }
        return true;

    }

    @Override
    public int hashCode() {

        return Objects.hash(head, last);
    }
}


