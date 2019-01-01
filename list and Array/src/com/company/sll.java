package com.company;

import java.util.LinkedList;

public class sll {
    LinkedList<LinkedList<Integer>> a = new LinkedList<>();

    private class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public int data;
    Node sentinel;
    Node next;
    int size = 0;

    public sll() {
        sentinel = new Node(2, null);
        size = 0;

    }


    void addfirst(int x) {
        if (sentinel.next == null) {
            sentinel.next = new Node(x, null);
            size += 1;
        } else {
            sentinel.next = new Node(x, sentinel.next);
            size++;
        }
    }

    int sizeoflist() {
        return size;
    }

    void addatlast(int data) {
        Node p = sentinel.next;
        if (sizeoflist() == 0) {
            sentinel.next = new Node(data, null);
            size += 1;
            return;
        }
        while (p.next != null) {
            p = p.next;
        }
        Node q = new Node(data, null);
        p.next = q;
        size += 1;
    }


    void addat(int position, int data) {
        if (position > size || position < 1) {
            System.out.println("position out of bound");
            return;
        }
        Node p = sentinel.next;
        int count = 1;
        while (count < position) {
            p = p.next;
            count++;
        }
        Node q = new Node(data, null);
        q.next = p.next;
        p.next = q;
        size += 1;
    }

    void delete(int position) {
        if (position > sizeoflist() || position < 1) {
            System.out.println("index out of bound");
            return;
        }
        if (position == 1) {
            Node p = sentinel.next;
            sentinel.next = p.next;
            p.next = null;
            size -= 1;
        } else if (position == sizeoflist()) {
            Node p = sentinel.next;
            int count = 1;
            while (count < sizeoflist() - 1) {
                p = p.next;
                count += 1;
            }
            p.next = null;
            size = -1;
        } else {
            int count = 1;
            Node p = sentinel.next;
            while (count < position - 1) {
                p = p.next;
                count += 1;
            }
            p.next = p.next.next;
            //System.out.println(q.data);
            //q.next = null;
            size = -1;
        }

    }

    void print() {
        Node p = sentinel.next;
        int count = 0;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
            count++;
        }
    }

    public static void main(String args[]) {
        sll obj = new sll();
        obj.addatlast(0);
        obj.addatlast(1);
        obj.addatlast(2);
        obj.addatlast(3);
        obj.addfirst(44);
        System.out.println(obj.sizeoflist());
        obj.print();
        obj.addat(8, 9);
        System.out.println("_______");
        obj.print();
        System.out.println("_______");
        obj.delete(2);
        System.out.println("_____");
        obj.print();


    }

}
