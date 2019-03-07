package com.company;

import java.util.Objects;

public class List {
    Node head;
    Node last;

    public List add (Node newNode){
        if (head==null) {
            head = newNode;
            last = head;
        }
        else {
            last.next = newNode;
            last = newNode;
        }
        return this;
    }
    public boolean prepend (Node newNode){
        if (head == null){
            head = newNode;
            last = head;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        return true;
    }
    public boolean append (Node newNode){
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
    public boolean delete (int toBeDeleted) {

        Node current = head;
        while (current!=null) {
            if (current.next != null)
                if (current.next.value == toBeDeleted) {
                    current.next = current.next.next;
                }
                current = current.next;
        }
        if (head.value == toBeDeleted) {
            head = head.next;
        }
        return true;
    }
    public void bubbleSort(List list){
        if (list!=null) {
            Node current = head;
            boolean swap = true;
            while((swap==true)){
                swap = false;
                if (current.value > current.next.value) {
                    current.value = current.value + current.next.value;
                    current.next.value = current.value - current.next.value;
                    current.value = current.value - current.next.value;
                    swap = true;
                }
                if (current.next!=null)
                    current = current.next;
            }

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof List)) return false;
        List list = (List) o;
        Node list1;
        list1 = this.head;
        Node list2;
        list2 = list.head;
        while(list1!=null&&list2!=null) {
            if (list1.value!=list2.value)
                return false;
            if (list1.next == null && list2.next != null)
                return false;
            if (list1.next != null && list2.next == null)
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

    @Override
    public String toString() {
        return "List{" +
                "head= " + head + head.next;
    }
    public void printList (){
        Node currentNode = this.head;
        System.out.println("List: ");
        while (currentNode!=null){
            System.out.println(currentNode.value);
            currentNode=currentNode.next;
        }
    }


}


