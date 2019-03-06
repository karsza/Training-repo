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
            last.next = last;
            last = newNode;
        }
        return true;
    }
    public boolean delete (int value){
        if (head==null){
            return false;
        }
        if ((head==last)&&(head.equals(value))) {
            head = null;
        }
        if ((head.next==last)&&(head.next.equals(value))){
            head=last;
        }
        if (head.next.equals(value)) {
            head.next = head.next.next;
        }
        if (head.equals(value)) {
            head.next = head;
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

    public void bubbleSort(){

    }
}


