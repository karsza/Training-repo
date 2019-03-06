package com.company;

public class Node {
    int value;
    Node next;

    @Override
    public String toString() {
        return "Node{" + value + next + "}";
    }

    public Node(int value) {
        this.value = value;
    }
}