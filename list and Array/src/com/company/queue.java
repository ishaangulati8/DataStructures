package com.company;

public class queue {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node sentinel = new Node(66);

    void addfirst(int data) {
        if (sentinel.next == null) {
            sentinel.next = new Node(data);
        } else {
            Node p = new Node(data);
            p.next = sentinel.next;
            sentinel.next = p;
        }

    }

    void delete() {
        sentinel.next = sentinel.next.next;
    }

    void print() {
        Node p = sentinel.next;
        while (p.next != null) {
            System.out.println(p.data);
        }
    }
    public static void main(String args[]) {
        queue ob = new queue();

    }
}
