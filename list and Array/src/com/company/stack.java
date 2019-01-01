package com.company;

public class stack {
    class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            next = null;
        }
    }
    Node sentinel = new Node(66);
    void add (int data) {
        if (sentinel.next == null) {
            sentinel.next = new Node(data);
        }
        else {
            Node q = sentinel.next;
            while(q.next != null) {
                q = q.next;
            }
            q.next = new Node(data);
        }
    }
    void delete() {
        Node p = sentinel.next;
        Node q = sentinel;
        if(sentinel.next == null) {
            System.out.println("Underflow");
            return;
        } else {
            while(p.next != null) {
                p = p.next;
                q = q.next;
            }
            q.next = null;
        }
    }
    void print() {
        if (sentinel.next == null) {
            System.out.println("Underflow");
            return;
        } else {
            Node p = sentinel.next;
            while(p != null) {
                System.out.println(p.data);
                p = p.next;
            }
        }
    }
    public static void main (String[] args) {
        stack ob = new stack();
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.print();
        System.out.println();
        System.out.println();
        ob.delete();
        ob.print();
        System.out.println();
        System.out.println();
        ob.delete();
        ob.print();
        System.out.println();
        System.out.println();
        ob.delete();
        ob.print();
        System.out.println();
        System.out.println();
        ob.delete();
        ob.print();
    }
}
